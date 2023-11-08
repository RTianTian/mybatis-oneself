import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import tiantian.com.Mapper.UserMapper;
import tiantian.com.pojo.User;
import tiantian.com.utils.Dbutils;

/**
 * @author 天天
 * @date 2023/11/6 9:14
 * @description
 */
public class UserTest {
    @Test
    public void getList(){
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.ListfindAll();
    }
    @Test
    public void addUser(){
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.addUser(new User(9, "hello", "123456"));
        if (user!=null){
            sqlSession.commit();
            System.out.println("插入成功");
        }else {
            sqlSession.rollback();
        }
    sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.updateUser(new User(9, "world", "123456"));
        if (user!=null){
            sqlSession.commit();
            System.out.println("修改成功");
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
    }
    @Test
    public void findbyid(){
        SqlSession sqlSession = Dbutils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findbyid(9);
        if (user!=null){
            sqlSession.commit();
            System.out.println("根据id查询成功");
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
    }
}
