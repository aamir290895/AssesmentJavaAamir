package com.example.demo;

public class Dept {
   int deptno;
   String dname;
   String dloc;
   
   
public Dept(int deptno, String dname, String dloc) {
	super();
	this.deptno = deptno;
	this.dname = dname;
	this.dloc = dloc;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getDloc() {
	return dloc;
}
public void setDloc(String dloc) {
	this.dloc = dloc;
}
   
}
