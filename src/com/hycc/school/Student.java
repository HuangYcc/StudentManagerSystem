package com.hycc.school;
/**
 * ѧ�����ԣ�ѧ�ţ����������䣬�Ա�
 * @author Administrator
 *
 */

//����ʵ����
public class Student {
	private int sid;
	private String name;
	private int age;
	private Gender gender;//�Ա�ö��

	public Student() {
	}
	public Student(int sid,String name,int age,Gender gender) {
		this.sid=sid;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "ѧ����Ϣ ["
				+ "ѧ��=" + sid + ","
				+ "����=" + name + ", "
				+ "����=" + age + ", "
				+ "�Ա�=" + gender + "]";
	}
	
	
	
	

}
enum Gender{
	��,Ů
}