package top.parak;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> Project: Test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: HeapOverflow <p>
 * <p> Description: 堆溢出<p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/10/31
 */

public class HeapOverflow {
    public static void main(String[] args) {
        List list = new ArrayList();
        while (true) {
            list.add(new HeapOverflow());
        }
    }
}
