package top.parak;

/**
 * <p> Project: jvm-test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: SimpleHeap <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/2/5
 */

public class SimpleHeap {
    private int id;

    private SimpleHeap(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("My ID is " + id);
    }

    public static void main(String[] args) {
        SimpleHeap simpleHeap1 = new SimpleHeap(1);
        SimpleHeap simpleHeap2 = new SimpleHeap(2);
        int[] arr = new int[10];
        Object[] obj = new Object[10];
    }
}
