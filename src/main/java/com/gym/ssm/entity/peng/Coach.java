package com.gym.ssm.entity.peng;

import javax.persistence.*;

@Table(name = "coach")
public class Coach {
    @Id
    private Integer jid;

    private String jname;

    private Integer jsex;

    private Integer sid;

    private String jpwd;

    private Integer jage;

    private String jregister;

    private String jaddress;

    private Integer cid;

    private Integer jflag;

    private String jimages;

    private String jurid;

    /**
     * @return jid
     */
    public Integer getJid() {
        return jid;
    }

    /**
     * @param jid
     */
    public void setJid(Integer jid) {
        this.jid = jid;
    }

    /**
     * @return jname
     */
    public String getJname() {
        return jname;
    }

    /**
     * @param jname
     */
    public void setJname(String jname) {
        this.jname = jname == null ? null : jname.trim();
    }

    /**
     * @return jsex
     */
    public Integer getJsex() {
        return jsex;
    }

    /**
     * @param jsex
     */
    public void setJsex(Integer jsex) {
        this.jsex = jsex;
    }

    /**
     * @return sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return jpwd
     */
    public String getJpwd() {
        return jpwd;
    }

    /**
     * @param jpwd
     */
    public void setJpwd(String jpwd) {
        this.jpwd = jpwd == null ? null : jpwd.trim();
    }

    /**
     * @return jage
     */
    public Integer getJage() {
        return jage;
    }

    /**
     * @param jage
     */
    public void setJage(Integer jage) {
        this.jage = jage;
    }

    /**
     * @return jregister
     */
    public String getJregister() {
        return jregister;
    }

    /**
     * @param jregister
     */
    public void setJregister(String jregister) {
        this.jregister = jregister == null ? null : jregister.trim();
    }

    /**
     * @return jaddress
     */
    public String getJaddress() {
        return jaddress;
    }

    /**
     * @param jaddress
     */
    public void setJaddress(String jaddress) {
        this.jaddress = jaddress == null ? null : jaddress.trim();
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
     * @return jflag
     */
    public Integer getJflag() {
        return jflag;
    }

    /**
     * @param jflag
     */
    public void setJflag(Integer jflag) {
        this.jflag = jflag;
    }

    /**
     * @return jimages
     */
    public String getJimages() {
        return jimages;
    }

    /**
     * @param jimages
     */
    public void setJimages(String jimages) {
        this.jimages = jimages == null ? null : jimages.trim();
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