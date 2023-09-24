package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.executor.loader.ResultLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: DeptController
 * Description:
 *
 * @Author 57121306代亚楠
 * @Create 2023/9/16 13:03
 * @Version 1.0
 */
@Slf4j
@RestController
public class DeptController {
//    private static Logger log = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptService deptService;

    //@RequestMapping(value = "/depts",method = RequestMethod.GET)
    @GetMapping("/depts")
    public Result list() {
        log.info("查询全部部门数据");
       List<Dept> deptList =  deptService.list();
        return Result.success(deptList);
    }
    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id) {
         log.info("根据id删除部门:{},id");
         deptService.delete(id);
         return Result.success();
    }
    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept) {
        log.info("新增部门: {}" ,dept);
        deptService.add(dept);
        return Result.success();

    }
    @GetMapping("/depts/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("获取部门ID:{}",id);
        Dept dept=deptService.getById(id);
        return Result.success(dept);
    }
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept) {
        log.info("修改部门:{}",dept);
        deptService.update(dept);
        return Result.success();
    }

}
