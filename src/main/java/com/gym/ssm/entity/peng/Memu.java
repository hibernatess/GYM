package com.gym.ssm.entity.peng;

import javax.persistence.*;
import java.util.List;

@Table(name = "memu")
public class Memu {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * 父id
     */
    private String oldid;

    /**
     * 菜单名
     */
    private String name;

    /**
     * 路径
     */
    private String href;


    @Transient
    private List<Memu> children;

    public Memu() {
    }

    public Memu(String id, String oldid, String name, String href, List<Memu> children) {
        this.id = id;
        this.oldid = oldid;
        this.name = name;
        this.href = href;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOldid() {
        return oldid;
    }

    public void setOldid(String oldid) {
        this.oldid = oldid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Memu> getChildren() {
        return children;
    }

    public void setChildren(List<Memu> children) {
        this.children = children;
    }
}