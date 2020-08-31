import com.wl.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wl
 * @Date: 2020/6/19 01:24
 */
public class MyTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }

}
