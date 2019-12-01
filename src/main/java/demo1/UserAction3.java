package demo1;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.User;

/**
 * created by on 2019-12-01 下午 07:52
 *
 * @author "吴"
 */
public class UserAction3 extends ActionSupport implements ModelDriven<User> {
    private User user=new User();

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user.toString());
        return NONE;
    }
}
