package com.gym.ssm.entity.peng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeNode {
    private String name;
    private String id;
    private String spread;
    //描述父子节点，用于递归子节点
    private List<TreeNode> children = new ArrayList<>();
    //树形菜单的节点，除了ID以及展示文本，可能还伴有跳转页面或者图片展示，等等一系列的描述
    //    //都将其放入到map集合中
    private Map<String, Object> attributes = new HashMap<>();

    public String getSpread() {
        return this.spread;
    }

    ;

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "TreeNode [id=" + id + ", name=" + name + ", children=" + children + ", attributes=" + attributes + "]";
    }

    public TreeNode() {
        super();
        // TODO Auto-generated constructor stub
    }

    public TreeNode(String id, String name, List<TreeNode> children, Map<String, Object> attributes) {
        super();
        this.id = id;
        this.name = name;
        this.children = children;
        this.attributes = attributes;
    }


}
