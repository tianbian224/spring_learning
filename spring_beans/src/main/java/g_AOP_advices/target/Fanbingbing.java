package g_AOP_advices.target;

//  被代理类
public class Fanbingbing {
    //切入点
    public int sing(float money) {
        System.out.println("I am sing :" + money);
        int d = 0;
        //d = 100 / d;
        for (int i = 0; i < 1000; i++) {
            d += 10;
        }
        return d;
    }

    public String dance(float money) {
        System.out.println("I am dance :" + money);
        return money + "����";
    }

    //
    public String show(float money) {
        System.out.println("I am XX :" + money);
        int c = 100 / 0;
        return money + 10000000 + "";
    }

    public String drink(String wine) {
        System.out.println("drink wine" + wine);
        try {
            int d = 100 / 0;
        } catch (RuntimeException c) {
            throw new RuntimeException("fangfa xinxi ");
        }
        return "fan hui zhi";

    }
}
