package top.parak;

/**
 * <p> Project: jvm-test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: IHaveNatives <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/2/4
 */

public class IHaveNatives {

    public native void Native1(int x);

    native static public long Native2();

    native synchronized private float Native3(Object obj);

    native void Native4(int[] array) throws Exception;

}
