package com.gym.ssm.entity;

import javax.persistence.Id;

import lombok.Data;

/**
 * @program: GYM
 * @description:
 * @author: hw
 * @create: 2019-02-25 19:55
 **/
@Data
public class Curriculum {
    /**
     * id
     */
    @Id
    private int cid;
    /*
    课程名字
     */
    private String cname;
    /**
     * 课程时间
     */
    private String cattend;
    /**
     * 教练id
     */
    private Integer jid;
    /**
     * 私教可以收钱，其他课程不收钱
     */
    private float cprice;

    /**
     * 课程类别  是否属于私教
     */
    private Integer sid;

}
