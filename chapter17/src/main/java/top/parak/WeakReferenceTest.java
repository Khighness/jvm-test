package top.parak;

import java.lang.ref.WeakReference;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: WeakReferenceTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/22
 */

public class WeakReferenceTest {
    public static void main(String[] args) {
        Object obj = new Object();
        WeakReference<Object> weakReference = new WeakReference<Object>(obj);
        System.out.println(weakReference.get());
       /* 解除强引用 */
        obj = null;
        /* 主动GC */
        System.gc();
        System.out.println(weakReference.get());
    }
}
