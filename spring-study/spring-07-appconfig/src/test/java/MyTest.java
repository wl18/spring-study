import com.wl.config.UserConfig;
import com.wl.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wl
 * @Date: 2020/6/19 20:44
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式来做，我们就只能通过AnnotationConfig 上下文来获取容器，通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User getUser = (User) context.getBean("user");
        System.out.println(getUser.getName());
    }

}
