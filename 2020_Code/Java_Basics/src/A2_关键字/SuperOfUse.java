package A2_关键字;

/**
 * @author dxc
 * @Title: SuperOfUse
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/3/4 12:03
 */
class Person{
    public Person(String name) {
        System.out.println(name);
        System.out.println("Person");
    }
}

class Son extends Person{
    public Son() {
        super("name");
        System.out.println("Son");
    }
}
public class SuperOfUse {

    public static void main(String[] args) {
        Person person = new Son();

    }
}
