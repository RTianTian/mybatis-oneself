package tiantian.com.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import tiantian.com.Mapper.UserMapper;
import tiantian.com.pojo.User;
import tiantian.com.utils.Dbutils;

import java.util.HashMap;
import java.util.List;

/**
 * @author 天天
 * @date 2023/11/3 20:34
 * @description
 */
public class UserTest {
    @Test
    public void List(){
        SqlSession session = Dbutils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        for (User user:mapper.ListfindAll()){
            System.out.println(user);
        }
        session.close();
    }

}
