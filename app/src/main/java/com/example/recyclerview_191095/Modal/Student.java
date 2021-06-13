package com.example.recyclerview_191095.Modal;

public class Student {
    String sname, sroll_no, sclass_no;

    public Student() {
    }

    public Student(String sname, String sroll_no, String sclass_no) {
        this.sname = sname;
        this.sroll_no = sroll_no;
        this.sclass_no = sclass_no;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSroll_no(String sroll_no) {
        this.sroll_no = sroll_no;
    }

    public void setSclass_no(String sclass_no) {
        this.sclass_no = sclass_no;
    }

    public String getSname() {
        return sname;
    }

    public String getSroll_no() {
        return sroll_no;
    }

    public String getSclass_no() {
        return sclass_no;
    }

}

