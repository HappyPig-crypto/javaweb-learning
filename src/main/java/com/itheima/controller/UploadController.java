package com.itheima.controller;

import com.itheima.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * ClassName: UploadController
 * Description:
 *
 * @Author 57121306代亚楠
 * @Create 2023/9/18 17:40
 * @Version 1.0
 */
@Slf4j
@RestController
public class UploadController {
    @PostMapping("/upload")
    public Result upload(String username , Integer age, MultipartFile image ) throws IOException {
        log.info("文件上传: {}, {}, {}",username, age,image);
        String originalFilename = image.getOriginalFilename();
        int index = originalFilename.lastIndexOf(".");
        String extname = originalFilename.substring(index);
        String newFileName = UUID.randomUUID().toString() + extname;
        log.info("新增文件名 ：{}",newFileName);
        image.transferTo(new File("D:/images/" + newFileName));
        return Result.success();


    }
}
