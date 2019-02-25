package com.gym.ssm.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author ywj
 * @Describe
 * @Date 2019/2/25 0025 21:51
 */
@Controller
@RequestMapping("/ss")
public class TestController {
    @RequestMapping("/ll")
    @ResponseBody
    public String test(){
        return "hhh";
    }
}
