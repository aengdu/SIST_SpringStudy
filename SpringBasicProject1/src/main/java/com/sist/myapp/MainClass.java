package com.sist.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// XML,Container ȣ�� 
/*
 *    1) �������� ����� Ŭ���� ���� => Model,DAO,Manager... (����� ������ �ִ� Ŭ����)
 *    2) ���� : ����� ���� �������� => VO , DTO , Bean
 *    -------------------------------------------------------------------
 *    3) XML�� �̿��ؼ� ��� 
 *    4) =================== ������ ���̺귯�󿡼� ó�� (ApplicationContext)
 *    5) ��ϵ� Ŭ������ ApplicationContext���� ���ͼ� ���� ========================> ����
 *    6) ApplicationContext���� ��ϵ� Ŭ������ �Ҹ�
 *    
 *       ������ ���̺귯��(�ڹټҽ� �ڵ��� �Ұ���)  <========> �����(���α׷��ӿ� ���)
 *                                        XML,Annotation => ��Ÿ������ 
 *       ==============================
 *       ���� : ��ü ���� / ��ü �Ҹ� / ��ü ã�� ==> getBean() ==> DL
 *    7) ���� : ��ü�� �����Ҷ� �ʿ��� �����Ͱ� �ִ¸� => DI
 *    -------------------------------------------- XML�� �޴��� , Annotation�� �˻� 
 *                                                 ---------------------------
 *    => MVC (���̺귯��) ,  Ŭ���� ������ (���� ���ռ�) => �����ÿ� �ٸ� Ŭ������ ������ ���� ���� (��������)
 *    =================================================================================
 *    
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext app=
        		new ClassPathXmlApplicationContext("app.xml");
        // ClassPath => src/main/java
        AModel a=(AModel)app.getBean("a");
        a.display();
        System.out.println("a="+a);
        AModel b=(AModel)app.getBean("a");
        b.display();
        System.out.println("b="+b);
	}

}