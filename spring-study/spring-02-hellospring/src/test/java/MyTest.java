import com.wl.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: weilong
 * @Date: 2020/6/18 14:38
 */
public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在spring的管理中了，我们要使用，直接在里面取出来就可以！
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
