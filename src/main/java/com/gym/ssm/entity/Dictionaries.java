package com.gym.ssm.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Table(name = "dictionaries")
public class Dictionaries {
    /**
     * 数据字典：

     */
    @Id
    private Integer sid;

    /**
     * 类别

     */
    private String sname;

    /**
     * 属性

     */
    private String stpye;

    /**
     * 值

     */
    private String svalues;

    /**
     * 是否可用

     */
    private Integer sflag;

    /**
     * 获取数据字典：

     *
     * @return sid - 数据字典：

     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置数据字典：

     *
     * @param sid 数据字典：

     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取类别

     *
     * @return sname - 类别

     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置类别

     *
     * @param sname 类别

     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * 获取属性

     *
     * @return stpye - 属性

     */
    public String getStpye() {
        return stpye;
    }

    /**
     * 设置属性

     *
     * @param stpye 属性

     */
    public void setStpye(String stpye) {
        this.stpye = stpye == null ? null : stpye.trim();
    }

    /**
     * 获取值

     *
     * @return svalues - 值

     */
    public String getSvalues() {
        return svalues;
    }

    /**
     * 设置值

     *
     * @param svalues 值

     */
    public void setSvalues(String svalues) {
        this.svalues = svalues == null ? null : svalues.trim();
    }

    /**
     * 获取是否可用

     *
     * @return sflag - 是否可用

     */
    public Integer getSflag() {
        return sflag;
    }

    /**
     * 设置是否可用

     *
     * @param sflag 是否可用

     */
    public void setSflag(Integer sflag) {
        this.sflag = sflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dictionaries that = (Dictionaries) o;
        return Objects.equals(sname, that.sname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sname);
    }
}