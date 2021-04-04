package top.partak;

import java.util.HashSet;
import java.util.Set;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.partak </p>
 * <p> FileName: StringTableMetaTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/8
 */

public class StringTableMetaTest {
    /**
     * JDK8: -XX:MetaspaceSize=6m -XX:MaxMetaspaceSize=6m -Xms6m -Xmx6m
     * @param args
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
