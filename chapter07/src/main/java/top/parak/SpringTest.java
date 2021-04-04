package top.parak;

import top.parak.controller.UserController;
import top.parak.service.UserService;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak </p>
 * <p> FileName: SpringTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/6
 */
public class SpringTest {

    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
        System.out.println(userService);
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        // 获取方法的属性
        Field serviceField = clazz.getDeclaredField("userService");
        serviceField.setAccessible(true);
        String name = serviceField.getName();
        // 拼接方法的名称
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        String setMethodName = "set" + name;
        // 将方法注入属性的对象
        Method method = clazz.getMethod(setMethodName, UserService.class);
        // 反射
        method.invoke(userController, userService);
        System.out.println(userController.getUserService());
    }

}
