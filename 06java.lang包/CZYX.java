package com.l07.test2;

import java.util.Random;
import java.util.Scanner;

public class CZYX {

	public static void main(String[] args) {
		String ts = "������ɽ�����ƺ��뺣��������ǧ��Ŀ������һ��¥";
		String[] tsS = ts.split("��");
		
		char[] da = new char[4];
		String[] daS = new String[4];
		
		Random random = new Random();
		for(int i = 0; i < tsS.length; i++) {
			int n = random.nextInt(5); 
			da[i] = tsS[i].charAt(n);
			tsS[i] = tsS[i].replace(da[i], '?');
		}
		
		for(int i = 0; i < tsS.length; i++) {
			System.out.println(tsS[i]);
		}
		
		int index = random.nextInt(4);
		daS[index] = "" + da[0] + da[1] + da[2] + da[3];
		
		Tools t = new Tools();
		for(int i = 0; i < 4; i++) {
			if(i == index) {
				continue;
			}
			t.c(da);
			daS[i] = "" + da[0] + da[1] + da[2] + da[3];
		}
		
		for(int i = 0; i < daS.length; i++) {
			System.out.println((i + 1) + "��" + daS[i]);
		}
		
		System.out.println("�������ѡ���ǣ�");
		int guess = 0;
		guess = new Scanner(System.in).nextInt();
		if(guess == (index + 1)) {
			System.out.println("��ϲ������ˣ�");
		} else {
			System.out.println("������ɣ�");
		}
		
	}

}
