package top.parak;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: ObjectTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/6
 */

public class ObjectTest {
    public static void main(String[] args) {
        int i = 1;
        i = ++i + ++i;
        System.out.println(i);
    }
}
