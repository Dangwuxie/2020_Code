package dynamic.jdk;

import aspect.MyAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author dxc
 * @Title: JDKDynamicProxy
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/1 10:35
 */
public class JDKDynamicProxy implements InvocationHandler {

    private TestDao testDao;

    public Object createProxy(TestDao testDao){
        this.testDao = testDao;
        //1.类加载器
        ClassLoader cld = JDKDynamicProxy.class.getClassLoader();
        //2.被代理对象实现的所有接口
        Class[] clazz = testDao.getClass().getInterfaces();
        //3.使用代理类进行增强，返回代理后的对象
        return Proxy.newProxyInstance( cld,clazz,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //创建一个切面
        MyAspect myAspect = new MyAspect();
        //前增强
        myAspect.check();
        myAspect.expect();
        Object obj = method.invoke(testDao,args);
        //后增强
        myAspect.log();
        myAspect.monitor();;
        return obj;
    }

}
