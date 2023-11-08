import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import tiantian.com.Mapper.StudentMapper;
import tiantian.com.Mapper.TeacherMapper;
import tiantian.com.pojo.Student;
import tiantian.com.pojo.Teacher;
import tiantian.com.utils.Dbutils;

import java.util.List;

/**
 * @author 天天
 * @date 2023/11/6 16:58
 * @description
 */
public class Mytest {
    public static void main(String[] args) {
        SqlSession sqlSession = Dbutils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(2);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void testStudent() {
        SqlSession sqlSession = Dbutils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    @Test
    public void testStudent2(){
        SqlSession sqlSession = Dbutils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
