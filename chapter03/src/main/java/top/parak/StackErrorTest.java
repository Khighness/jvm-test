package top.parak;

/**
 * <p> Project: Test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: StackErrorTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/10/31
 */

public class StackErrorTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }
}
