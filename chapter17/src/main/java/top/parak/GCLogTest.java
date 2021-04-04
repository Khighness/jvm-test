package top.parak;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: GCLogTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/22
 */

public class GCLogTest {

    private static final int ONE_MB = 1024 * 1024;

    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * ONE_MB];
        allocation2 = new byte[2 * ONE_MB];
        allocation3 = new byte[2 * ONE_MB];
        allocation4 = new byte[4 * ONE_MB];
    }

    /**
     * -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC -Xloggc:./logs/gc.log
     */
    public static void main(String[] args) {
        testAllocation();
    }
}
