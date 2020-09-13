package com.wllovery.util;

public class ServiceFactory {
    //传递张三对象，获取李四对象
    public static Object getService(Object object){
        return new TransactionInvocationHandler(object).getProxy();
    }

}
