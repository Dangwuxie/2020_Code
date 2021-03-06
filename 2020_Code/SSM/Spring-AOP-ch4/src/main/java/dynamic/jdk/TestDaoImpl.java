package dynamic.jdk;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author dxc
 * @Title: TestDaoImpl
 * @Description: 天下风云出我辈，一入代码岁月催，
 * --------------皇图霸业谈笑中，不胜编程一场醉。
 * @date 2020/2/29 19:56
 */
@Repository("testDao")
public class TestDaoImpl implements TestDao {

    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void modify() {
        System.out.println("修改");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

}
