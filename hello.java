package hello;

import java.util.Scanner;

public class hello {
	public static void main(String[] args){
		//System.out.println("Hello world!");
		//System.out.println("javaだよ！！");
		//int a=5;
		//System.out.println(a);
		//int b;
		//String c;
		//b=4;
		//c="yahoo";
		//System.out.println(b);
		//System.out.println(c);

		//Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		//System.out.println(a+b);
		//System.out.println(a-b);
		//System.out.println(a*b);
		//System.out.println(a/b);

		System.out.println("グー：1　チョキ：2　パー：3です");
		Scanner sc=new Scanner(System.in);
		System.out.println("aさんが選んでください");
		int a=sc.nextInt();
		System.out.println("bさんが選んでください");
		int b=sc.nextInt();
		if(a==1)
		{
			if(b==1)
			{
				System.out.println("あいこだよ");
			}else if(b==2)
			{
				System.out.println("aさんの勝ち～");
			}else if(b==3)
			{
				System.out.println("bさんの勝ち～");
			}
		}else if(a==2)
		{
			if(b==1)
			{
				System.out.println("aさんの勝ち～");
			}else if(b==2)
			{
				System.out.println("あいこだよ");
			}else if(b==3)
			{
				System.out.println("bさんの勝ち～");
			}
		}else
		{
			if(b==1)
			{
				System.out.println("aさんの勝ち～");
			}else if(b==2)
			{
				System.out.println("bさんの勝ち～");
			}else if(b==3)
			{
				System.out.println("あいこだよ");
			}
		}
		sc.close();
	}
}
