import com.wl.dao.UserDaoImpl;
import com.wl.dao.UserDaoMysqlImpl;
import com.wl.dao.UserDaoOracleImpl;
import com.wl.service.UserService;
import com.wl.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: weilong
 * @Date: 2020/6/16 22:11
 */
public class MyTest {
    public static void main(String[] args) {

        //获取ApplicationContext；
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，需要什么就直接get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();




        //用户实际调用的是业务层,dao层他们不需要接触！
//        UserService userService = new UserServiceImpl();
//
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//
//        userService.getUser();
    }
}
