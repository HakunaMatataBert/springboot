package com.learn.springboot.model;



public class Students {
    private Integer sid;
    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getAll() {
        return  "{"+sid +":" +sname+"}";
    }
}
