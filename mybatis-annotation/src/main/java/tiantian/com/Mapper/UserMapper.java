package tiantian.com.Mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tiantian.com.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author 天天
 * @date 2023/11/6 9:11
 * @description
 */
//使用注解，写增删改查
public interface UserMapper {
//    1.使用查询注解
    @Select("select * from user")
    public List<User> ListfindAll();
    @Select("insert into user (id,name,pwd) values(#{id},#{name},#{pwd})")
   public User addUser(User user);
    @Select("update user set name=#{name},pwd=#{pwd}where id=#{id}")
    public User updateUser(User user);
//如果参数是单个属性，要用@Param 进行传参
    @Select("select *from user where id=#{id}")
    public User findbyid(@Param("id")int id);
}
