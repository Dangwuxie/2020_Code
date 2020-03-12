package DynamicProxy.dynamic;

/**
 * @author dxc
 * @Title: Test
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/5 19:21
 */
public class Test {

    public static void main(String[] args) {

        //创建代理对象
        JDKDynamicProxy dynamicProxy = new JDKDynamicProxy();
        //创建被代理对象
        TestDao testDao = new TestDaoImpl();

        //从代理对象中获取增强后的目标对象
        TestDao testDaoStrong = (TestDao) dynamicProxy.creatProxy(testDao);
        //执行方法
        testDaoStrong.save();
        System.out.println("------------");
        testDaoStrong.modify();;
        System.out.println("------------");
        testDaoStrong.delete();

    }
}
