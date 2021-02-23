package top.parak;

/**
 * <p> Project: Test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: StackOverflow <p>
 * <p> Description: 栈溢出 <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/10/31
 */

public class StackOverflow {
    public static void main(String[] args) {
        new StackOverflow().keep();
    }
    public void keep() {
        keep();
    }
}
