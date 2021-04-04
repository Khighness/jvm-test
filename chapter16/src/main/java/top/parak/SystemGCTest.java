package top.parak;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: SystemGCTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/10
 */

public class SystemGCTest {

    public static void main(String[] args) {
        new SystemGCTest();
        System.gc(); // 提醒JVM执行GC
        System.runFinalization();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest 重写了finalize");
    }
}
