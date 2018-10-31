package h_AOP_zuoYe_Privilige;

import h_AOP_zuoYe_Privilige.annotation.AnnotationDecoder;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.ArrayList;
import java.util.List;

public class QieMian {
    /**
     * 权限列表
     */
    private List<String> list = new ArrayList<String>();

    public void testPrivilege(ProceedingJoinPoint p) throws Throwable {
        boolean flag = false;
        Class target = p.getTarget().getClass();
        String methodName = p.getSignature().getName();
        String annotation = AnnotationDecoder.getAnnotationContent(target,
                methodName);
        for (String name : list) {
            if (name.equals(annotation)) {
                flag = true;
            }
        }
        if (flag) {
            p.proceed();
        } else {
            System.out.println(methodName + "don't  allowed");
        }

    }

    public void A() {
        System.out.println("aaaaaaaaa");
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
