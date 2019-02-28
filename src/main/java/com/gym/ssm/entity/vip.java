package com.gym.ssm.entity;

import lombok.ToString;

import javax.persistence.*;
@ToString
public class vip {
    /**
     * 会员表：

     */
    @Id
    private Integer hid;

    /**
     * 会员等级 	数据字典表外键	

     */
    private String sid;

    /**
     * 姓名
用户名
     */
    private String hname;

    /**
     * 密码

     */
    private String hpwd;

    /**
     * 电话

     */
    private String hphone;

    /**
     * 性别

     */
    private String hsex;

    /**
     * 年龄

     */
    private Integer hage;

    /**
     * 地址

     */
    private String haddress;

    /**
     * 流失：0未流失 1预警 2流失 		

     */
    private Integer hlapsed;

    /**
     * 注册时间

     */
    private String hregister;

    /**
     * 器材id

     */
    private Integer qid;

    /**
     * 菜单

     */
    private String jurid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * t头像
     */
    private String img;

    /**
     * 获取会员表：

     *
     * @return hid - 会员表：

     */
    public Integer getHid() {
        return hid;
    }

    /**
     * 设置会员表：

     *
     * @param hid 会员表：

     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * 获取会员等级 	数据字典表外键	

     *
     * @return sid - 会员等级 	数据字典表外键	

     */
    public String getSid() {
        return sid;
    }

    /**
     * 设置会员等级 	数据字典表外键	

     *
     * @param sid 会员等级 	数据字典表外键	

     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * 获取姓名
用户名
     *
     * @return hname - 姓名
用户名
     */
    public String getHname() {
        return hname;
    }

    /**
     * 设置姓名
用户名
     *
     * @param hname 姓名
用户名
     */
    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    /**
     * 获取密码

     *
     * @return hpwd - 密码

     */
    public String getHpwd() {
        return hpwd;
    }

    /**
     * 设置密码

     *
     * @param hpwd 密码

     */
    public void setHpwd(String hpwd) {
        this.hpwd = hpwd == null ? null : hpwd.trim();
    }

    /**
     * 获取电话

     *
     * @return hphone - 电话

     */
    public String getHphone() {
        return hphone;
    }

    /**
     * 设置电话

     *
     * @param hphone 电话

     */
    public void setHphone(String hphone) {
        this.hphone = hphone == null ? null : hphone.trim();
    }

    /**
     * 获取性别

     *
     * @return hsex - 性别

     */
    public String getHsex() {
        return hsex;
    }

    /**
     * 设置性别

     *
     * @param hsex 性别

     */
    public void setHsex(String hsex) {
        this.hsex = hsex == null ? null : hsex.trim();
    }

    /**
     * 获取年龄

     *
     * @return hage - 年龄

     */
    public Integer getHage() {
        return hage;
    }

    /**
     * 设置年龄

     *
     * @param hage 年龄

     */
    public void setHage(Integer hage) {
        this.hage = hage;
    }

    /**
     * 获取地址

     *
     * @return haddress - 地址

     */
    public String getHaddress() {
        return haddress;
    }

    /**
     * 设置地址

     *
     * @param haddress 地址

     */
    public void setHaddress(String haddress) {
        this.haddress = haddress == null ? null : haddress.trim();
    }

    /**
     * 获取流失：0未流失 1预警 2流失 		

     *
     * @return hlapsed - 流失：0未流失 1预警 2流失 		

     */
    public Integer getHlapsed() {
        return hlapsed;
    }

    /**
     * 设置流失：0未流失 1预警 2流失 		

     *
     * @param hlapsed 流失：0未流失 1预警 2流失 		

     */
    public void setHlapsed(Integer hlapsed) {
        this.hlapsed = hlapsed;
    }

    /**
     * 获取注册时间

     *
     * @return hregister - 注册时间

     */
    public String getHregister() {
        return hregister;
    }

    /**
     * 设置注册时间

     *
     * @param hregister 注册时间

     */
    public void setHregister(String hregister) {
        this.hregister = hregister == null ? null : hregister.trim();
    }

    /**
     * 获取器材id

     *
     * @return qid - 器材id

     */
    public Integer getQid() {
        return qid;
    }

    /**
     * 设置器材id

     *
     * @param qid 器材id

     */
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    /**
     * 获取菜单

     *
     * @return jurid - 菜单

     */
    public String getJurid() {
        return jurid;
    }

    /**
     * 设置菜单

     *
     * @param jurid 菜单

     */
    public void setJurid(String jurid) {
        this.jurid = jurid == null ? null : jurid.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取真实姓名
     *
     * @return realname - 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * 获取t头像
     *
     * @return img - t头像
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置t头像
     *
     * @param img t头像
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}