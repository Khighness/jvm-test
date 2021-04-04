package top.parak;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: CodeBlockTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/7
 */

public class CodeBlockTest {
    private static CodeBlockTest c1 = new CodeBlockTest();
    private static CodeBlockTest c2 = new CodeBlockTest();
    {
        System.out.println("构造块");
    }
    static
    {
        System.out.println("静态块");
    }
    CodeBlockTest()
    {
        System.out.println("构造函数");
    }

    public static void main(String[] args) {
        CodeBlockTest codeBlockTest = new CodeBlockTest();
    }
}
