package top.parak;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: PhantomReferenceTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/22
 */

public class PhantomReferenceTest {
    public static PhantomReferenceTest obj;
    /**
     * 引用队列
     */
    public static ReferenceQueue<PhantomReferenceTest> phantomQueue = null;

    public static class CheckRefQueue extends Thread {
        @Override
        public void run() {
            while (true) {
                if (phantomQueue != null) {
                    PhantomReference<PhantomReferenceTest> objt = null;
                    try {
                        objt = (PhantomReference<PhantomReferenceTest>) phantomQueue.remove();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (objt != null) {
                        System.out.println("追踪垃圾回收过程：PhantRefernceTest实例被GC了");
                    }
                }
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类的finalize()方法");
        obj = this;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new CheckRefQueue();
        t.setDaemon(true);  // 守护线程
        t.start();

        phantomQueue = new ReferenceQueue<PhantomReferenceTest>();
        obj = new PhantomReferenceTest();
        // 构造了PhantomReference对象的虚引用，并指定了引用队列
        PhantomReference<PhantomReferenceTest> phantomRef = new PhantomReference<>(obj, phantomQueue);
        try {
            // 不可获取虚引用中的对象
            System.out.println("phantomRef.get() = " + phantomRef.get());

            // 第一次GC，由于对象可复活，并指定了引用队列
            System.out.println("=>>> 第一次GC操作");
            obj = null; // 解除强引用
            System.gc();
            Thread.sleep(1000);
            System.out.println(obj == null ? "obj == null" : "obj != null");

            System.out.println("=>>> 第二次GC");
            obj = null; // 解除强引用
            System.gc();
            Thread.sleep(1000);
            System.out.println(obj == null ? "obj == null" : "obj != null");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

}
