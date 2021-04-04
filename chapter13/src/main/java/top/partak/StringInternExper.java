package top.partak;

import org.junit.jupiter.api.Test;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.partak </p>
 * <p> FileName: StringInternExper <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/9
 */

public class StringInternExper {
    public static void main(String[] args) {
        String s1 = new String("1") + new String("1");
        // 在堆中创建"11"
        String s2 = "11";
        // 在常量池中创建"11"
        s1.intern();
        // intern失效
        String s3 = s1.intern();
        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // true
    }

    @Test
    void test1() {
        String s1 = new String("1") + new String("1");
        String s2 = s1.intern();
        System.out.println(s1 == "11"); // false
        System.out.println(s2 == "11"); // true
    }
}
