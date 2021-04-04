package top.partak;

import org.junit.jupiter.api.Test;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.partak </p>
 * <p> FileName: StringTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/8
 */

public class StringTest {

    @Test
    void test1() {
        String s1 = "abc";
        String s2 = s1.replace("a", "k");
        System.out.println(s1); // abs
        System.out.println(s2); // kbc
    }

    @Test
    void test2() {
        String str = "";
        String[] split = str.split("");
        System.out.println(str.length());  // 0
        System.out.println(split.length);  // 1
        for (String s : split) System.out.println(s.equals("")); // true
    }

    @Test
    void test3() {
        // debug查看内存中的String数量
        // 证明字符串常量池不放重复字符串
        System.out.println();             // 6046
        System.out.println("KHighness");  // 6046
        System.out.println("UnknownK");   // 6047
        System.out.println("KHighness");  // 6048
        System.out.println("UnknownK");   // 6048
    }

    @Test
    void test4() {
        String s1 = "a" + "b" + "c";         // 编译器优化，拼接结果存放在字符串常量池中
        String s2 = "abc";                   // 字符串常量池中不存放相同的字符串
        System.out.println(s1 ==s2);         // true
        System.out.println(s1.equals(s2));   // true
    }

    @Test
    void test5() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;                 // String的字符串拼接的地城
        System.out.println(s3 == s4);        // false
    }

    @Test
    void test6() {
        String s1 = "boot";
        String s2 = "cloud";
        String s3 = "boot" + "cloud";        // 字符串拼接结果放在字符串常量池中
        String s4 = s1 + "cloud";            // 带变量的拼接结果放在堆中
        String s5 = "boot" + s2;             // 带变量的拼接结果放在堆中
        String s6 = s1 + s2;                 // 带变量的拼接结果放在堆中
        System.out.println(s3 == s4);        // flase
        System.out.println(s3 == s5);        // flase
        System.out.println(s3 == s6);        // flase
        System.out.println(s4 == s5);        // flase
        // intern(): 判断字符串常量池中是否存在"bootcloud"值
        // 如果存在，则返回字符串常量池中"bootcloud"的地址；
        // 如果不存在，则在字符串常量池中添加一次"bootcloud"，并返回此对象的地址
        String s7 = s5.intern();
        System.out.println(s3 == s7);        // true
    }

    @Test
    void test7() {
        final String s1 = "c";               // 常量
        final String s2 = "d";               // 常量
        String s3 = "cd";
        String s4 = s1 + s2;                 // 拼接符合左右两边都是字符串常量或者常量引用，仍然使用编译期优化
        System.out.println(s3 == s4);        // true
    }

    @Test
    void test8() {
        String s1= null; ;
        String s2 = s1 + "hello";
        System.out.println(s2);              // nullhello
    }

}
