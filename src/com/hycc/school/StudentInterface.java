package com.hycc.school;
/*
 * ���ܣ�
 * ��������ѧ����Ϣ 
 * ���ѧ����Ϣ 
 * ����ѧ�Ų���ѧ����Ϣ
 * �������ֲ���ѧ��
 * ����ѧ��ɾ��ѧ��
 * ����ѧ���޸�ѧ��
 */

import java.util.List;

public interface StudentInterface {
	//��������ѧ����Ϣ
	void showAll();
	/*
	 * ���ѧ����Ϣ
	 * @return ��ӳɹ�������true������false 
	 */
	boolean addStudent();
	/*
	 * ����ѧ�Ų���ѧ����Ϣ
	 *@return ���ҵ���ѧ��������������ڣ�����null
	 */
	Student findStuBySid(int sid);
	/*
	 * �������ֲ���ѧ��
	 * @return �������и�����Ϊname��ѧ�����б�,��������ڣ�����null
	 */
	List<Student> findStusByName(String name);
	/*
	 * ����ѧ��ɾ��ѧ��
	 * @param sid
	 * @return ���ɾ���ɹ�������true������false
	 */
	boolean removeStuBySid(int sid);
	/*
	 * ����ѧ���޸�ѧ��
	 * @param sid
	 * @return ����޸ĳɹ�������true������false
	 */
	boolean modifyStuBySid(int sid);
	
}
