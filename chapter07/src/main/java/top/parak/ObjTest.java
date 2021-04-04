package top.parak;

/**
 * @author KHighness
 * @email parakovo@gmial.com
 * @date 2021-02-27 18:28:37
 */

public class ObjTest {

    class A { }
    class a extends A { }

    class P {
        protected A f(Integer i) {
            return null;
        }
    }
    class p extends P{
        public a f(Integer i) {
            return null;
        }
    }
}

enum AccountType
{
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}

class EnumOne
{
    public static void main(String[]args)
    {
        System.out.println(AccountType.FIXED);
    }
}


class B
{
    public static B t1 = new B();
    public static B t2 = new B();
    {
        System.out.println("构造块");
    }
    static
    {
        System.out.println("静态块");
    }
    public static void main(String[] args)
    {
        char c = '\u0639';
        System.out.println(c);
        Object o = 'f';
        String s = "hur\0";
    }
}
