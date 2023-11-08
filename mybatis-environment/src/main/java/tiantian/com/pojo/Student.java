package tiantian.com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 天天
 * @date 2023/11/6 16:32
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
//    private int tid;
    private Teacher teacher;
}
