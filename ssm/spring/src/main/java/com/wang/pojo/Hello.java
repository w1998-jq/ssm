package com.wang.pojo;

/**
 * @ClassName Hello
 * Description
 * @Author jqWang
 * Date 2021/11/19 14:40
 **/
public class Hello {
    private String name;
    private boolean isEnd;

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("Hello," + name);
    }
}
