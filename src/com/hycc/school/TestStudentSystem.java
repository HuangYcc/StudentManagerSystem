package com.hycc.school;

import java.util.Scanner;

/**
 * ѧ������ϵͳ
 * ѧ�����ԣ�ѧ�ţ����������䣬�Ա�
 * ���ܣ�
 * ��������ѧ����Ϣ
 * ���ѧ����Ϣ
 * ����ѧ�Ų���ѧ����Ϣ
 * �������ֲ���ѧ��
 * ����ѧ��ɾ��ѧ��
 * ���������޸�ѧ��
 * @author hycc
 */
public class TestStudentSystem {
	public static void main(String[] args) {
		StudentSystem system = new StudentSystem();
		//��ʾ��ӭ��Ϣ
		system.welcome();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			system.showMenu();
			int input = MyUtil.getInputNumber("��ѡ�����Ĳ�����", scanner);
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
