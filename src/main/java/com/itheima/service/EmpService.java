package com.itheima.service;

import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

/**
 * ClassName: EmptService
 * Description:
 *
 * @Author 57121306代亚楠
 * @Create 2023/9/16 13:05
 * @Version 1.0
 */
public interface EmpService {



    PageBean page(Integer page, Integer pagesize, String name, Short gender, LocalDate begin, LocalDate end);

    void delete(List<Integer> ids);

    void save(Emp emp);

    Emp login(Emp emp);
}
