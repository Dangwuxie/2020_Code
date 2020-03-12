package A1_Java基础;

import java.util.*;

/**
 * @author dxc
 * @Title: MapOfClassify
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/2 11:14
 */
public class MapOfClassify {

    public static void main(String[] args) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        Integer n1 = 127;
        Integer n2 = 127;
        int n3 = 129;
        System.out.println(n1 == n2);//false
        System.out.println(n1 == n3);//true



    }
}
