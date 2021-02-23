package top.parak;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> Project: jvm-test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: GCTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/2/10
 */

public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "KHighness";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("遍历次数为："  + i);
        }
    }
}
