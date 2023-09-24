package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: PageBean
 * Description:
 *
 * @Author 57121306代亚楠
 * @Create 2023/9/17 10:14
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    private long total;
    private List rows;
}
