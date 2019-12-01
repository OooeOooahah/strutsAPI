import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * created by on 2019-12-01 下午 06:43
 *
 * @author "吴"
 */
public class api_two extends ActionSupport {

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        String name = request.getParameter("name");
        request.setAttribute("name",name);

        Map<String, String[]> map = request.getParameterMap();
        for (Map.Entry<String, String[]> key : map.entrySet()) {
            String k = key.getKey();
            String[] value = key.getValue();
            System.out.println(k+"\t"+ Arrays.toString(value));
        }
        return SUCCESS;
    }
}
