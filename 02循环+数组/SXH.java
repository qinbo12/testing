package com.l1.demo;
/**
 * ˮ�ɻ���
 * @author dell
 *
 */
public class SXH {

	public static void main(String[] args) {
		System.out.println("��ӡ���е�ˮ�ɻ�����");
		for(int i = 100; i < 1000; i++) {
			int g = i % 10;
			int s = (i % 100) / 10;
			int b = i / 100;
			if((g * g * g) + (s * s * s) + (b * b * b) == i) {
				System.out.println("�����ˮ�ɻ�����" + i + "!");
			}
		}
	}

} 
