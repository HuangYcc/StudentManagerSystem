package com.hycc.school;

import java.util.Scanner;

/**
 * 学生管理系统
 * 学生属性：学号，姓名，年龄，性别
 * 功能：
 * 遍历所有学生信息
 * 添加学生信息
 * 根据学号查找学生信息
 * 根据名字查找学生
 * 根据学号删除学生
 * 根据姓名修改学生
 * @author hycc
 */
public class TestStudentSystem {
	public static void main(String[] args) {
		StudentSystem system = new StudentSystem();
		//显示欢迎信息
		system.welcome();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			system.showMenu();
			int input = MyUtil.getInputNumber("请选择您的操作：", scanner);
			switch(input) {
			case 1:
				system.showAll();
				break;
			case 2:
				system.addStudent();
				break;
			case 3:
				system.findStuBySid();
				break;
			case 4:
				system.findStusByName();
				break;
			case 5:
				system.removeStuBySid();
				break;
			case 6:
				system.modifyStuBySid();
				break;
			case 7:
				system.exit();
				return ;
			}
		}
	}
}
