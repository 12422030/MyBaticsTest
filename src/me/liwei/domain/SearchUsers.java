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
//基于注解的实现
//插入
//		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
//		// 得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
//		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
//		User user = new User();
//		user.setName("用户xdp");
//		user.setAge(20);
//		System.out.println("111111111111");
//		int add = mapper.add(user);
//		System.out.println("222222222222");
//		// 使用SqlSession执行完SQL之后需要关闭SqlSession
//		sqlSession.close();
//		System.out.println("插入成功!");
//		System.out.println(add);
//		
//		
//		
////更新
//				SqlSession sqlSession1 = MyBatisUtil.getSqlSession(true);
//				// 得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
//				UserMapperI mapper1 = sqlSession1.getMapper(UserMapperI.class);
//				User user1 = new User();
//				user1.setId(4);
//				user1.setName("用户liwei");
//				user1.setAge(25);
//				System.out.println("33333333");
//				int update = mapper1.update(user1);
//				System.out.println("4444444444");
//				// 使用SqlSession执行完SQL之后需要关闭SqlSession
//				sqlSession1.close();
//				System.out.println("更新成功!");
//				System.out.println(update);
		
//删除		
//				 SqlSession sqlSession2 = MyBatisUtil.getSqlSession(true);
//				 //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
//				 UserMapperI mapper2 = sqlSession2.getMapper(UserMapperI.class);
//				 //执行删除操作
//				 int delete = mapper2.deleteById(7);
//				 //使用SqlSession执行完SQL之后需要关闭SqlSession
//				 sqlSession2.close();
//				 System.out.println(delete);

//返回结果为User
//				 SqlSession sqlSession3 = MyBatisUtil.getSqlSession();
//				 //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
//				 UserMapperI mapper3 = sqlSession3.getMapper(UserMapperI.class);
//				 //执行查询操作，将查询结果自动封装成User返回
//				 User user3 = mapper3.getById(8);
//				 //使用SqlSession执行完SQL之后需要关闭SqlSession
//				 sqlSession3.close();
//				 System.out.println(user3);
				 
				 SqlSession sqlSession4 = MyBatisUtil.getSqlSession();
				 //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
				 UserMapperI mapper4 = sqlSession4.getMapper(UserMapperI.class);
				 //执行查询操作，将查询结果自动封装成List<User>返回
				 List<User> lstUsers = mapper4.getAll();
				 //使用SqlSession执行完SQL之后需要关闭SqlSession
				 sqlSession4.close();
				 System.out.println(lstUsers);
		
		

		
	}

}
