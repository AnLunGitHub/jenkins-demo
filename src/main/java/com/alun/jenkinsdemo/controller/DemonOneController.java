package com.alun.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : alun
 * @program : jenkinsdemo
 * @description : 测试
 * @date : 2020-07-31 07:35
 **/
@Controller
public class DemonOneController {
    @RequestMapping("/testone")
    @ResponseBody
    public String testOne(){
        return "进来了哈";
    }
}
