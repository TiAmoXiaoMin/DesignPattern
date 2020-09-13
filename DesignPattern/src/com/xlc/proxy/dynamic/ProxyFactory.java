package com.xlc.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理对象 (使用JDK代理)
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * newProxyInstance(ClassLoader loader,
     *                  Class<?>[] interfaces,
     *                  InvocationHandler h)
     *
     * ClassLoader:对应的是代理对象
     * Class<?>[] interfaces:对应的是被代理对象的接口
     * InvocationHandler h:执行被代理对象的方法
     * @return
     */
    public Object getProxyInstance(){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始代理....");
                        Object invoke = method.invoke(target,args);
                        System.out.println("提交");
                        return invoke;
                    }
                });

    }
}
