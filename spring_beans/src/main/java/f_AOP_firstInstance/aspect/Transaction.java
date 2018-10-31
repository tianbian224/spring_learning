package f_AOP_firstInstance.aspect;

// aspect：切入到主逻辑的附加功能。
public class Transaction {
    //private  方法也可以
    private void beginTransaction() {
        System.out.println("==========开启事务=========");
    }

    public void commit() {
        System.out.println("============提交============");
    }
}
