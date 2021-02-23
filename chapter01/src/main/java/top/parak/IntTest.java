package top.parak;

/**
 * <p> Project: Test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: IntTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/10/26
 */

public class IntTest {
    private static int a = 1;
    // prepare: a = 0 ==> initial: a = 1
    private final static int b = 2;
    // prepare: b = 2

    public static void main(String[] args) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
