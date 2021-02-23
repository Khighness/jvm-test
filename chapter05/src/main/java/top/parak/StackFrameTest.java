package top.parak;

/**
 * <p> Project: Test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: StackFrameTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/10/31
 */

public class StackFrameTest {
    public static void main(String[] args) {
        new StackFrameTest().method1();
    }

    private int method1() {
        System.out.println("方法1开始执行...");
        int i = 1;
        System.out.println("d = " + method2());
        System.out.println("方法1即将结束...");
        return i;
    }

    private double method2() {
        System.out.println("方法2开始执行...");
        double d = 1.1;
        System.out.println("s = " + method3());
        System.out.println("方法2即将结束...");
        return d;
    }

    private String method3() {
        System.out.println("方法3开始执行...");
        String s = "KHighness";
        System.out.println("方法3即将结束...");
        return s;
    }

}
