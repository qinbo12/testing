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
		if("皮袄".equals(this.wear)) {
			throw new WearException();
		}
		System.out.println("今天穿：" + this.wear);
	}
	
	protected void finalize() throws Throwable {
		System.out.println("有一个学生被消亡了！");
	}
}
