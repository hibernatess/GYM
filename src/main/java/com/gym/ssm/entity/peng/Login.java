package com.gym.ssm.entity.peng;

/**
 * @ProjectNmae:GYM03
 * @ClassName:login
 * @Description: TOOO
 * @Author:peng
 * @Date:2019/2/26 10:10
 * @Version:1.0
 */
public class Login {
    private String name;
    private String pword;
    private String mid;

    public Login() {
    }

    public Login(String name, String pword, String mid) {
        this.name = name;
        this.pword = pword;
        this.mid = mid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Login{" +
                "name='" + name + '\'' +
                ", pword='" + pword + '\'' +
                ", mid='" + mid + '\'' +
                '}';
    }
}
