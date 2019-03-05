package com.gym.ssm.entity;

import javax.persistence.*;

@Table(name = "equipment")
public class Equipment {
    /**
     * 器材：

     */
    @Id
    private Integer qid;

    /**
     * 器材名

     */
    private String qname;

    /**
     * 器材类别

     */
    private Integer sid;

    /**
     * 价格

     */
    private Float qprice;

    /**
     * 损坏程度：0完好 1损坏		

     */
    private Integer qdamage;

    /**
     * 器材数量

     */
    private Integer qsum;

    /**
     * 获取器材：

     *
     * @return qid - 器材：

     */
    public Integer getQid() {
        return qid;
    }

    /**
     * 设置器材：

     *
     * @param qid 器材：

     */
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    /**
     * 获取器材名

     *
     * @return qname - 器材名

     */
    public String getQname() {
        return qname;
    }

    /**
     * 设置器材名

     *
     * @param qname 器材名

     */
    public void setQname(String qname) {
        this.qname = qname == null ? null : qname.trim();
    }

    /**
     * 获取器材类别

     *
     * @return sid - 器材类别

     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置器材类别

     *
     * @param sid 器材类别

     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取价格

     *
     * @return qprice - 价格

     */
    public Float getQprice() {
        return qprice;
    }

    /**
     * 设置价格

     *
     * @param qprice 价格

     */
    public void setQprice(Float qprice) {
        this.qprice = qprice;
    }

    /**
     * 获取损坏程度：0完好 1损坏		

     *
     * @return qdamage - 损坏程度：0完好 1损坏		

     */
    public Integer getQdamage() {
        return qdamage;
    }

    /**
     * 设置损坏程度：0完好 1损坏		

     *
     * @param qdamage 损坏程度：0完好 1损坏		

     */
    public void setQdamage(Integer qdamage) {
        this.qdamage = qdamage;
    }

    /**
     * 获取器材数量

     *
     * @return qsum - 器材数量

     */
    public Integer getQsum() {
        return qsum;
    }

    /**
     * 设置器材数量

     *
     * @param qsum 器材数量

     */
    public void setQsum(Integer qsum) {
        this.qsum = qsum;
    }
}