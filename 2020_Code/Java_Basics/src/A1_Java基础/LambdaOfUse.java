package A1_Java基础;

/**
 * @author dxc
 * @Title: LambdaOfUse
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/2 12:05
 */

interface LambdaTest{
    void print(String str);
}

public class LambdaOfUse {

    public void say(LambdaTest lambdaTest){
        lambdaTest.print("函数当作参数");
        System.out.println("test");
    }

    public static void main(String[] args) {

        //将一个函数当作一个参数传过去
        new LambdaOfUse().say((str)->{
            System.out.println(str);
        });

        LambdaTest lambdaTest = (str)-> System.out.println(str);
        lambdaTest.print("test2");
    }
    /*
    * 函数当作参数
        test
        test2
    * */
}




