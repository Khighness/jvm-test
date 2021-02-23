package top.parak;

import com.sun.net.ssl.internal.ssl.Provider;
import sun.security.ec.CurveDB;

import java.net.URL;

/**
 * <p> Project: Test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: ClassLoaderTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/10/27
 */

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoaderTest classLoaderTest = new ClassLoaderTest();
        classLoaderTest.test1();
        classLoaderTest.test2();
        classLoaderTest.test3();
    }

    public void test1() {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  // sun.misc.Launcher$AppClassLoader@18b4aac2

        // 获取其上层：扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);  // sun.misc.Launcher$ExtClassLoader@1b6d3586

        // 获取其上层：
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        System.out.println(bootStrapClassLoader);  // null

        // 对于用户自定义加载器
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);  // sun.misc.Launcher$AppClassLoader@18b4aac2

        //
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);  // null
    }

    public void test2() {
        System.out.println("===========启动类加载器===========");
        // 获取BootStrapClassLoader能够加载的api的路径
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }
        // 从上面的路径随意选择一个类，看其类加载器(引导类加载器)
        System.out.println(Provider.class.getClassLoader()); // null

        System.out.println("===========扩展类加载器===========");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }
        // 从上面的路径随意选择一个类，看其类加载器(扩展类加载器)
        System.out.println(CurveDB.class.getClassLoader());
    }

    public void test3() {
        try {
            // 1.
            ClassLoader classLoader1 = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader1);

            // 2.
            ClassLoader classLoader2 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader2);

            // 3.
            ClassLoader classLoader3 = classLoader2.getSystemClassLoader().getParent();
            System.out.println(classLoader3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
