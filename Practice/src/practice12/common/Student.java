/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;
	
	public void setstudentId(int number) {
		this.studentId=number;
	}
	public int getstudentId() {
		return this.studentId;
	}
	
	public void setstudentName(String name) {
		this.studentName = name;
	}
	public String getstudentName() {
		return this.studentName;
	}
	
	public void setcompanyName(String company) {
		this.companyName = company;
	}
	public String getcompanyName() {
		return this.companyName;
	}
	
	public void setclassName(String classname) {
		this.className = classname;
	}
	public String getclassName() {
		return this.className;
	}
	
	public void setmail(String mail) {
		this.mail = mail;
	}
	public String getmail() {
		return this.mail;
	}
	
	public void setpassword(String pass) {
		this.password=pass;
	}
	public String getpassword() {
		return this.password;
	}
}
