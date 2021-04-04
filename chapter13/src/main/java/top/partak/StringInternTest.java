package top.partak;

import org.junit.jupiter.api.Test;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.partak </p>
 * <p> FileName: StringInternTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/9
 */

public class StringInternTest {
    public static void main(String[] args) {
        String s1 = new String("1");
        // s1是堆空间中创建的"1"的地址
        s1.intern();
        // 调用此方法之前，字符串常量池已经存在了"1"
        String s2 = "1";
        // s2是字符串常量池中"1"的地址
        System.out.println(s1 == s2);
        // JDK1.6: false; JDK1.7/1.8: false

        String s3 = new String("1") + new String("1");
        // s3是StringBuilder的toString方法new String("11")在堆空间中的地址，
        // 但是toString的new String并没有把"11"放入字符串常量池
        s3.intern();
        // jdk1.6会复制一个堆空间中的"11"对象，即创建新的对象，放入字符串常量池（全新地址）
        // jdk1.7/1.8会复制一个堆空间中的"11"对象的引用地址，放入字符串常量池（引用地址）
        String s4 = "11";
        // s4是字符串常量池中"11"的对象地址
        System.out.println(s3 == s4);
        // JDK1.6: false; JDK1.7/1.8: true
    }
}
