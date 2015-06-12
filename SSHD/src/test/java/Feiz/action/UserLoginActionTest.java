package Feiz.action;
import Feiz.po.User;
import Feiz.service.UserService;
import Feiz.util.InitApplicationContext;
import com.opensymphony.xwork2.Action;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
public class UserLoginActionTest extends TestCase {
    private User user;
    private UserService userService;
    private ApplicationContext context = null;
    private UserLoginAction loginAction = null;
    public void setUp(){
        context = InitApplicationContext.getApplicationContext();
        loginAction = new UserLoginAction();
        userService = (UserService)context.getBean("userService");
    }
    //ע����Ҫ��ִ��UserDaoTest����
    public void testUserLogin(){
        user = new User();
        user.setName("username");
        user.setPassword("password");
        try {
            loginAction.setUser(user);
            loginAction.setUserService(userService);
            Assert.assertEquals(Action.SUCCESS, loginAction.execute());
            user.setPassword("password1");
            System.out.println(loginAction.getActionErrors());
            Assert.assertEquals(Action.INPUT, loginAction.execute());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}