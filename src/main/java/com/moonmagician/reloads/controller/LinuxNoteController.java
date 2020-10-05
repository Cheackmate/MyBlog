package com.moonmagician.reloads.controller;

import org.springframework.stereotype.Controller;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileNotFoundException;

@Controller
public class LinuxNoteController {
    @RequestMapping("/linuxnote/note/{id}")
    public void toLinuxNotePath(@PathVariable("id") int id) throws FileNotFoundException {
        //获取linuxnote文件夹下所有文件的名称，然后存放到一个数组中，使用id访问指定的文件

        //获取项目根路径
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new File("");
        System.out.println("path:"+path.getAbsolutePath());

    }
}
