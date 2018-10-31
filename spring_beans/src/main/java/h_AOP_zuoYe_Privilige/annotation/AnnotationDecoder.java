package h_AOP_zuoYe_Privilige.annotation;

import java.lang.reflect.Method;

//  返回权限注解中的名字
public class AnnotationDecoder
{
    @SuppressWarnings("all")
    public static String getAnnotationContent(Class clazz, String methodName) throws Exception
    {
        Method method = clazz.getMethod(methodName, null);
        if (method.isAnnotationPresent(Privilege.class))
        {
            Privilege privilege = method.getAnnotation(Privilege.class);
            //System.out.println(privilege.name());
            return privilege.name();
        } else {
            return "null";
        }
    }
}
