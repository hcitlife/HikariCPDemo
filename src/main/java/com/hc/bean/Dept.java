package com.hc.bean;

/**
 * @类名: Dept
 * @作者: 梁云亮
 * @生产日期 2020/2/2 10:20
 * @功能描述:
 */
/**
 * 部门
 * @author HC
 *
 */
public class Dept {
    /**
     * 部门编号
     */
    private Integer deptno;
    /**
     * 部门名称
     */
    private String dname;
    /**
     * 部门地址
     */
    private String loc;

    public Dept() {
    }

    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
