import com.wl.service.UserService;
import com.wl.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wl
 * @Date: 2020/6/20 20:58
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是接口：要注意这里
        UserService userService = (UserService) context.getBean("userService");

        userService.select();
    }
}
