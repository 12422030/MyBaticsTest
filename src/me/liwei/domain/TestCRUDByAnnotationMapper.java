package me.liwei.domain;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import me.liwei.mapping.UserMapperI;

public class TestCRUDByAnnotationMapper {

	@Test
	public void testAdd() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		// �õ�UserMapperI�ӿڵ�ʵ�������UserMapperI�ӿڵ�ʵ���������sqlSession.getMapper(UserMapperI.class)��̬��������
		UserMapperI mapper = sqlSession.getMapper(UserMapperI.class);
		User user = new User();
		user.setName("�û�xdp");
		user.setAge(20);
		int add = mapper.add(user);
		// ʹ��SqlSessionִ����SQL֮����Ҫ�ر�SqlSession
		sqlSession.close();
		System.out.println(add);
	}
}
