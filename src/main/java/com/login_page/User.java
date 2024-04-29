package com.login_page;

public class User {
	private String username;
    private String password;
    private long mobno;
    private String emailid;

   
    public User(String username, String password, long mobno, String emailid) {
        this.username = username;
        this.password = password;
        this.mobno = mobno;
        this.emailid = emailid;
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

    public long getMobno() {
        return mobno;
    }

    public void setMobno(long mobno) {
        this.mobno = mobno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobno=" + mobno +
                ", emailid='" + emailid + '\'' +
                '}';
    }
}
