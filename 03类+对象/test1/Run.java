package com.l03.test1;

public class Run {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "牛顿";
		p1.city = "英国";
		p1.sex = "男";
		p1.age = 77;
		p1.eat("经常忘记");
		p1.sleep("很少睡觉");
		p1.think("三大定律"); 
		p1.showMe();
		
		Person p2 = new Person("蔡伦", "中华", "男", 45);
		p2.eat("随便");
		p2.sleep("正常");
		p2.think("造纸术");
		p2.showMe();
		
		new Person(1);
	}

}
