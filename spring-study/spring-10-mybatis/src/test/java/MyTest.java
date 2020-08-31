import com.wl.mapper.UserMapper;
import com.wl.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: wl
 * @Date: 2020/6/21 22:04
 */
public class MyTest {
    @Test
    public void test() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);

        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }

        // 之前的方式
        //String resources = "mybatis-config.xml";
        //try {
        //    InputStream in = Resources.getResourceAsStream(resources);
        //    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        //    SqlSession sqlSession = sessionFactory.openSession(true);
        //
        //    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //    List<User> userList = mapper.selectUser();
        //
        //    for (User user : userList) {
        //        System.out.println(user);
        //    }
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}

    }
}
