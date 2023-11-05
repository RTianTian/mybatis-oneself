package tiantian.com.test;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
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
    static  Logger logger = Logger.getLogger(UserTest.class);
    @Test
    public void List(){
//        打印当前类的日志工厂
        SqlSession session = Dbutils.getSqlSession();
        logger.info("测试，查询该目录成功");
        UserMapper mapper = session.getMapper(UserMapper.class);
        for (User user:mapper.ListfindAll()){
            System.out.println(user);
        }
        session.close();
    }
@Test
    public void testLog4j(){
        logger.info("info:进入了testLog4j");
        logger.error("error:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
    }
//    分页查询
    @Test
    public void getUserByLimit(){
        SqlSession session = Dbutils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",2);
        map.put("pageSize",2);
        List<User> UserList = mapper.getUserByLimit(map);
        for (User user:UserList){
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void getUserByRowBound(){
        SqlSession session = Dbutils.getSqlSession();
//      RowBounds实现(1,2]
        RowBounds rowBounds = new RowBounds(1, 2);
//        通过Java代码层面实现分页
        List<User> userList = session.selectList("tiantian.com.Mapper.UserMapper.getUserByRowBound",null,rowBounds);
        for (User user:userList){
            System.out.println(user);
        }
        session.close();
    }
}

