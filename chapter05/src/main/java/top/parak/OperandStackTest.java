package top.parak;

/**
 * <p> Project: jvm-test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: OperandStackTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/1/31
 */

public class OperandStackTest {

    public void testAaaOperation() {
        // byte、short、char、boolean：都以int型保存
        byte i = 15;
        int j = 8;
        int k = i + j;

        // int m = 800;
    }

    public int getSum() {
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum() {
        // 获取上一个栈帧返回的结果，并保存在操作数栈中
        int i = getSum();
        int j = 10;
    }

    public void add() {
        // 第一类问题
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        // 第二类问题
        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;

        // 第三类问题
        int i7 = 10;
        i7 = i7++;

        int i8 = 10;
        i8 = ++i8;

        // 第四类问题
        int i9 = 10;
        int i10 = i9++ + +i9;
    }

}
