package com.hycc.school;

import java.util.*;

public class StudentSystem implements StudentInterface{
	//ʹ��hashMap�������е�ѧ����Ϣ�������е�Enter��key��ѧ�ţ�value����ѧ�Ŷ�Ӧ��ѧ������
	private Map<Integer,Student> students = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	
	public void welcome() {
		System.out.println("***********��ӭ����ѧ������ϵͳ************");
		System.out.println("ϵͳ��ʼ���ɹ�......");
	}
	public void exit() {
		System.out.println("****************ллʹ�ñ�����ϵͳ****************");
	}
	
	/**
	 * ��ʾϵͳ�˵�
	 */
	public void showMenu() {
		System.out.println("\n�����˵����ݣ�");
		System.out.println("1-->��ʾ����ѧ����Ϣ");
		System.out.println("2-->���ѧ����Ϣ");
		System.out.println("3-->����ѧ�Ų���");
		System.out.println("4-->������������");
		System.out.println("5-->����ѧ��ɾ��");
		System.out.println("6-->����ѧ���޸�");
		System.out.println("7-->�˳�ϵͳ");
	}
	
	
	
	
	
	//��������ѧ����Ϣ
	@Override
	public void showAll() {
		//�õ����е�ѧ��
		Set<Integer> sids = students.keySet();
		Iterator<Integer> iterator = sids.iterator();
		while(iterator.hasNext()) {
			Integer sid = iterator.next();
			Student student = students.get(sid);
			System.out.println(student);
		}
	}
	
/*
 * ���ѧ����Ϣ
* @return ��ӳɹ�������true������false 
*/
	@Override
	public boolean addStudent() {
//		System.out.println("������ѧ��ѧ�ţ�Ҫ��������");
//		int sid = scanner.nextInt();
		int sid = MyUtil.getInputNumber("������ѧ��ѧ�ţ�Ҫ����������", scanner);
		String name = MyUtil.getInputString("������ѧ��������", scanner);
		int age=MyUtil.getInputNumber("������ѧ�����䣺", scanner);
		Gender gender = MyUtil.getInputString("������ѧ���Ա��� or Ů", scanner).equals("��")?Gender.��:Gender.Ů;
		
		Student s = new Student(sid,name,sid,gender); 
		students.put(sid,s);
		System.out.println("���ѧ���ɹ���");
		return false; 
	}
/**
 * ����ѧ�Ų���ѧ��
 */
	@Override
	public Student findStuBySid(int sid) {
		Student student = students.get(sid);
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("��ѧ�������ڣ�");
		}
		return student;
	}
	
	public Student findStuBySid() {
		int sid = MyUtil.getInputNumber("������Ҫ���ҵ�ѧ����ѧ�ţ�", scanner);
		return findStuBySid(sid);
	}
/*
 * �������ֲ���ѧ��
 * @param name
 * @return �������и�����Ϊname��ѧ���б��������ڷ���null
 */
	@Override
	public List<Student> findStusByName(String name) {
		List<Student> list = new ArrayList<>();
		//�������е�ѧ����Ȼ���name����Ƚ�
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
		String name = MyUtil.getInputString("������Ҫ���ҵ�ѧ����������", scanner);
		List<Student> stus = findStusByName(name);
		if(stus==null) {
			System.out.println("��������ѧ�������ڣ�");
		}else {
			//��ӡ����ѧ����Ϣ
			System.out.println("���ҵ���ѧ����Ϣ���£�");
			for(int i=0;i<stus.size();i++) {
			System.out.println(stus.get(i));
			}
		}
	}
	
/*
 * ����ѧ��ɾ��
 *@param sid
 *@return ɾ���ɹ�������true������false
 */
	@Override
	public boolean removeStuBySid(int sid) {
		Student student = students.remove(sid);
		return student==null?false:true;
	}
	
	public void removeStuBySid() {
		int sid = MyUtil.getInputNumber("������Ҫɾ����ѧ����ѧ�ţ�", scanner);
		boolean bool = removeStuBySid(sid);
		if(true) {
			System.out.println("ɾ��ѧ���ɹ���");
		}else {
			System.out.println("��ѧ�������ڣ�");
		}
	}

/**
 * ����ѧ���޸�ѧ��
 * @param sid
 * @return �޸ĳɹ�����true������false
 */
	@Override
	public boolean modifyStuBySid(int sid) {
		Student student = students.get(sid);
		if(student!=null) {
			sid = MyUtil.getInputNumber("�������µ�ѧ��ѧ�ţ�Ҫ����������", scanner);
			String name = MyUtil.getInputString("�������µ�ѧ��������", scanner);
			int age=MyUtil.getInputNumber("�������µ�ѧ�����䣺", scanner);
			Gender gender = MyUtil.getInputString("�������µ�ѧ���Ա��� or Ů", scanner).equals("��")?Gender.��:Gender.Ů;
			student.setAge(age);
			student.setName(name);
			student.setGender(gender);
			student.setSid(sid);
		}
		return student == null?false:true;
	}
	
	public void modifyStuBySid() {
		int sid = MyUtil.getInputNumber("������Ҫ�޸ĵ�ѧ����ѧ�ţ�", scanner);
		boolean bool = modifyStuBySid(sid);
		if(bool) {
			System.out.println("�޸�ѧ����Ϣ�ɹ���");
		}else {
			System.out.println("ѧ�������ڣ�");
		}
	}
	
	
}
