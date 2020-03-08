package com.hycc.school;
/*
 * 功能：
 * 遍历所有学生信息 
 * 添加学生信息 
 * 根据学号查找学生信息
 * 根据名字查找学生
 * 根据学号删除学生
 * 根据学号修改学生
 */

import java.util.List;

public interface StudentInterface {
	//遍历所有学生信息
	void showAll();
	/*
	 * 添加学生信息
	 * @return 添加成功，返回true，否则false 
	 */
	boolean addStudent();
	/*
	 * 根据学号查找学生信息
	 *@return 被找到的学生对象，如果不存在，返回null
	 */
	Student findStuBySid(int sid);
	/*
	 * 根据名字查找学生
	 * @return 返回所有该名字为name的学生的列表,如果不存在，返回null
	 */
	List<Student> findStusByName(String name);
	/*
	 * 根据学号删除学生
	 * @param sid
	 * @return 如果删除成功，返回true；否则false
	 */
	boolean removeStuBySid(int sid);
	/*
	 * 根据学号修改学生
	 * @param sid
	 * @return 如果修改成功，返回true，否则false
	 */
	boolean modifyStuBySid(int sid);
	
}
