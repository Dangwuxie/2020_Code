package dynamic.jdk;

/**
 * @author dxc
 * @Title: JDKDynamicTest
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/1 10:44
 */
public class JDKDynamicTest {

    public static void main(String[] args) {
        //创建代理对象
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();
        //创建目标对象
        TestDao testDao = new TestDaoImpl();

        TestDao testDaoAdvice = (TestDao) jdkDynamicProxy.createProxy(testDao);

        testDaoAdvice.save();
        System.out.println("--------");
        testDaoAdvice.modify();
        System.out.println("--------");
        testDaoAdvice.delete();
    }

}
