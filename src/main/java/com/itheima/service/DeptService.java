package com.itheima.service;

import com.itheima.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: DeptService
 * Description:
 *
 * @Author 57121306代亚楠
 * @Create 2023/9/16 13:05
 * @Version 1.0
 */

    public interface DeptService {
        List<Dept> list();
        void delete(Integer id);

        void add(Dept dept);

        Dept getById(Integer id);

    void update(Dept dept);
}
