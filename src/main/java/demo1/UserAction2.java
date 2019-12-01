package demo1;

import com.opensymphony.xwork2.ActionSupport;
import domain.User;

/**
 * created by on 2019-12-01 下午 07:39
 *
 * @author "吴"
 */
public class UserAction2  extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user.toString());
        return NONE;
    }
}
