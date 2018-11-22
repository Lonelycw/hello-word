package com.xu.TestMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MemberCRUD extends Member{
	
	Scanner sc = new Scanner(System.in);
	Integer id=1;
	
	
	
	
	
	
	
	/*
	 * 添加
	 */
	public void Create() {
		System.out.println("请输入会员名:");
		String n = sc.next();
		System.out.println("请输入年龄:");
		int a = sc.nextInt();
		System.out.println("请输入生日:");
		String b = sc.next();
		System.out.println("请输入积分:");
		int p = sc.nextInt();
		setMemberid(id);
		m.put(getMemberid(), new Member(id,n,a,b,p));
		id=id+1;
		
	}
	/*
	 * 查看
	 */
	public void Read() {
		System.out.println("会员编号	会员名				年龄			生日	积分");
		Set<Integer> in = m.keySet();
		for (Integer integer : in) {
			System.out.println(m.get(integer).toString());
		}
		
	}
	/*
	 * 修改
	 */
	public void Update() {
		Read();
		System.out.print("请选择要修改的用户编号:");
		Integer k=sc.nextInt();																		//设定变量接受输入的键
		System.out.println("请选择要修改的项目:");
		System.out.println("1.会员名  2.年龄  3.生日 4.积分");
		int y = sc.nextInt();
		/*
		 * 修改会员名
		 */
		if(y==1) {
			System.out.println("原会员名:"+m.get(k).getMembername());								//根据输入键值读出具体属性
			System.out.print("请输入新的会员名:");
			//setMembername(sc.next());																//修改单项属性(精简至put中)
			m.put(k,new Member(getMemberid(),sc.next(),m.get(k).getAge(),m.get(k).getBirthday(),m.get(k).getMemberpoints())); //将修改的单项属性与原属性插入选择键对应的值
			System.out.println("修改完毕!");
			System.out.println(m.get(k));
		/*
		 * 修改会员年龄
		 */
			
		}else if(y==2) {
			System.out.println("原会员年龄"+m.get(k).getAge());
			System.out.print("请输入新的会员年龄:");
			//setAge(sc.nextInt());
			
			m.put(k,new Member(getMemberid(),m.get(k).getMembername(),sc.nextInt(),m.get(k).getBirthday(),m.get(k).getMemberpoints()));
			System.out.println("修改完毕!");
			System.out.println(m.get(k));
		
		/*
		 * 修改会员生日
		 */
		}else if(y==3) {
			System.out.println("原会员生日:"+m.get(k).getBirthday());
			System.out.print("请输入新的会员生日:");
			//setBirthday(sc.next());
			
			m.put(k,new Member(getMemberid(),m.get(k).getMembername(),m.get(k).getAge(),sc.next(),m.get(k).getMemberpoints()));
			System.out.println("修改完毕!");
			System.out.println(m.get(k));
		
		/*
		 * 修改会员积分
		 */
		}else if(y==4) {
			System.out.println("原会员积分:"+m.get(k).getMemberpoints());
			System.out.print("请输入新的会员积分:");
			//setMemberpoints(sc.nextInt());
			
			m.put(k,new Member(getMemberid(),m.get(k).getMembername(),m.get(k).getAge(),m.get(k).getBirthday(),sc.nextInt()));
			System.out.println("修改完毕!");
			System.out.println(m.get(k));
		/*
		 * 超出选择范围	
		 */
			
		}else {
			System.out.println("选项错误!");
		}
	}
	/*
	 * 删除
	 */
	public void Delect() {
		Read();
		System.out.print("请选择要删除的用户:");
		int d = sc.nextInt();
		m.remove(d);
		System.out.println("删除成功!");
		Read();
		
	}
}
