package com.hycc.school;

import java.util.*;

public class StudentSystem implements StudentInterface{
	//使用hashMap保存所有的学生信息，容器中的Enter的key是学号，value就是学号对应的学生对象
	private Map<Integer,Student> students = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	
	public void welcome() {
		System.out.println("***********欢迎来到学生管理系统************");
		System.out.println("系统初始化成功......");
	}
	public void exit() {
		System.out.println("****************谢谢使用本管理系统****************");
	}
	
	/**
	 * 显示系统菜单
	 */
	public void showMenu() {
		System.out.println("\n操作菜单内容：");
		System.out.println("1-->显示所有学生信息");
		System.out.println("2-->添加学生信息");
		System.out.println("3-->根据学号查找");
		System.out.println("4-->根据姓名查找");
		System.out.println("5-->根据学号删除");
		System.out.println("6-->根据学号修改");
		System.out.println("7-->退出系统");
	}
	
	
	
	
	
	//遍历所有学生信息
	@Override
	public void showAll() {
		//得到所有的学号
		Set<Integer> sids = students.keySet();
		Iterator<Integer> iterator = sids.iterator();
		while(iterator.hasNext()) {
			Integer sid = iterator.next();
			Student student = students.get(sid);
			System.out.println(student);
		}
	}
	
/*
 * 添加学生信息
* @return 添加成功，返回true，否则false 
*/
	@Override
	public boolean addStudent() {
//		System.out.println("请输入学生学号，要求整数：");
//		int sid = scanner.nextInt();
		int sid = MyUtil.getInputNumber("请输入学生学号，要求是整数：", scanner);
		String name = MyUtil.getInputString("请输入学生姓名：", scanner);
		int age=MyUtil.getInputNumber("请输入学生年龄：", scanner);
		Gender gender = MyUtil.getInputString("请输入学生性别：男 or 女", scanner).equals("男")?Gender.男:Gender.女;
		
		Student s = new Student(sid,name,sid,gender); 
		students.put(sid,s);
		System.out.println("添加学生成功！");
		return false; 
	}
/**
 * 根据学号查找学生
 */
	@Override
	public Student findStuBySid(int sid) {
		Student student = students.get(sid);
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("该学生不存在！");
		}
		return student;
	}
	
	public Student findStuBySid() {
		int sid = MyUtil.getInputNumber("请输入要查找的学生的学号：", scanner);
		return findStuBySid(sid);
	}
/*
 * 根据名字查找学生
 * @param name
 * @return 返回所有该名字为name的学生列表，若不存在返回null
 */
	@Override
	public List<Student> findStusByName(String name) {
		List<Student> list = new ArrayList<>();
		//遍历所有的学生，然后和name逐个比较
		Collection<Student> stus = students.values();
		Iterator<Student> iterator= stus.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getName().equals(name)) {
				list.add(student);
			}
		}
		return list.size() == 0?null : list; 
	}
	
	public void findStusByName(){
		String name = MyUtil.getInputString("请输入要查找的学生的姓名：", scanner);
		List<Student> stus = findStusByName(name);
		if(stus==null) {
			System.out.println("该姓名的学生不存在！");
		}else {
			//打印所有学生信息
			System.out.println("查找到的学生信息如下：");
			for(int i=0;i<stus.size();i++) {
			System.out.println(stus.get(i));
			}
		}
	}
	
/*
 * 根据学号删除
 *@param sid
 *@return 删除成功，返回true；否则false
 */
	@Override
	public boolean removeStuBySid(int sid) {
		Student student = students.remove(sid);
		return student==null?false:true;
	}
	
	public void removeStuBySid() {
		int sid = MyUtil.getInputNumber("请输入要删除的学生的学号：", scanner);
		boolean bool = removeStuBySid(sid);
		if(true) {
			System.out.println("删除学生成功！");
		}else {
			System.out.println("该学生不存在！");
		}
	}

/**
 * 根据学号修改学生
 * @param sid
 * @return 修改成功返回true；否则false
 */
	@Override
	public boolean modifyStuBySid(int sid) {
		Student student = students.get(sid);
		if(student!=null) {
			sid = MyUtil.getInputNumber("请输入新的学生学号，要求是整数：", scanner);
			String name = MyUtil.getInputString("请输入新的学生姓名：", scanner);
			int age=MyUtil.getInputNumber("请输入新的学生年龄：", scanner);
			Gender gender = MyUtil.getInputString("请输入新的学生性别：男 or 女", scanner).equals("男")?Gender.男:Gender.女;
			student.setAge(age);
			student.setName(name);
			student.setGender(gender);
			student.setSid(sid);
		}
		return student == null?false:true;
	}
	
	public void modifyStuBySid() {
		int sid = MyUtil.getInputNumber("请输入要修改的学生的学号：", scanner);
		boolean bool = modifyStuBySid(sid);
		if(bool) {
			System.out.println("修改学生信息成功！");
		}else {
			System.out.println("学生不存在！");
		}
	}
	
	
}
