package top.parak.controller;

import top.parak.service.UserService;

/**
 * <p> Project: jvm-test </P>
 * <p> Package: top.parak.controller </p>
 * <p> FileName: UserController <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/3/6
 */

public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
