package top.parak;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: RefCountGC <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/9
 */

public class RefCountGC {
    private byte[] bigSize = new byte[5 * 1024 * 1024]; // 5MB
    Object reference = null;

    public static void main(String[] args) {
        RefCountGC obj1 = new RefCountGC();
        RefCountGC obj2 = new RefCountGC();
        obj1.reference = obj2;
        obj2.reference = obj1;
        obj1 = null;
        obj2 = null;
        System.gc();
        // 未GC: PSYoungGen      total 75776K, used 16754K
        // 用GC: PSYoungGen      total 75776K, used 1951K
    }
}
