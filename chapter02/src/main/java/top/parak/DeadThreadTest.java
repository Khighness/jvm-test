package top.parak;

import java.util.concurrent.TimeUnit;

/**
 * <p> Project: Test </P>
 * <p> Package: chapter01 </p>
 * <p> FileName: DeadThreadTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/10/27
 */

public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread deadThread = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };

        Thread thread1 = new Thread(r, "线程1");
        Thread thread2 = new Thread(r, "线程2");

        thread1.start();
        thread2.start();
    }
}

class DeadThread {
    static {
        if (true) {
            System.out.println(Thread.currentThread().getName() + "初始化当前类");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("初始化结束");
        }
    }
}
