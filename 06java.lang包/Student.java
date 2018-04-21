package com.l07.test2;

public class Student {
	private String name = null;
	private String sex = null;
	
	public Student(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() { 
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
//	public boolean equals(Object obj) {
//		if(obj == null) {
//			return false;
//		}
//		if(!(obj instanceof Student)) {
//			return false;
//		}
//		Student s = (Student)obj;
//		if(!(this.name.equals(s.getName()))) {
//			return false;
//		}
//		if(!(this.sex.equals(s.getSex()))) {
//			return false;
//		}
//		return true;
//	}
	
	
	
	
}
