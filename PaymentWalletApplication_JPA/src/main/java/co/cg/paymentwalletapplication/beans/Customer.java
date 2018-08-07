package co.cg.paymentwalletapplication.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private String emailId;
	private String password;
	@Id
	private String mobileNo;
	private String gender;
	private double balance;
	@Lob
	private String transaction;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int age, String emailId, String password, String mobileNo, String gender,
			double balance, String transaction) {
		super();
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.balance = balance;
		this.transaction = transaction;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CustomerBean [name=" + name + ", age=" + age + ", emailId=" + emailId + ", password=" + password
				+ ", mobileNo=" + mobileNo + ", gender=" + gender + ", balance=" + balance + "]";
	}

}

