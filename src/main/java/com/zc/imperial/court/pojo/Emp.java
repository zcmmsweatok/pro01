package com.zc.imperial.court.pojo;

/**
 * @author zc
 * @date
 * @description
 */
public class Emp {
    private Integer emp_id;
    private String emp_name;
    private String emp_position;
    private String login_account;
    private String login_password;

    public Emp() {
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_position() {
        return emp_position;
    }

    public void setEmp_position(String emp_position) {
        this.emp_position = emp_position;
    }

    public String getLogin_account() {
        return login_account;
    }

    public void setLogin_account(String login_account) {
        this.login_account = login_account;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_position='" + emp_position + '\'' +
                ", login_account='" + login_account + '\'' +
                ", login_password='" + login_password + '\'' +
                '}';
    }
}
