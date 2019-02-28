package com.gym.ssm.controller;

import com.gym.ssm.entity.vip;
import com.gym.ssm.service.vipBiz;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @authorリバティの風
 * @site
 * @company
 * @create 2019-02-26-21:20
 */
@Controller

@RequestMapping("/vip")
public class vipController {
    @Autowired
    private vipBiz vipBiz;

    /**
     * 会员个人信息
     * @param request
     * @param hid
     * @return
     */
    @RequestMapping("/vip")
    public String vipselectbyid(HttpServletRequest request,Integer hid){
        vip vipselectbyhid = vipBiz.vipselectbyhid(1);
        request.setAttribute("vipselectbyhid",vipselectbyhid);
        System.out.println(vipselectbyhid);
        return "vip";
    }

    /**
     * 修改头像
     * @param request
     * @param xxx
     * @return
     */
    @RequestMapping("/upload")
    public String up(HttpServletRequest request, MultipartFile xxx) {
        try {
            FileUtils.copyInputStreamToFile(xxx.getInputStream(), new File("D://3/" + xxx.getOriginalFilename()));

        } catch (IOException e) {
            e.printStackTrace();
        }
        vip v=new vip();
        v.setHid(Integer.parseInt(request.getParameter("hid")));
        v.setImg(xxx.getOriginalFilename());
        vipBiz.uploadimg(v);
       return "redirect:/vip/vip";
    }

    @RequestMapping("/update")
    public String update(HttpServletRequest request,vip vip){
        System.out.println(request.getParameter("hid"));
        System.out.println(vip.getHid());
        vipBiz.update(vip);
            request.getSession().setAttribute("message", "信息已更新");



        return "redirect:/vip/vip";
    }
}
