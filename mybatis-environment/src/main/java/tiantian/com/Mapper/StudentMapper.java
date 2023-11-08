package tiantian.com.Mapper;

import org.apache.ibatis.annotations.Select;
import tiantian.com.pojo.Student;

import java.util.List;

/**
 * @author 天天
 * @date 2023/11/6 16:31
 * @description
 */
public interface StudentMapper {
//     查询所有的学生信息，以及对应的老师信息
//    @Select("select * from student")
    public List<Student> getStudent();
//    方式二
    public List<Student> getStudent2();
}
