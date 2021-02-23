package top.parak;

/**
 * <p> Project: jvm-test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: HeapSpaceInitial <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/2/5
 */

public class HeapSpaceInitial {
    /**
     * <ul>默认情况下</ul>
     * <li>初始内存大小=物理电脑内存大小/64/li>
     * <li>最大内存大小=物理电脑内存大小/4</li>
     * @apiNote -Xms 用来设置堆空间(年轻代+老年代)的初始内存大小
     * @apiNote -Xmx 用来设置堆空间(年轻代+老年代)的最大内存大小
     * @param args
     */
    public static void main(String[] args) {
        // 返回Java虚拟机中堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        // 返回Java虚拟机视图使用的最大堆内存量
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1034;

        System.out.println("-Xms => " + initialMemory + "M");
        System.out.println("-Xmx => " + maxMemory + "M");

        System.out.println("系统内存大小 => " + initialMemory * 64.0 / 1024 + "G");
        System.out.println("系统内存大小 => " + maxMemory * 4.0 / 1024 + "G");

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
