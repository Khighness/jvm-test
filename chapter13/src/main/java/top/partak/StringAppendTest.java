package top.partak;

import org.junit.jupiter.api.Test;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.partak </p>
 * <p> FileName: StringAppendTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/8
 */


/**
 * 效率：StringBuilder的appendAPI >> String的字符串拼接
 * 原因：(1) StringBuilder方式自始至终只创建一个StringBuilder对象，
 *          String拼接会创建多个StringBuilder对象。
 *      (2) 使用String字符串拼接，内存中由于创建了多个StringBuilder和String对象
 *          会增加GC的频率，影响执行效率。
 * 改进：StringBuilder无参创建的数组空间是16，如果实际开发中长度大于16，则需要不断进行数组扩容。
 *      如果明确拼接后的字符串长度，在定义StringBuilder的时候即可赋予响应空间。
 */
public class StringAppendTest {

    @Test
    void test1() {
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str = str + "k";
        }
        long end = System.currentTimeMillis();
        System.out.println("String拼接花费时间：" + (end - start) + "ms"); // 3935ms
    }

    @Test
    void test2() {
        StringBuilder sb = new StringBuilder(100000);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("k");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder拼接花费时间：" + (end - start) + "ms"); // 3ms
    }
}
