package top.parak;

/**
 * <p> Project: jvm-test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: Son <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/2/1
 */

class Father {

    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String var) {
        System.out.println("father " + var);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father 普通方法");
    }
}

public class Son extends Father {

    public Son() {
        super();
    }

    public Son(int age) {
        this();
    }

    /**
     * <p>不是重写父类的静态方法，因为静态方法不能被重写</p>
     * @param var
     */
    public static void showStatic(String var) {
        System.out.println("son  " + var);
    }

    private void showPrivate(String var) {
        System.out.println("son private " + var);
    }

    public void show() {
        showStatic("KHighness");
        super.showStatic("Good");
        showPrivate("Hello");
        super.showCommon();  // 早期绑定
        showFinal();         // 晚期绑定
    }

    public void info() {

    }

    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }

}



