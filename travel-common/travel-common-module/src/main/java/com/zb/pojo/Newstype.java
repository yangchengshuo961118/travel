package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Newstype implements Serializable {
    //
    private Integer nid;
    //新闻分类
    private String name;
    //get set 方法
    public void setNid (Integer  nid){
        this.nid=nid;
    }
    public  Integer getNid(){
        return this.nid;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
}
