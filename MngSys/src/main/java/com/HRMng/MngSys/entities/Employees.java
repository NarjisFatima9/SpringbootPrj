package com.HRMng.MngSys.entities;

public class Employees {

    private long empid;
    private String empname;
    private String empdesg;
    private String empdept;

    public Employees(long empid, String empname, String empdesg, String empdept) {
        this.empid = empid;
        this.empname = empname;
        this.empdesg = empdesg;
        this.empdept = empdept;
    }

    public Employees() {
        super();
    }

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpdesg() {
        return empdesg;
    }

    public void setEmpdesg(String empdesg) {
        this.empdesg = empdesg;
    }

    public String getEmpdept() {
        return empdept;
    }

    public void setEmpdept(String empdept) {
        this.empdept = empdept;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", empdesg='" + empdesg + '\'' +
                ", empdept='" + empdept + '\'' +
                '}';
    }
}
