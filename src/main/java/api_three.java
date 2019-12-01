import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

/**
 * created by on 2019-12-01 下午 06:59
 *
 * @author "吴"
 */
public class api_three implements ServletRequestAware {
    private HttpServletRequest request;

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request=httpServletRequest;
    }
}
