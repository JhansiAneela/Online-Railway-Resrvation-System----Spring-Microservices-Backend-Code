package com.usermicroservice.model;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userInfo")
public class user
{
	@Id
	private int id;
	private String emailId;
	private String name;
	private String mobileNo;
	private String password;
	private String gender;
	private int age;
	private String BankName;
	private String creditno;
	private String role;
	
	public enum Gender
	{
		Male, Female
	}
	
	public user(int id,String emailId, String name, String mobileNo, String password,String Gender, int age, String BankName, String creditno,String role) 
	{
		super();
		this.id=id;
		this.emailId = emailId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.password = password;
		this.gender=gender;
		this.age=age;
		this.BankName=BankName;
		this.creditno=creditno;
		this.role=role;
	}
	

	public user() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBankName() {
		return BankName;
	}


	public void setBankName(String bankName) {
		BankName = bankName;
	}


	public String getCreditno() {
		return creditno;
	}


	public void setCreditno(String creditno) {
		this.creditno = creditno;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() 
	{
		return String.format("user[id='%d',emailId='%s',name='%s',password='%s',gender='%s',age='%d',BankName='%s',creditno='%s',role='%s']",id,emailId,name,password,gender,age,BankName,creditno,role);
		
	}
	
}
