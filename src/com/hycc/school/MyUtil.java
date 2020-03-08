package com.hycc.school;

import java.util.Scanner;

/*
 * �����࣬�õ�����������
 */
public class MyUtil {
	private MyUtil() {
	}
	/*
	 * �õ�ָ�����������
	 * @param min����
	 * @param max������
	 * @return 
	 */
	public static int getRandomNumber(int min,int max) {
		return (int)(Math.random()*(max-min)+min);
	}
	
	/**
	 * ���û���ʾ��Ϣ��ͬʱ�����û�����һ������
	 * @param msg
	 * @param scanner
	 * @return
	 */
	public static int getInputNumber(String msg,Scanner scanner) {
		 System.out.println(msg);
		 return scanner.nextInt();
	}
	/**
	 * ���û���ʾ��Ϣ��ͬʱ�����û�����һ���ַ���
	 * @param msg
	 * @param scanner
	 * @return
	 */
	public static String getInputString(String msg,Scanner scanner) {
		 System.out.println(msg);
		 return scanner.next();
	}
}
