package me.liwei.domain;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import me.liwei.mapping.UserMapperI;

public class SearchUsers {

	public static void main(String[] args) throws IOException {
//����ע���ʵ��
//����
//		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
//		// �õ�UserMapperI�ӿڵ�ʵ�������UserMapperI�ӿڵ�ʵ���������sqlSession.getMapper(UserMapperI.class)��̬��������
//		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
//		User user = new User();
//		user.setName("�û�xdp");
//		user.setAge(20);
//		System.out.println("111111111111");
//		int add = mapper.add(user);
//		System.out.println("222222222222");
//		// ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
//		sqlSession.close();
//		System.out.println("����ɹ�!");
//		System.out.println(add);
//		
//		
//		
////����
//				SqlSession sqlSession1 = MyBatisUtil.getSqlSession(true);
//				// �õ�UserMapperI�ӿڵ�ʵ�������UserMapperI�ӿڵ�ʵ���������sqlSession.getMapper(UserMapperI.class)��̬��������
//				UserMapperI mapper1 = sqlSession1.getMapper(UserMapperI.class);
//				User user1 = new User();
//				user1.setId(4);
//				user1.setName("�û�liwei");
//				user1.setAge(25);
//				System.out.println("33333333");
//				int update = mapper1.update(user1);
//				System.out.println("4444444444");
//				// ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
//				sqlSession1.close();
//				System.out.println("���³ɹ�!");
//				System.out.println(update);
		
//ɾ��		
//				 SqlSession sqlSession2 = MyBatisUtil.getSqlSession(true);
//				 //�õ�UserMapperI�ӿڵ�ʵ�������UserMapperI�ӿڵ�ʵ���������sqlSession.getMapper(UserMapperI.class)��̬��������
//				 UserMapperI mapper2 = sqlSession2.getMapper(UserMapperI.class);
//				 //ִ��ɾ������
//				 int delete = mapper2.deleteById(7);
//				 //ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
//				 sqlSession2.close();
//				 System.out.println(delete);

//���ؽ��ΪUser
//				 SqlSession sqlSession3 = MyBatisUtil.getSqlSession();
//				 //�õ�UserMapperI�ӿڵ�ʵ�������UserMapperI�ӿڵ�ʵ���������sqlSession.getMapper(UserMapperI.class)��̬��������
//				 UserMapperI mapper3 = sqlSession3.getMapper(UserMapperI.class);
//				 //ִ�в�ѯ����������ѯ����Զ���װ��User����
//				 User user3 = mapper3.getById(8);
//				 //ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
//				 sqlSession3.close();
//				 System.out.println(user3);
				 
				 SqlSession sqlSession4 = MyBatisUtil.getSqlSession();
				 //�õ�UserMapperI�ӿڵ�ʵ�������UserMapperI�ӿڵ�ʵ���������sqlSession.getMapper(UserMapperI.class)��̬��������
				 UserMapperI mapper4 = sqlSession4.getMapper(UserMapperI.class);
				 //ִ�в�ѯ����������ѯ����Զ���װ��List<User>����
				 List<User> lstUsers = mapper4.getAll();
				 //ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
				 sqlSession4.close();
				 System.out.println(lstUsers);
		
		

		
	}

}
