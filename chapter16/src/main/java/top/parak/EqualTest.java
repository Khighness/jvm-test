package top.parak;

import java.io.FileWriter;
import java.io.IOException;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: EqualTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/22
 */

public class EqualTest {

    public static void i(int a) {
        a += 10;
    }

    public static void main(String[] args) {
        int a = 10;
        i(a);
        System.out.println(a);
    }
}
