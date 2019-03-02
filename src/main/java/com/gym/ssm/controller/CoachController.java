package com.gym.ssm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gym.ssm.base.PageBean;
import com.gym.ssm.entity.Coach;
import com.gym.ssm.mapper.CoachMapper;
import com.gym.ssm.service.CoachSeriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
3.2
 */
@Controller
@RequestMapping("/coach")
public class CoachController {

    @Autowired
    private CoachSeriver coachSeriver;

    @Autowired
    private CoachMapper coachMapper;

    /**
     * 查询全部
     */
    @RequestMapping("/getcoach")
    @ResponseBody
    public Map<String, Object> getCoachAll(Coach coach, HttpServletRequest request) {
        PageBean pageBea = new PageBean();
        pageBea.setPageBean(request);
        //前段传过来的page和limit的值  放入到pagehelper中
        Page<Object> objects = PageHelper.startPage(pageBea.getPage(), pageBea.getRows());
        List list = coachSeriver.listCoach(coach);
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    /**
     * 前台跳转页面到客户页面
     *
     * @return
     */
    @RequestMapping("/get")
    public String get() {
        return "coach";
    }

    /**
     * 添加一个教练   添加成功返回true  否 返回false
     *
     * @param coach
     * @return
     */
    @ResponseBody
    @RequestMapping("/addcoach")
    public boolean addCoach(Coach coach) {
        if (coachSeriver.addCoach(coach) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 删除一个教练
     *
     * @param jid
     * @return
     */
    @RequestMapping("/deletecoach")
    @ResponseBody
    public boolean deleteCoach(Integer jid) {
        if (coachSeriver.deleteCoach(jid) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 修改教练信息
     *
     * @param coach
     * @return
     */
    @RequestMapping("/updatecoach")
    @ResponseBody
    public boolean updateCoach(Coach coach) {
        if (coachSeriver.updateCoach(coach) > 0) {
            return true;
        }
        return false;
    }


    /**
    * 查询全部教练
    * @author      hhh
    * @return
    * @exception
    * @date        2019/3/1 9:54
    */
    @RequestMapping("/getCoachs")
    @ResponseBody
    public List<Coach> ListCoach() {
        return coachMapper.selectAll();
    }


    /**
    * 客户预约教练的信息
    * @author      hhh
    * @return
    * @exception
    * @date        2019/3/1 9:57
    */
    @RequestMapping("/getcoachandvip")
    @ResponseBody
    public Map<String,Object> listCoachAndVip(Coach coach,HttpServletRequest request){
        PageBean pageBean=new PageBean();
        pageBean.setPageBean(request);
        PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        List<Map<String, Object>> list = coachSeriver.listCoachAndVip(coach);
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }



    /**
    * 跳转至教练详情页面
    * @author      hhh
    * @return
    * @exception
    * @date        2019/3/1 10:45
    */
    @RequestMapping("/coachdetails")
    public String coachByid(HttpServletRequest request){
        return "coachdetails";
    }

    /**
    * 修改教练和会员中间表的状态
    * @author      hhh
    * @return
    * @exception
    * @date        2019/3/1 20:22
    */
    @RequestMapping("/updatemiddle")
    @ResponseBody
    public boolean updateMiddle(int sta,int id){
        if(coachSeriver.updateMiddle(sta,id)>0){
            return true;
        }
        return false;
    }




}
