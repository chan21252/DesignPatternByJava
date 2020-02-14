package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] classArr = target.getClass().getInterfaces();
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始动态代理...");
                Object result = method.invoke(target, args);
                System.out.println("结束动态代理...");
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, classArr, handler);
    }
}
