package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Administrator implements Serializable {
    //管理员id
    private Integer aid;
    //管理员账号
    private String aname;
    //管理员密码
    private String apwd;
    //外键 
    private Integer arid;
    //get set 方法
    public void setAid (Integer  aid){
        this.aid=aid;
    }
    public  Integer getAid(){
        return this.aid;
    }
    public void setAname (String  aname){
        this.aname=aname;
    }
    public  String getAname(){
        return this.aname;
    }
    public void setApwd (String  apwd){
        this.apwd=apwd;
    }
    public  String getApwd(){
        return this.apwd;
    }
    public void setArid (Integer  arid){
        this.arid=arid;
    }
    public  Integer getArid(){
        return this.arid;
    }
}
