package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goods implements Serializable {
    //
    private Integer gid;
    //商品名
    private String gname;
    //单价
    private Double gprice;
    //库存
    private Integer gnum;
    //图片地址
    private String gimgpath;
    //类型外键
    private Integer gtype;
    //get set 方法
    public void setGid (Integer  gid){
        this.gid=gid;
    }
    public  Integer getGid(){
        return this.gid;
    }
    public void setGname (String  gname){
        this.gname=gname;
    }
    public  String getGname(){
        return this.gname;
    }
    public void setGprice (Double  gprice){
        this.gprice=gprice;
    }
    public  Double getGprice(){
        return this.gprice;
    }
    public void setGnum (Integer  gnum){
        this.gnum=gnum;
    }
    public  Integer getGnum(){
        return this.gnum;
    }
    public void setGimgpath (String  gimgpath){
        this.gimgpath=gimgpath;
    }
    public  String getGimgpath(){
        return this.gimgpath;
    }
    public void setGtype (Integer  gtype){
        this.gtype=gtype;
    }
    public  Integer getGtype(){
        return this.gtype;
    }
}
