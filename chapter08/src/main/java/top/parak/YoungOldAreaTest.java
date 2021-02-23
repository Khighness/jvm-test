package top.parak;

import java.util.UUID;

/**
 * <p> Project: jvm-test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: YoungOldAreaTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/2/11
 */

public class YoungOldAreaTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024 * 1024 * 20]; // 20M
        for (int i = 1; i<=3; i++) {
            System.out.println(UUID.randomUUID().toString());
        }
    }
}
