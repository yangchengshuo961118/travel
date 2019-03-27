package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Roles implements Serializable {
    //id
    private Integer rid;
    //角色名
    private String rname;
    //get set 方法
    public void setRid (Integer  rid){
        this.rid=rid;
    }
    public  Integer getRid(){
        return this.rid;
    }
    public void setRname (String  rname){
        this.rname=rname;
    }
    public  String getRname(){
        return this.rname;
    }
}
