package top.parak;

import java.util.Date;

/**
 * <p> Project: Test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: LocalVariablesTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/10/31
 */

public class LocalVariablesTest {

    private int count = 0;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.testStatic();
    }

    public LocalVariablesTest() {
        this.count = 1;
    }

    public static void testStatic() {
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int count = 10;
        System.out.println(date + " " + count);
    }

    public void test1() {
        Date date = new Date();
        String name = "Khighness";
        test2(date, name);
        System.out.println(date + " " + name);
    }

    public String test2(Date var1, String var2) {
        return var1 + var2;
    }

    public void test3() {
        this.count++;
    }

    public void test4() {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        // 变量c使用之前已经销毁的变量b占据的slot的位置
        int c = a + 1;
    }

    public void test5() {
        int num;

    }

}
