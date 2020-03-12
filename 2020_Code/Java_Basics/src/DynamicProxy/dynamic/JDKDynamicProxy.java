package DynamicProxy.dynamic;

import DynamicProxy.MyAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author dxc
 * @Title: JDKDynamicProxy
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/5 19:07
 */
public class JDKDynamicProxy implements InvocationHandler {

    private TestDao testDao;

    //创建代理方法，建立代理对象和真实对象之间的联系,并返回代理对象
    public Object creatProxy(TestDao testDao){
        this.testDao = testDao;
        //1.类加载器
        ClassLoader cld = JDKDynamicProxy.class.getClassLoader();
        //2.被代理对象实现的接口
        Class[] clazz = testDao.getClass().getInterfaces();
        //3.使用代理类进行增强，返回代理后的对象
        return Proxy.newProxyInstance(cld,clazz,this);
    }

    /*
    * proxy是被代理对象
    * method是要被执行的方法
    * args是执行方法时所需要的参数
    * return指返回代理结果
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        MyAspect myAspect = new MyAspect();
        myAspect.check();
        myAspect.expect();
        Object obj = method.invoke(testDao,args);
        myAspect.log();
        myAspect.monitor();

        return obj;
    }
}













