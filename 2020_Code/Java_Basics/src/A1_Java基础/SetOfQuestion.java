package A1_Java基础;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dxc
 * @Title: SetOfQuestion
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/3 18:42
 */
public class SetOfQuestion {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);

        System.out.println(set);

    }

}
