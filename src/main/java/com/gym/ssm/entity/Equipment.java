package com.gym.ssm.entity;

import javax.persistence.*;

@Table(name = "equipment")
public class Equipment {
    /**
     * ���ģ�

     */
    @Id
    private Integer qid;

    /**
     * ������

     */
    private String qname;

    /**
     * �������

     */
    private Integer sid;

    /**
     * �۸�

     */
    private Float qprice;

    /**
     * �𻵳̶ȣ�0��� 1��		

     */
    private Integer qdamage;

    /**
     * ��������

     */
    private Integer qsum;

    /**
     * ��ȡ���ģ�

     *
     * @return qid - ���ģ�

     */
    public Integer getQid() {
        return qid;
    }

    /**
     * �������ģ�

     *
     * @param qid ���ģ�

     */
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    /**
     * ��ȡ������

     *
     * @return qname - ������

     */
    public String getQname() {
        return qname;
    }

    /**
     * ����������

     *
     * @param qname ������

     */
    public void setQname(String qname) {
        this.qname = qname == null ? null : qname.trim();
    }

    /**
     * ��ȡ�������

     *
     * @return sid - �������

     */
    public Integer getSid() {
        return sid;
    }

    /**
     * �����������

     *
     * @param sid �������

     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * ��ȡ�۸�

     *
     * @return qprice - �۸�

     */
    public Float getQprice() {
        return qprice;
    }

    /**
     * ���ü۸�

     *
     * @param qprice �۸�

     */
    public void setQprice(Float qprice) {
        this.qprice = qprice;
    }

    /**
     * ��ȡ�𻵳̶ȣ�0��� 1��		

     *
     * @return qdamage - �𻵳̶ȣ�0��� 1��		

     */
    public Integer getQdamage() {
        return qdamage;
    }

    /**
     * �����𻵳̶ȣ�0��� 1��		

     *
     * @param qdamage �𻵳̶ȣ�0��� 1��		

     */
    public void setQdamage(Integer qdamage) {
        this.qdamage = qdamage;
    }

    /**
     * ��ȡ��������

     *
     * @return qsum - ��������

     */
    public Integer getQsum() {
        return qsum;
    }

    /**
     * ������������

     *
     * @param qsum ��������

     */
    public void setQsum(Integer qsum) {
        this.qsum = qsum;
    }
}