package com.gym.ssm.service.Impl;

import com.gym.ssm.entity.peng.Admin;
import com.gym.ssm.entity.peng.Coach;
import com.gym.ssm.entity.Vip;
import com.gym.ssm.service.LoginService;
import com.gym.ssm.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectNmae:GYM03
 * @ClassName:UserService
 * @Description: TOOO
 * @Author:peng
 * @Date:2019/2/25 19:34
 * @Version:1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AdminMapper adminMapper;


    @Override
    public Admin adminLogin(String name, String pword) {
        Admin admin = new Admin();
        admin.setAname(name);
        admin.setApword(pword);
        return adminMapper.adminLogin(admin);
    }

    @Override
    public Vip vipLogin(String name, String pword) {
        Vip vip1 = new Vip();
        vip1.setHname(name);
        vip1.setHpwd(pword);

        return adminMapper.adminLogin1(vip1);
    }

    @Override
    public Coach coachLogin(String name, String pword) {
        Coach coach = new Coach();
        coach.setJname(name);
        coach.setJpwd(pword);
        return adminMapper.getCoachLogin(coach);
    }


//    @Override
//    public String  Login(String name, String pword) {
//        Vip vip = new Vip();
//        vip.setHname(name);
//        vip.setHpwd(pword);
//        Coach coach=new Coach();
//        coach.setJname(name);
//
//            Vip vip1 = VipMapper.selectOne(vip);
//        if (vip1.equals(null)) {
//
//        }else{
//
//        }
//
//
//        return "";
//    }
}
