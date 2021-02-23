package top.parak;

/**
 * <p> Project: Test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: ClassInitTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/10/26
 */

public class ClassInitTest {

    private static int num1 = 1;

    static {
        num1 = 10;
        num2 = 20;
    }

    private static int num2 = 2; // Linking-prepare: num2 = 0 --> initial: 20 --> 2

    public ClassInitTest() {
        num1 = 100;
        int num3 = 300;
    }

    public static void main(String[] args) {
        System.out.println("num1 = " +  ClassInitTest.num1); // 10
        System.out.println("num2 = " +  ClassInitTest.num2); // 20
    }
}
