package com.springcore;

public class student {
	private int  studentID;
	private String studentName;
	private String studentAdddress;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		System.out.println("set st id");
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("set st name");
		this.studentName = studentName;
	}
	public String getStudentAdddress() {
		return studentAdddress;
	}
	public void setStudentAdddress(String studentAdddress) {
		System.out.println("set st add");
		this.studentAdddress = studentAdddress;
	}
	public student(int studentID, String studentName, String studentAdddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAdddress = studentAdddress;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [studentID=" + studentID + ", studentName=" + studentName + ", studentAdddress="
				+ studentAdddress + "]";
	}
	
}
