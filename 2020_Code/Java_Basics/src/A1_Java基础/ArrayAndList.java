package A1_Java基础;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dxc
 * @Title: ArrayAndList
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/3 11:45
 */
public class ArrayAndList {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4};
        List<Character> list = new ArrayList<>();

        Arrays.asList(arr);

        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');

        Object[] arr2 = list.toArray();

        for (int i = 0;i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

    }

}
