package com.tc.Basis1;

import java.util.Scanner;

public class File1 {
	public static void main(String[] args) {
		System.out.println("������˫");
		System.out.println("��Ϸ��ɫ           :\t�Զ� \tǮ��\t����");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ����Ľ�ɫ:");
		@SuppressWarnings("unused")
		String name = input.next();
		{
			System.out.println("·�������Ƿ�ѡ��PK");
			@SuppressWarnings({ "unused", "resource" })
			Scanner A1 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a1 = input.next();
			if (a1.equals("Yes")) {
				System.out.println("Ѫ�������Ƿ�ʹ��ҩ��");
			} else {
				System.out.println("");
				return;
			}
			@SuppressWarnings({ "unused", "resource" })
			Scanner A2 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a2 = input.next();
			if (a2.equals("Yes")) {
				System.out.println("ս��ʤ���Ƿ������ǰ");
			} else {
				System.out.println("��������");
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

			System.out.println("·�������Ƿ�ѡ��ս��");
			@SuppressWarnings({ "unused", "resource" })
			Scanner A4 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a4 = input.next();
			if (a4.equals("Yes")) {
				System.out.println("Ѫ�������Ƿ�ʹ��ҩ��");
			} else {
				System.out.println("");
				return;
			}

			@SuppressWarnings({ "unused", "resource" })
			Scanner A5 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a5 = input.next();
			if (a5.equals("Yes")) {
				System.out.println("ս��ʤ���Ƿ������ǰ");
			} else {
				System.out.println("��������");
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
			System.out.println("·�������Ƿ�ѡ��ս��");
			@SuppressWarnings({ "unused", "resource" })
			Scanner A7 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a7 = input.next();
			if (a7.equals("Yes")) {
				System.out.println("Ѫ�������Ƿ�ʹ��ҩ��");
			}
			@SuppressWarnings({ "unused", "resource" })
			Scanner A8 = new Scanner(System.in);
			System.out.println("Yes/No");
			String a8 = input.next();
			if (a8.equals("Yes")) {
				System.out.println("ս��ʤ�� ͨ��");
			} else {
				System.out.println("��Ϸ����");
				return;
			}
		}
	}
}