package top.parak;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: StrongReferenceTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/22
 */
public class StrongReferenceTest {
    /**
     * -Xmx1m -Xms1m
     */
    public static void main(String[] args) {
        Object[] objs = new Object[1000 * 1000];
    }
}
