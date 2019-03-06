package com.gym.ssm.entity;

import javax.persistence.*;

@Table(name = "damage")
public class Damage {

    /**
     * 器材损坏：

     */
    @Id
    private Integer qhid;

    /**
     * 器材外键

     */
    private Integer qid;

    /**
     * 赔偿价格

     */
    private Float qhprice;

    /**
     * 损坏备注

     */
    private String qhremark;

    /**
     * 获取器材损坏：

     *
     * @return qhid - 器材损坏：

     */
    public Integer getQhid() {
        return qhid;
    }

    /**
     * 设置器材损坏：

     *
     * @param qhid 器材损坏：

     */
    public void setQhid(Integer qhid) {
        this.qhid = qhid;
    }

    /**
     * 获取器材外键

     *
     * @return qid - 器材外键

     */
    public Integer getQid() {
        return qid;
    }

    /**
     * 设置器材外键

     *
     * @param qid 器材外键

     */
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    /**
     * 获取赔偿价格

     *
     * @return qhprice - 赔偿价格

     */
    public Float getQhprice() {
        return qhprice;
    }

    /**
     * 设置赔偿价格

     *
     * @param qhprice 赔偿价格

     */
    public void setQhprice(Float qhprice) {
        this.qhprice = qhprice;
    }

    /**
     * 获取损坏备注

     *
     * @return qhremark - 损坏备注

     */
    public String getQhremark() {
        return qhremark;
    }

    /**
     * 设置损坏备注

     *
     * @param qhremark 损坏备注

     */
    public void setQhremark(String qhremark) {
        this.qhremark = qhremark == null ? null : qhremark.trim();
    }

}