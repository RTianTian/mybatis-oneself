package tiantian.com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 天天
 * @date 2023/11/3 20:36
 * @description
 */
@Data//get、set、toString、hashcode()方法
@AllArgsConstructor //有参构造注解
@NoArgsConstructor //无参构造注解
public class User {
        private int id;
        private String name;
        private String pwd;


}


