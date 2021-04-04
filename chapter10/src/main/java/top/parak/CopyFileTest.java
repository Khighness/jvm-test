package top.parak;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: CopyFileTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/7
 */

public class CopyFileTest {

    private static final String MOVIE_NAME = "D:/BaiduNetdiskDownload/复仇者联盟4-终局之战.mp4";
    private static final int ONE_HUNDRED_MB = 1024 * 1024 * 100;

    public static void main(String[] args) throws IOException {
        System.out.println("BIO耗时：" + inDirectBuffer(MOVIE_NAME, MOVIE_NAME + ".copy.mp4")); // 11946ms
        System.out.println("NIO耗时：" + directBuffer(MOVIE_NAME, MOVIE_NAME+ ".copy.mp4"));    // 9079ms
    }

    /**
     * BIO复制
     */
    private static long inDirectBuffer(String src, String dest) throws IOException{
        long start = System.currentTimeMillis();
        FileInputStream inputStream = new FileInputStream(src);
        FileOutputStream outputStream = new FileOutputStream(dest);
        byte[] buffer = new byte[ONE_HUNDRED_MB];
        int len = 0;
        while ((len = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }
        long end = System.currentTimeMillis();
        inputStream.close();
        outputStream.close();
        return end - start;
    }

    /**
     * NIO复制
     */
    private static long directBuffer(String src, String dest) throws IOException{
        long start = System.currentTimeMillis();
        FileChannel inChannel = new FileInputStream(src).getChannel();
        FileChannel outChannel = new FileOutputStream(dest).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(ONE_HUNDRED_MB);
        while (inChannel.read(byteBuffer) != -1) {
            byteBuffer.flip();
            outChannel.write(byteBuffer);
            byteBuffer.clear();
        }
        long end = System.currentTimeMillis();
        inChannel.close();
        outChannel.close();
        return end - start;
    }
}
