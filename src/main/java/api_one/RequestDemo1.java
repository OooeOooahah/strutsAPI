package api_one;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;

/**
 * created by on 2019-12-01 下午 06:17
 *
 * @author "吴"
 */
public class RequestDemo1 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        String[] info={};
        ActionContext context= ActionContext.getContext();
        Map<String, Object> args = context.getParameters();
        for (Map.Entry<String,Object> key : args.entrySet()) {
            String[] value = (String[])key.getValue();
            info=value;
            System.out.println(Arrays.toString(value));
        }
        context.put("info",Arrays.toString(info));
        context.getSession().put("session","s");
        context.getApplication().put("app","ap");
        return "success";
    }
}
