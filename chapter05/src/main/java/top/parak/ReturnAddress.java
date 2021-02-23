package top.parak;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 * <p> Project: jvm-test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: ReturnAddress <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/2/4
 */

public class ReturnAddress {

    public static void main(String[] args) throws IOException {
        ReturnAddress returnAddress = new ReturnAddress();
        returnAddress.method1();
    }

    public void method1() throws IOException {
        FileReader fileReader = new FileReader("D:\\Java\\Test\\K1.txt");
        char[] buffer = new char[1024];
        int len;
        while ((len = fileReader.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        fileReader.close();
    }

    public boolean method() {
        return false;
    }

    public byte methodByte() {
        return 0;
    }

    public short methodShort() {
        return 0;
    }

    public char methodChar() {
        return '0';
    }

    public int methodInt() {
        return 0;
    }

    public long methodLong() {
        return 0L;
    }

    public float methodFloat() {
        return 0.0f;
    }

    public String methodString() {
        return " ";
    }

    public Date methodDate() {
        return new Date();
    }


}
