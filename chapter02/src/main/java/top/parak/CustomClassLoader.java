package top.parak;

import java.io.FileNotFoundException;

/**
 * <p> Project: Test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: CustomClassLoader <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/10/27
 */

public class CustomClassLoader extends ClassLoader{

    /**
     * 自定义类加载器逻辑
     * @param name
     * @return
     * @throws ClassNotFoundException
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath(name);
            if (result == null) {
                throw new FileNotFoundException();
            } else {
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    /**
     * @param name
     * @return
     * @deprecated
     */
    private byte[] getClassFromCustomPath(String name) {
        /* 从自定义路径中加载指定类 */
        /* 如果指定路径的字节码文件进行了加密，
           则需要在此方法中进行解密操作 */
        return null;
    }

    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        try {
            Class<?> clazz = Class.forName("One", true, customClassLoader);
            Object object = clazz.newInstance();
            System.out.println(object.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
