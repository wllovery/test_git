package com.wllovery.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionInvocationHandler implements InvocationHandler {
    private Object target;

    public TransactionInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //SqlSession session = null;
        Object obj = null;
        try{
            //session = SqlSessionUtil.getSqlSession();
            obj = method.invoke(target, args);
            //session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //SqlSessionUtil.myClose(session);
            System.out.println("=================================");
        }
        return obj;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this );
    }
}
