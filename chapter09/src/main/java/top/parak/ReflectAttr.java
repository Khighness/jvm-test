package top.parak;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: ReflectAttr <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/5
 */

class Person {
    private Long id;
    private String name;
    private Integer age;

    public Person(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class ReflectAttr {

    /**
     * 获取对象的属性名和值
     * @param obj
     * @return
     */
    public static List<String> readFieldValue(Object obj) {
        List<String> res = new ArrayList<>();
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            try {
                // 获取属性
                Field field = fields[i];
                // 打开私有访问
                field.setAccessible(true);
                // 属性名称
                String name = field.getName();
                // 属性值
                Object value = field.get(obj);
                // 添加
                res.add(name + ": " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Person person = new Person(1L, "KHighness", 19);
        readFieldValue(person).stream().forEach(System.out::println);
    }

}
