package top.parak;

import java.util.ArrayList;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: GCUseTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/22
 */

public class GCUseTest {
    /**
     * -XX:+PrintCommandLineFlags
     * -XX:+UseSerialGC           新生代Serial GC，老年代Serial Old GC
     * -XX:+UseParNewGC           新生代使用ParNew GC
     * -XX:+UseConcMarkSweepGC
     */
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        System.gc();
    }
}
