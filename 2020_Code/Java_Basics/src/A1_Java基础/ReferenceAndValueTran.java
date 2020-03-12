package A1_Java基础;

/**
 * @author dxc
 * @Title: ReferenceAndValueTran
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/2 22:15
 */
public class ReferenceAndValueTran {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{4,5,6};
        swapArr(arr1,arr2);

        for (int p:arr2){
            System.out.println(p);
        }
        /*Integer o = new Integer(222);
        String x = new String("111");
        modify(x);
        System.out.println(x);*/
    }

    public static void modify(Object o){
        o ="333";
    }

    public static void swapArr(int[] arr1,int[] arr2){
        int[] tmp = arr1;
        arr1 = arr2;
        arr2 = tmp;
    }

}
