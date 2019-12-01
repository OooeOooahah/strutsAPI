package demo1;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * created by on 2019-12-01 下午 07:30
 *
 * @author "吴"
 */
public class UserAction1 extends ActionSupport {
    private String username;
    private String password;
    private int age;
    private Double salary;
    private Date date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String execute() throws Exception {
        //这样就可以接受对应的数据了
        System.out.println(username+"\t"+password);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(date);
        return NONE;
    }
}
