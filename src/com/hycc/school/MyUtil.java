package com.hycc.school;

import java.util.Scanner;

/*
 * 工具类，得到输入和随机数
 */
public class MyUtil {
	private MyUtil() {
	}
	/*
	 * 得到指定区间随机数
	 * @param min包含
	 * @param max不包含
	 * @return 
	 */
	public static int getRandomNumber(int min,int max) {
		return (int)(Math.random()*(max-min)+min);
	}
	
	/**
	 * 给用户提示信息的同时，请用户输入一个整数
	 * @param msg
	 * @param scanner
	 * @return
	 */
	public static int getInputNumber(String msg,Scanner scanner) {
		 System.out.println(msg);
		 return scanner.nextInt();
	}
	/**
	 * 给用户提示信息的同时，请用户输入一个字符串
	 * @param msg
	 * @param scanner
	 * @return
	 */
	public static String getInputString(String msg,Scanner scanner) {
		 System.out.println(msg);
		 return scanner.next();
	}
}
