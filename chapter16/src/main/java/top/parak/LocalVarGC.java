package top.parak;

import java.util.LinkedList;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: LocalVarGC <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/10
 */

public class LocalVarGC {

    /**
     * 触发Minor GC没有回收对象，然后在Full GC将该对象存入old区
     */
    public void localVarGC1() {
        byte[] buffer = new byte[10 * 1024 * 1024]; // 10MB
        System.gc(); // 无法回收
    }

    /**
     * 触发Young GC的时候，已经被回收了
     */
    public void localVarGC2() {
        byte[] buffer = new byte[10 * 1024 * 1024]; // 10MB
        buffer = null;
        System.gc(); // 可以回收
    }

    /**
     * 不会回收，因为它还存放在局部变量表索引为1的槽中
     */
    public void localVarGC3() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024]; // 10MB
        }
        System.gc(); // 不会回收
    }

    /**
     * 会被回收，因为它还存放在局部变量表索引为1的槽中，但是后面定义的value把这个槽给替换了
     */
    public void localVarGC4() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024]; // 10MB
        }
        int value = 10;
        System.gc(); // 可以回收
    }

    /**
     * 回收localVarGC1中的buffer
     */
    public void localVarGC5() {
        localVarGC1();
        System.gc(); // 可以回收
    }

    public static void main(String[] args) {
        LocalVarGC localVarGC = new LocalVarGC();
        localVarGC.localVarGC5();
    }
}
