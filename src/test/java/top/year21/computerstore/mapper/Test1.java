package top.year21.computerstore.mapper;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
//不会启动整个项目
@RunWith(SpringRunner.class)
public class Test1 {

    /**
     * 单元测试方法特点
     * 1.方法是public void
     * 2.没有返回值
     * 3.方法上需要加@Test注解
     * 4.参数：空参
     */
    @Test
    public void test1(){
        System.out.println("test1");
    }
}
