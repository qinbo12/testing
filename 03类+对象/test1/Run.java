package com.l03.test1;

public class Run {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ţ��";
		p1.city = "Ӣ��";
		p1.sex = "��";
		p1.age = 77;
		p1.eat("��������");
		p1.sleep("����˯��");
		p1.think("������"); 
		p1.showMe();
		
		Person p2 = new Person("����", "�л�", "��", 45);
		p2.eat("���");
		p2.sleep("����");
		p2.think("��ֽ��");
		p2.showMe();
		
		new Person(1);
	}

}
