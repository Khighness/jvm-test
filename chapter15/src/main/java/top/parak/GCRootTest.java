package top.parak;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: GCRootTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/9
 */

public class GCRootTest {
    public static void main(String[] args) {
        List<Object> numList = new ArrayList<>();
        Date birth = new Date();

        for (int i = 0; i < 100; i++) {
            numList.add(String.valueOf(i));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("数据添加完毕，请操作：");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        numList = null;
        birth = null;

        System.out.println("numList、birth已经置空，请操作");
        scanner.nextLine();
        System.out.println("结束");
    }
}
