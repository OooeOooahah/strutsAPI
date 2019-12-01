package domain;

import java.io.Serializable;
import java.util.Date;

/**
 * created by on 2019-12-01 下午 07:24
 *  属性的封装
 * @author "吴"
 */
public class User implements Serializable {

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
}
