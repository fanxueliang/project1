package com.tc.Basis1;

import java.util.Scanner;

public class File1 {
	public static void main(String[] args) {
		System.out.println("三国无双");
		System.out.println("游戏角色           :\t赵二 \t钱三\t孙四");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请选择你的角色:");
		@SuppressWarnings("unused")
		String name = input.next();
		{
			System.out.println("路遇李五是否选择PK");
			@SuppressWarnings({ "unused", "resource" })
			Scanner A1 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a1 = input.next();
			if (a1.equals("Yes")) {
				System.out.println("血量不足是否使用药剂");
			} else {
				System.out.println("");
				return;
			}
			@SuppressWarnings({ "unused", "resource" })
			Scanner A2 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a2 = input.next();
			if (a2.equals("Yes")) {
				System.out.println("战斗胜利是否继续向前");
			} else {
				System.out.println("你已阵亡");
				return;
			}
			@SuppressWarnings({ "unused", "resource" })
			Scanner A3 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a3 = input.next();
			if (a3.equals("Yes"))
				;
			else {
				System.out.println("");
				return;
			}

			System.out.println("路遇周六是否选择战斗");
			@SuppressWarnings({ "unused", "resource" })
			Scanner A4 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a4 = input.next();
			if (a4.equals("Yes")) {
				System.out.println("血量不足是否使用药剂");
			} else {
				System.out.println("");
				return;
			}

			@SuppressWarnings({ "unused", "resource" })
			Scanner A5 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a5 = input.next();
			if (a5.equals("Yes")) {
				System.out.println("战斗胜利是否继续向前");
			} else {
				System.out.println("你已阵亡");
				return;
			}

			@SuppressWarnings({ "unused", "resource" })
			Scanner A6 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a6 = input.next();
			if (a6.equals("Yes"))
				;
			else {
				System.out.println("");
				return;
			}
			System.out.println("路遇吴七是否选择战斗");
			@SuppressWarnings({ "unused", "resource" })
			Scanner A7 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a7 = input.next();
			if (a7.equals("Yes")) {
				System.out.println("血量不足是否使用药剂");
			}
			@SuppressWarnings({ "unused", "resource" })
			Scanner A8 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a8 = input.next();
			if (a8.equals("Yes")) {
				System.out.println("战斗胜利 通关");
			} else {
				System.out.println("游戏结束");
				return;
			}
		}
	}
}