package i_AOP_TestTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TestTime {
    public void catchException(JoinPoint point, Throwable ex) {
        System.out.println(ex.getMessage());
    }

    public void testEachTime(ProceedingJoinPoint point) throws Throwable {
        long ti = System.currentTimeMillis();
        point.proceed();
        ti = System.currentTimeMillis() - ti;
        String nameString = point.getTarget().getClass().getName();
        System.out.println(nameString + "���" + point.getSignature().getName() + "������ʱ��" + ti + "����");

    }
}
