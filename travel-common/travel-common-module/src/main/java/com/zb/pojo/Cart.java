package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Cart implements Serializable {
    //
    private Integer id;
    //商品id
    private Integer sid;
    //用户id
    private Integer userid;
    //
    private String createtime;
    //数量
    private Integer count;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setSid (Integer  sid){
        this.sid=sid;
    }
    public  Integer getSid(){
        return this.sid;
    }
    public void setUserid (Integer  userid){
        this.userid=userid;
    }
    public  Integer getUserid(){
        return this.userid;
    }
    public void setCreatetime (String  createtime){
        this.createtime=createtime;
    }
    public  String getCreatetime(){
        return this.createtime;
    }
    public void setCount (Integer  count){
        this.count=count;
    }
    public  Integer getCount(){
        return this.count;
    }
}
