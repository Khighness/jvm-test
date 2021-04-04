package top.parak;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: BufferTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/7
 */

public class BufferTest {

    private static final int BUFFER = 1024 * 1024 * 1024;

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(BUFFER);
        System.out.println("直接内存分配完毕");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("直接内存开始释放");
        byteBuffer = null;
        System.gc();
    }
}
