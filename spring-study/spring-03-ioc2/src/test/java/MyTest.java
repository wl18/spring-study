import com.wl.pojo.User;
import com.wl.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: weilong
 * @Date: 2020/6/18 17:24
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserT user = (UserT) context.getBean("u22");
        user.show();
    }
}
