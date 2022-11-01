package com.zc.imperial.court.pojo;

/**
 * @author zc
 * @date
 * @description
 */
public class Memorials {
    private Integer memorials_id;
    private String  memorials_title;
    private String memorials_content;
    private Integer memorials_emp;
    private String memorials_create_time;
    private String feedback_content;
    private Integer memorials_status;

    public Memorials() {
    }

    public Integer getMemorials_id() {
        return memorials_id;
    }

    public void setMemorials_id(Integer memorials_id) {
        this.memorials_id = memorials_id;
    }

    public String getMemorials_title() {
        return memorials_title;
    }

    public void setMemorials_title(String memorials_title) {
        this.memorials_title = memorials_title;
    }

    public String getMemorials_content() {
        return memorials_content;
    }

    public void setMemorials_content(String memorials_content) {
        this.memorials_content = memorials_content;
    }

    public Integer getMemorials_emp() {
        return memorials_emp;
    }

    public void setMemorials_emp(Integer memorials_emp) {
        this.memorials_emp = memorials_emp;
    }

    public String getMemorials_create_time() {
        return memorials_create_time;
    }

    public void setMemorials_create_time(String memorials_create_time) {
        this.memorials_create_time = memorials_create_time;
    }

    public String getFeedback_content() {
        return feedback_content;
    }

    public void setFeedback_content(String feedback_content) {
        this.feedback_content = feedback_content;
    }

    public Integer getMemorials_status() {
        return memorials_status;
    }

    public void setMemorials_status(Integer memorials_status) {
        this.memorials_status = memorials_status;
    }

    @Override
    public String toString() {
        return "Memorials{" +
                "memorials_id=" + memorials_id +
                ", memorials_title='" + memorials_title + '\'' +
                ", memorials_content='" + memorials_content + '\'' +
                ", memorials_emp=" + memorials_emp +
                ", memorials_create_time='" + memorials_create_time + '\'' +
                ", feedback_content='" + feedback_content + '\'' +
                ", memorials_status=" + memorials_status +
                '}';
    }
}
