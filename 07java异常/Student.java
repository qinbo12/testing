package com.l08.test1;

public class Student {
	public String wear = null;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String wear) {
		this.wear = wear;
	}
	 
	public void showMe() throws WearException {
		if("Ƥ��".equals(this.wear)) {
			throw new WearException();
		}
		System.out.println("���촩��" + this.wear);
	}
	
	protected void finalize() throws Throwable {
		System.out.println("��һ��ѧ���������ˣ�");
	}
}
