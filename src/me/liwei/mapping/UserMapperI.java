package me.liwei.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import me.liwei.domain.User;

public interface UserMapperI {
	// ʹ��@Insertע��ָ��add����Ҫִ�е�SQL
		@Insert("insert into mybatis.users(name, age) values(#{name}, #{age})")
		public int add(User user);

		// ʹ��@Deleteע��ָ��deleteById����Ҫִ�е�SQL
		@Delete("delete from mybatis.users where id=#{id}")
		public int deleteById(int id);

		// ʹ��@Updateע��ָ��update����Ҫִ�е�SQL
		@Update("update mybatis.users set name=#{name},age=#{age} where id=#{id}")
		public int update(User user);

		// ʹ��@Selectע��ָ��getById����Ҫִ�е�SQL
		@Select("select * from mybatis.users where id=#{id}")
		public User getById(int id);

		// ʹ��@Selectע��ָ��getAll����Ҫִ�е�SQL
		@Select("select * from mybatis.users")
		public List<User> getAll();
}
