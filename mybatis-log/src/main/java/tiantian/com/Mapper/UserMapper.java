 package tiantian.com.Mapper;

import tiantian.com.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author 天天
 * @date 2023/11/3 20:31
 * @description
 */
public interface UserMapper {
   public List<User> ListfindAll();
    List<User> getUserByLimit(Map<String,Integer> map);
    List<User> getUserByRowBound(Map<String,Integer> map);
}
