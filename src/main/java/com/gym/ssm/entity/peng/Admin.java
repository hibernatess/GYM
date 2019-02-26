package com.gym.ssm.entity.peng;

import javax.persistence.*;

@Table(name = "admin")
public class Admin {
    /**
     * id
     */
    @Id
    private Integer aid;

    /**
     * 用户名
     */
    private String aname;

    /**
     * 密码
     */
    private String apword;

    /**
     * 菜单id
     */
    private String amid;

    /**
     * 获取id
     *
     * @return aid - id
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置id
     *
     * @param aid id
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取用户名
     *
     * @return aname - 用户名
     */
    public String getAname() {
        return aname;
    }

    /**
     * 设置用户名
     *
     * @param aname 用户名
     */
    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    /**
     * 获取密码
     *
     * @return apword - 密码
     */
    public String getApword() {
        return apword;
    }

    /**
     * 设置密码
     *
     * @param apword 密码
     */
    public void setApword(String apword) {
        this.apword = apword == null ? null : apword.trim();
    }

    /**
     * 获取菜单id
     *
     * @return amid - 菜单id
     */
    public String getAmid() {
        return amid;
    }

    /**
     * 设置菜单id
     *
     * @param amid 菜单id
     */
    public void setAmid(String amid) {
        this.amid = amid == null ? null : amid.trim();
    }
}