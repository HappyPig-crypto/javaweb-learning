package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.logging.log4j.spi.StandardLevel;

import javax.xml.stream.events.StartDocument;
import java.net.PortUnreachableException;
import java.nio.channels.Pipe;
import java.time.LocalDate;
import java.util.List;

/**
 * ClassName: EmpMapper
 * Description:
 *
 * @Author 57121306代亚楠
 * @Create 2023/9/16 13:13
 * @Version 1.0
 */
@Mapper
public interface EmpMapper {
//    @Select("select * from emp")

    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

    void delete (List<Integer> ids);
@Insert("insert  into emp(username ,name ,gender, image, job, entrydate, dept_id,create_time,update_time)" +
        "values (#{username}, #{name},#{gender},#{image},#{job}, #{entrydate},#{depId},#{createTime},#{updateTime})")
    void insert(Emp emp);
@Select("SELECT * from emp where username = #{username} and password = #{password}")
    Emp getByUsernameAndPassword(Emp emp);

/*
* 根据部门id删除部门下员工数据
* */
@Delete("delete from emp where dept_id = #{depId}")
void deleteByDeptId(Integer deptId);
}
