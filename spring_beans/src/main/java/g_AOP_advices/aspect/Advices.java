package g_AOP_advices.aspect;

import com.google.common.collect.Lists;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Advices {
    private long start;

    // 前置通知
    public void beginTime(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs()[0]);// 获取目标方法的参数
        System.out.println(joinPoint.getSignature().getName());// 获取目标方法名
        System.out.println(joinPoint.getTarget().getClass());// 获取目标的类
        start = System.nanoTime();
        System.out.println("============start time " + start + "==============");

    }

    // 后置通知
    public void endTime(JoinPoint joinpoint, Object returnValues)// 形参名称和配置保持一致
    {
        long use = System.nanoTime() - start;
        System.out.println("===========spent time:" + use + "nano second============");
        System.out.println("returns:" + returnValues);

    }

    // 最终通知
    public void finalAdvice(JoinPoint joinpoint) {
        System.out.println("finall advices has executed");
    }


    // 异常通知
    public void exceptionAdvice(JoinPoint joinpoint, Throwable yichang) {
        System.out.println("lvc:exxxxxxx" + yichang.getMessage()+yichang.getClass().getName());
    }

    //环绕通知
    public int aroundAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("transaction begin===========");
        int returnValue = (Integer) point.proceed();
        System.out.println(Lists.newArrayList(returnValue, point.getArgs()));
        System.out.println("transaction commit===========");
        return returnValue + 10000000;// 修改返回值
    }
}
