package top.parak;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: SoftReferenceTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/22
 */

public class SoftReferenceTest {
    /**
     * -Xmx10m -Xms10m
     */
    public static void main(String[] args) {
        /* 声明强引用 */
        Object obj = new Object();
        System.out.println(obj);
        SoftReference<Object> softReference = new SoftReference<Object>(obj);
        /* 销毁强引用 */
        obj = null;
        System.out.println(softReference.get());
        /* 主动进行GC */
        System.gc();
        System.out.println(softReference.get());

        /* 让系统资源紧张 */
        try {
            byte[] bytes = new byte[1024 * 1024 * 7]; // 7m
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(softReference.get()); // null代表已经被回收
        }
    }
}
