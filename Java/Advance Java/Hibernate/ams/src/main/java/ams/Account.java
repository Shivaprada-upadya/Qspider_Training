package ams;

import java.time.LocalDateTime;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Cacheable
public class Account {
	@Id
	private long accNum;
	private String ahname;
	private long phoneNum;
	private double balance;
	private String accType;
	@CreationTimestamp
	private LocalDateTime createdOn;
	@UpdateTimestamp
	private LocalDateTime updatedOn;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getAhname() {
		return ahname;
	}
	public void setAhname(String ahname) {
		this.ahname = ahname;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	public Account(long accNum, String ahname, long phoneNum, double balance, String accType) {
		super();
		this.accNum = accNum;
		this.ahname = ahname;
		this.phoneNum = phoneNum;
		this.balance = balance;
		this.accType = accType;
	}
	
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", ahname=" + ahname + ", phoneNum=" + phoneNum + ", balance=" + balance
				+ ", accType=" + accType + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}
	
	
	
	
}
