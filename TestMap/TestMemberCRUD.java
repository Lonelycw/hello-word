package com.xu.TestMap;

import java.util.Scanner;

public class TestMemberCRUD  {
	public static void main(String[] args) {
		MemberCRUD m = new MemberCRUD();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("***************************");
		System.out.println("**欢迎进入会员管理系统*****");
		System.out.println("**1.查看会员***************");
		System.out.println("**2.修改会员信息***********");
		System.out.println("**3.删除会员信息***********");
		System.out.println("**4.添加会员***************");
		System.out.println("**5.退出*******************");
		System.out.println("***************************");
		System.out.print("请选择:");
		int c = sc.nextInt();
		if(c==1) {
			m.Read();
		}else if(c==2) {
			m.Update();
		}else if(c==3) {
			m.Delect();
		}else if(c==4) {
			m.Create();
		}else if(c==5) {
			break;
			
		}else {
			System.out.println("选项错误!");
		}
		}
	}
}
