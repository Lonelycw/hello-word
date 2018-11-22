package com.xu.TestMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Member {
	private String membername;
	private int age;
	private String birthday;
	private int memberpoints;
	private int memberid;
	
	HashMap<Integer,Member> m = new HashMap<Integer,Member>();

	
	
	public Member(int memberid,String membername, int age, String birthday, int memberpoints ) {
		super();
		this.memberid = memberid;
		this.membername = membername;
		this.age = age;
		this.birthday = birthday;
		this.memberpoints = memberpoints;

	}
	
	public Member() {
		super();
	}
	public int getMemberid() {
		return(Integer) memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getMemberpoints() {
		return memberpoints;
	}
	public void setMemberpoints(int memberpoints) {
		this.memberpoints = memberpoints;
	}

	@Override
	public String toString() {
		return memberid+"		"+membername + "				" + age + "			" + birthday + "  "+ memberpoints;
	}

	

	

	
	
}
