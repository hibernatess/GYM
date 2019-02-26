package com.gym.ssm.entity.peng;

import javax.persistence.*;

@Table(name = "memu")
public class Memu {
    /**
     * id
     */
    @Id
    private String mid;

    /**
     * 父id
     */
    private String oldmid;

    /**
     * 菜单名
     */
    private String mname;

    /**
     * 路径
     */
    private String murl;

    /**
     * 获取id
     *
     * @return mid - id
     */
    public String getMid() {
        return mid;
    }

    /**
     * 设置id
     *
     * @param mid id
     */
    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    /**
     * 获取父id
     *
     * @return oldmid - 父id
     */
    public String getOldmid() {
        return oldmid;
    }

    /**
     * 设置父id
     *
     * @param oldmid 父id
     */
    public void setOldmid(String oldmid) {
        this.oldmid = oldmid == null ? null : oldmid.trim();
    }

    /**
     * 获取菜单名
     *
     * @return mname - 菜单名
     */
    public String getMname() {
        return mname;
    }

    /**
     * 设置菜单名
     *
     * @param mname 菜单名
     */
    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    /**
     * 获取路径
     *
     * @return murl - 路径
     */
    public String getMurl() {
        return murl;
    }

    /**
     * 设置路径
     *
     * @param murl 路径
     */
    public void setMurl(String murl) {
        this.murl = murl == null ? null : murl.trim();
    }
}