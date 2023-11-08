package tiantian.com.Mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tiantian.com.pojo.Teacher;

/**
 * @author 天天
 * @date 2023/11/6 16:31
 * @description
 */
public interface TeacherMapper {
    @Select("select * from teacher where id=#{tid}")
Teacher getTeacher(@Param("tid") int id);
}
