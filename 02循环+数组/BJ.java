package com.l1.demo;
/**
 * ��Ǯ��ټ�
 * @author dell
 *
 */
public class BJ {

	public static void main(String[] args) {
		//ĸ��5Ԫһֻ������3Ԫһֻ��С��һԪ��ֻ����һ��Ԫ��һ��ֻ�������
		int m, g, x;
		//ĸ�����ֻ�ܴﵽ20ֻ
		for(m = 0; m <= 20; m++) {
			//�������ֻ�ܴﵽ33ֻ
			for(g = 0; g <= 33; g++) {
				x = 100 - m - g;
				if((m * 5 + g * 3 + x/3) == 100 && x % 3 == 0) {
					System.out.println("ĸ����" + m + "��������" + g + "��С����" + x );
				}
			}
		}
	}

}
