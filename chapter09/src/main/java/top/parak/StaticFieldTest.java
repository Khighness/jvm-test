package top.parak;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: StaticFielTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/6
 */

public class StaticFieldTest {

    private static byte[] arr = new byte[1024 * 1024 * 100]; // 100MB

    /**
     * -Xms200m -Xmx200m -XX:PermSize=300m -XX:MaxPermSize=300m -XX:+PrintGCDetails
     */
    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
