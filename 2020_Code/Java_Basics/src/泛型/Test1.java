package 泛型;

import java.util.ArrayList;

/**
 * @author dxc
 * @Title: Test1
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/9 15:19
 */
public class Test1 {

    public static void main(String[] args) {

        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(100);

        Generic1 generic1 = new Generic1();
        generic1.getGeneric(1);*/

        Box<Number> box1 = new Box<>();
        box1.setFirst(111);
        showBox(box1);

        Box<Integer> box2 = new Box<>();
        box2.setFirst(222);
        showBox(box2);
    }
    //extends上限
    //super下限
    public static void showBox(Box<? extends Number> box){

        Number boxFirst = box.getFirst();
        System.out.println(boxFirst);

    }
}












