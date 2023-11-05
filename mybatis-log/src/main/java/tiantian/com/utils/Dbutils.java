package tiantian.com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 天天
 * @date 2023/11/3 20:33
 * @description
 */
public class Dbutils {
    private static SqlSessionFactory sqlSessionFactory;

    //    用static包含的目的是，程序一开始就执行static里面的
    static {
        String  resource = "mybatis-config.xml";
        try {
//使用mybatis第一步，获取sqlSessionFactory对象，
//        SqlSessionFactory的最终目的是获取sqlsession

            InputStream inputStream = Resources.getResourceAsStream(resource);
//       提升作用域，将其变为全局变量
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
//        通过 SqlSessionFactory是获取sqlsession实例
//    sqlsession完全包含了面向数据库执行力SQL命令的所有方法
//    SqlSession sqlsession = sqlSessionFactory.openSession();
//    return sqlsession;
//    优化后
        return sqlSessionFactory.openSession();
    }
}


