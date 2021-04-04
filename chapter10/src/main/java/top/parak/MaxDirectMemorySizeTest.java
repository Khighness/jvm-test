package top.parak;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: MaxDirectMemorySizeTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/7
 */

public class MaxDirectMemorySizeTest {

    private static final long ONE_MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(ONE_MB);
        }
    }
}
