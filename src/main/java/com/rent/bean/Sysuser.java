package com.rent.bean;

/**
 * @author BABA
 * @date 2019/10/16 10:34
 */
public class Sysuser {
    private String username;
    private String password;

    public Sysuser() {
    }

    public Sysuser(String username, String password) {
        this.username = username;
        this.password = password;
    }

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

    @Override
    public String toString() {
        return "Sysuser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
