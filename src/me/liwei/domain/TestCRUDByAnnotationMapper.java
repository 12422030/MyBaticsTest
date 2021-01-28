package me.liwei.domain;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import me.liwei.mapping.UserMapperI;

public class TestCRUDByAnnotationMapper {

	@Test
	public void testAdd() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		// 得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		User user = new User();
		user.setName("用户xdp");
		user.setAge(20);
		int add = mapper.add(user);
		// 使用SqlSession执行完SQL之后需要关闭SqlSession
		sqlSession.close();
		System.out.println(add);
	}
}
