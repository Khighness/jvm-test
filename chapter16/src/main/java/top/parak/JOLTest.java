package top.parak;

import org.openjdk.jol.info.ClassLayout;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: JOLTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/22
 */

public class JOLTest {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        Thread.sleep(5000);

        Object o2 = new Object();
        System.out.println(ClassLayout.parseInstance(o2).toPrintable());
//        synchronized (o) {
//            System.out.println(ClassLayout.parseInstance(o).toPrintable());
//        }
    }
}
