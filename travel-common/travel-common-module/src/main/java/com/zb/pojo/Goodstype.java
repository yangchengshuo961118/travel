package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goodstype implements Serializable {
    //
    private Integer gtid;
    //商品类型
    private String gtname;
    //get set 方法
    public void setGtid (Integer  gtid){
        this.gtid=gtid;
    }
    public  Integer getGtid(){
        return this.gtid;
    }
    public void setGtname (String  gtname){
        this.gtname=gtname;
    }
    public  String getGtname(){
        return this.gtname;
    }
}
