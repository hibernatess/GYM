package com.gym.ssm.entity;

import javax.persistence.*;

@Table(name = "damage")
public class Damage {

    /**
     * �����𻵣�

     */
    @Id
    private Integer qhid;

    /**
     * �������

     */
    private Integer qid;

    /**
     * �⳥�۸�

     */
    private Float qhprice;

    /**
     * �𻵱�ע

     */
    private String qhremark;

    /**
     * ��ȡ�����𻵣�

     *
     * @return qhid - �����𻵣�

     */
    public Integer getQhid() {
        return qhid;
    }

    /**
     * ���������𻵣�

     *
     * @param qhid �����𻵣�

     */
    public void setQhid(Integer qhid) {
        this.qhid = qhid;
    }

    /**
     * ��ȡ�������

     *
     * @return qid - �������

     */
    public Integer getQid() {
        return qid;
    }

    /**
     * �����������

     *
     * @param qid �������

     */
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    /**
     * ��ȡ�⳥�۸�

     *
     * @return qhprice - �⳥�۸�

     */
    public Float getQhprice() {
        return qhprice;
    }

    /**
     * �����⳥�۸�

     *
     * @param qhprice �⳥�۸�

     */
    public void setQhprice(Float qhprice) {
        this.qhprice = qhprice;
    }

    /**
     * ��ȡ�𻵱�ע

     *
     * @return qhremark - �𻵱�ע

     */
    public String getQhremark() {
        return qhremark;
    }

    /**
     * �����𻵱�ע

     *
     * @param qhremark �𻵱�ע

     */
    public void setQhremark(String qhremark) {
        this.qhremark = qhremark == null ? null : qhremark.trim();
    }

}