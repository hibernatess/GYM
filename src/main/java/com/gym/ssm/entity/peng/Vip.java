package com.gym.ssm.entity.peng;

import javax.persistence.*;

@Table(name = "vip")
public class Vip {
    @Id
    private Integer hid;

    private String sid;

    private String hname;

    private String hpwd;

    private String hphone;

    private String hsex;

    private Integer hage;

    private String haddress;

    private Integer hlapsed;

    private String hregister;

    private Integer qid;

    private Integer cid;

    private String jurid;

    /**
     * @return hid
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * @param hid
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * @return hname
     */
    public String getHname() {
        return hname;
    }

    /**
     * @param hname
     */
    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    /**
     * @return hpwd
     */
    public String getHpwd() {
        return hpwd;
    }

    /**
     * @param hpwd
     */
    public void setHpwd(String hpwd) {
        this.hpwd = hpwd == null ? null : hpwd.trim();
    }

    /**
     * @return hphone
     */
    public String getHphone() {
        return hphone;
    }

    /**
     * @param hphone
     */
    public void setHphone(String hphone) {
        this.hphone = hphone == null ? null : hphone.trim();
    }

    /**
     * @return hsex
     */
    public String getHsex() {
        return hsex;
    }

    /**
     * @param hsex
     */
    public void setHsex(String hsex) {
        this.hsex = hsex == null ? null : hsex.trim();
    }

    /**
     * @return hage
     */
    public Integer getHage() {
        return hage;
    }

    /**
     * @param hage
     */
    public void setHage(Integer hage) {
        this.hage = hage;
    }

    /**
     * @return haddress
     */
    public String getHaddress() {
        return haddress;
    }

    /**
     * @param haddress
     */
    public void setHaddress(String haddress) {
        this.haddress = haddress == null ? null : haddress.trim();
    }

    /**
     * @return hlapsed
     */
    public Integer getHlapsed() {
        return hlapsed;
    }

    /**
     * @param hlapsed
     */
    public void setHlapsed(Integer hlapsed) {
        this.hlapsed = hlapsed;
    }

    /**
     * @return hregister
     */
    public String getHregister() {
        return hregister;
    }

    /**
     * @param hregister
     */
    public void setHregister(String hregister) {
        this.hregister = hregister == null ? null : hregister.trim();
    }

    /**
     * @return qid
     */
    public Integer getQid() {
        return qid;
    }

    /**
     * @param qid
     */
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    /**
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * @return jurid
     */
    public String getJurid() {
        return jurid;
    }

    /**
     * @param jurid
     */
    public void setJurid(String jurid) {
        this.jurid = jurid == null ? null : jurid.trim();
    }
}