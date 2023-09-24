package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * ClassName: DeptMapper
 * Description:
 *
 * @Author 57121306代亚楠
 * @Create 2023/9/16 13:13
 * @Version 1.0
 */
@Mapper
public interface DeptMapper {
    @Select("select  * from dept")
    List<Dept> list();
    @Delete("delete from dept where id =  #{id}")
    void deleteById(Integer id);
    @Insert("insert  into dept (name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);
    @Select("select * from dept where id = #{id}")

    Dept getById(Integer id);
@Update("update dept set name = #{name},update_time=#{updateTime} where id = #{id}")
    void update(Dept dept);
}
