package cn.jdwa.pojo;

import java.io.Serializable;

/**
 * Created by czz on 2019/9/1.
 */
public class Account implements Serializable {

    private String uname;
    private String passwd;
    private Double money;
    private User user;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uname='" + uname + '\'' +
                ", passwd='" + passwd + '\'' +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}
