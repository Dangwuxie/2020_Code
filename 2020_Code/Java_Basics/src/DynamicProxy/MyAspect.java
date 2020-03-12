package DynamicProxy;

/**
 * @author dxc
 * @Title: MyAspect
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/5 19:18
 */
public class MyAspect {

    public void check(){
        System.out.println("权限控制----");
    }

    public void expect(){
        System.out.println("异常处理----");
    }
    public void log(){
        System.out.println("日志记录----");
    }
    public void monitor(){
        System.out.println("性能检测----");
    }
}
