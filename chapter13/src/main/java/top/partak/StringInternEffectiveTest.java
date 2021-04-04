package top.partak;

import java.util.concurrent.TimeUnit;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.partak </p>
 * <p> FileName: StringInternEffectiveTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/9
 */

public class StringInternEffectiveTest {

    static final int MAX_COUNT = 1000 * 10000;
    static final String[] array = new String[MAX_COUNT];

    public static void main(String[] args) {
        Integer[] data = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            array[i] = new String(String.valueOf(data[i % data.length])); // 7290
//            array[i] = new String(String.valueOf(data[i % data.length]).intern()); // 4341
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间：" + (end - start));
        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
