package top.parak;

/**
 * <p> Project: jvm-test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: SychronizedTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/2/22
 */

public class SynchronizedTest {
    public void f() {
        Object obj = new Object();
        synchronized(obj) {
            System.out.println(obj);
        }
    }
}
