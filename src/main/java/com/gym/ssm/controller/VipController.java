package com.gym.ssm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gym.ssm.base.PageBean;
import com.gym.ssm.entity.Vip;
import com.gym.ssm.entity.peng.Login;
import com.gym.ssm.service.VipBiz;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @authorリバティの風
 * @site
 * @company
 * @create 2019-02-26-21:20
 *
 */
/*
3.2
 */
@Controller
@RequestMapping("/vip")
public class VipController {
    @Autowired
    private VipBiz VipBiz;

    /**
     * 会员个人信息
     * @param request
     * @param
     * @return
     */
    @RequestMapping("/vip")
    public String vipselectbyid(HttpServletRequest request){
        Login login =(Login) request.getSession().getAttribute("login");
         int hid=login.getAid();
        System.out.println("会员id"+hid);
        Vip vipselectbyhid = VipBiz.vipselectbyhid(hid);
        request.setAttribute("vipselectbyhid",vipselectbyhid);
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
        Vip v=new Vip();
        v.setHid(Integer.parseInt(request.getParameter("hid")));
        v.setImg(xxx.getOriginalFilename());
        VipBiz.uploadimg(v);
        System.out.println("upimg");
        return "forward:/vip/vip";
    }

    /**
     * 修改会员个人信息
     * @param request
     * @param Vip
     * @return
     */
    @RequestMapping("/update")
//    @ResponseBody
    public String update(HttpServletRequest request, Vip Vip){
        VipBiz.update(Vip);
        return "forward:/vip/vip";
    }

    /**
     * 课程
     * @param request
     * @param Vip
     * @return
     */
    @RequestMapping("/mycum")
    @ResponseBody
    public Map<Object,Object> mycum(HttpServletRequest request,Vip Vip){
        PageBean pageBea = new PageBean();
        pageBea.setPageBean(request);
        //前段传过来的page和limit的值  放入到pagehelper中
        Page<Object> objects = PageHelper.startPage(pageBea.getPage(), pageBea.getRows());
        Login login =(Login) request.getSession().getAttribute("login");
        int hid=login.getAid();
        Vip.setHid(hid);
        List<Map> listcum = VipBiz.listcum(Vip);
        PageInfo pageInfo = new PageInfo(listcum);
        Map<Object,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }


    /**
     * 会员信息
     * @param request
     * @param Vip
     * @return
     */
    @RequestMapping("/listvip")
    @ResponseBody
    public Map<Object,Object> listvip(HttpServletRequest request,Vip Vip){
        PageBean pageBea = new PageBean();
        pageBea.setPageBean(request);
        //前段传过来的page和limit的值  放入到pagehelper中
        Page<Object> objects = PageHelper.startPage(pageBea.getPage(), pageBea.getRows());
        List<Map> listvip = VipBiz.listvip(Vip);
        PageInfo pageInfo = new PageInfo(listvip);
        Map<Object,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    @RequestMapping("/delvip")
    @ResponseBody
    public String delvip(Vip vip){
        System.out.println("delete");
        VipBiz.delvip(vip);
        return "delseccuess";
    }
}
