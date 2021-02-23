package top.parak;

/**
 * <p> Project: jvm-test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: Lambda <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2021/2/2
 */

@FunctionalInterface
interface Func {
    boolean func(String var);
}

public class Lambda {

    public void lambda(Func func) {
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = s -> {
            return true;
        };

        lambda.lambda(func);
        lambda.lambda(s -> {
            return true;
        });
    }
}
