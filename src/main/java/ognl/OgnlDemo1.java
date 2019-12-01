package ognl;

import domain.User;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * created by on 2019-12-01 下午 10:01
 *
 * @author "吴"
 */
public class OgnlDemo1 {
    public static void main(String[] args) throws OgnlException {
        OgnlContext context = new OgnlContext();
        User user=new User("Tom","123",12, (double) 12,new Date());
        context.setRoot(user);
        Object root = context.getRoot();
        Object username = Ognl.getValue("username", context,root);
        Object date =  Ognl.getValue("date", context, root);
        System.out.println(username+"\t"+date.toString());
    }
}
