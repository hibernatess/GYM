package com.gym.ssm.entity;

import lombok.ToString;

import javax.persistence.*;
@ToString
public class vip {
    /**
     * ��Ա��

     */
    @Id
    private Integer hid;

    /**
     * ��Ա�ȼ� 	�����ֵ�����	

     */
    private String sid;

    /**
     * ����
�û���
     */
    private String hname;

    /**
     * ����

     */
    private String hpwd;

    /**
     * �绰

     */
    private String hphone;

    /**
     * �Ա�

     */
    private String hsex;

    /**
     * ����

     */
    private Integer hage;

    /**
     * ��ַ

     */
    private String haddress;

    /**
     * ��ʧ��0δ��ʧ 1Ԥ�� 2��ʧ 		

     */
    private Integer hlapsed;

    /**
     * ע��ʱ��

     */
    private String hregister;

    /**
     * ����id

     */
    private Integer qid;

    /**
     * �˵�

     */
    private String jurid;

    /**
     * ��ע
     */
    private String remark;

    /**
     * ��ʵ����
     */
    private String realname;

    /**
     * tͷ��
     */
    private String img;

    /**
     * ��ȡ��Ա��

     *
     * @return hid - ��Ա��

     */
    public Integer getHid() {
        return hid;
    }

    /**
     * ���û�Ա��

     *
     * @param hid ��Ա��

     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * ��ȡ��Ա�ȼ� 	�����ֵ�����	

     *
     * @return sid - ��Ա�ȼ� 	�����ֵ�����	

     */
    public String getSid() {
        return sid;
    }

    /**
     * ���û�Ա�ȼ� 	�����ֵ�����	

     *
     * @param sid ��Ա�ȼ� 	�����ֵ�����	

     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * ��ȡ����
�û���
     *
     * @return hname - ����
�û���
     */
    public String getHname() {
        return hname;
    }

    /**
     * ��������
�û���
     *
     * @param hname ����
�û���
     */
    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    /**
     * ��ȡ����

     *
     * @return hpwd - ����

     */
    public String getHpwd() {
        return hpwd;
    }

    /**
     * ��������

     *
     * @param hpwd ����

     */
    public void setHpwd(String hpwd) {
        this.hpwd = hpwd == null ? null : hpwd.trim();
    }

    /**
     * ��ȡ�绰

     *
     * @return hphone - �绰

     */
    public String getHphone() {
        return hphone;
    }

    /**
     * ���õ绰

     *
     * @param hphone �绰

     */
    public void setHphone(String hphone) {
        this.hphone = hphone == null ? null : hphone.trim();
    }

    /**
     * ��ȡ�Ա�

     *
     * @return hsex - �Ա�

     */
    public String getHsex() {
        return hsex;
    }

    /**
     * �����Ա�

     *
     * @param hsex �Ա�

     */
    public void setHsex(String hsex) {
        this.hsex = hsex == null ? null : hsex.trim();
    }

    /**
     * ��ȡ����

     *
     * @return hage - ����

     */
    public Integer getHage() {
        return hage;
    }

    /**
     * ��������

     *
     * @param hage ����

     */
    public void setHage(Integer hage) {
        this.hage = hage;
    }

    /**
     * ��ȡ��ַ

     *
     * @return haddress - ��ַ

     */
    public String getHaddress() {
        return haddress;
    }

    /**
     * ���õ�ַ

     *
     * @param haddress ��ַ

     */
    public void setHaddress(String haddress) {
        this.haddress = haddress == null ? null : haddress.trim();
    }

    /**
     * ��ȡ��ʧ��0δ��ʧ 1Ԥ�� 2��ʧ 		

     *
     * @return hlapsed - ��ʧ��0δ��ʧ 1Ԥ�� 2��ʧ 		

     */
    public Integer getHlapsed() {
        return hlapsed;
    }

    /**
     * ������ʧ��0δ��ʧ 1Ԥ�� 2��ʧ 		

     *
     * @param hlapsed ��ʧ��0δ��ʧ 1Ԥ�� 2��ʧ 		

     */
    public void setHlapsed(Integer hlapsed) {
        this.hlapsed = hlapsed;
    }

    /**
     * ��ȡע��ʱ��

     *
     * @return hregister - ע��ʱ��

     */
    public String getHregister() {
        return hregister;
    }

    /**
     * ����ע��ʱ��

     *
     * @param hregister ע��ʱ��

     */
    public void setHregister(String hregister) {
        this.hregister = hregister == null ? null : hregister.trim();
    }

    /**
     * ��ȡ����id

     *
     * @return qid - ����id

     */
    public Integer getQid() {
        return qid;
    }

    /**
     * ��������id

     *
     * @param qid ����id

     */
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    /**
     * ��ȡ�˵�

     *
     * @return jurid - �˵�

     */
    public String getJurid() {
        return jurid;
    }

    /**
     * ���ò˵�

     *
     * @param jurid �˵�

     */
    public void setJurid(String jurid) {
        this.jurid = jurid == null ? null : jurid.trim();
    }

    /**
     * ��ȡ��ע
     *
     * @return remark - ��ע
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ���ñ�ע
     *
     * @param remark ��ע
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * ��ȡ��ʵ����
     *
     * @return realname - ��ʵ����
     */
    public String getRealname() {
        return realname;
    }

    /**
     * ������ʵ����
     *
     * @param realname ��ʵ����
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * ��ȡtͷ��
     *
     * @return img - tͷ��
     */
    public String getImg() {
        return img;
    }

    /**
     * ����tͷ��
     *
     * @param img tͷ��
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}