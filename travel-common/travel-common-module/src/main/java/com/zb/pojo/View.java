package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class View implements Serializable {
    //id
    private Integer vid;
    //景点名
    private String vname;
    //景点图片地址
    private String vimage;
    //价格
    private Double vprice;
    //景点标题
    private String vtitle;
    //景点简介
    private String vcontent;
    //详细地址
    private String vaddress;
    //咨询电话
    private String vtelephone;
    //get set 方法
    public void setVid (Integer  vid){
        this.vid=vid;
    }
    public  Integer getVid(){
        return this.vid;
    }
    public void setVname (String  vname){
        this.vname=vname;
    }
    public  String getVname(){
        return this.vname;
    }
    public void setVimage (String  vimage){
        this.vimage=vimage;
    }
    public  String getVimage(){
        return this.vimage;
    }
    public void setVprice (Double  vprice){
        this.vprice=vprice;
    }
    public  Double getVprice(){
        return this.vprice;
    }
    public void setVtitle (String  vtitle){
        this.vtitle=vtitle;
    }
    public  String getVtitle(){
        return this.vtitle;
    }
    public void setVcontent (String  vcontent){
        this.vcontent=vcontent;
    }
    public  String getVcontent(){
        return this.vcontent;
    }
    public void setVaddress (String  vaddress){
        this.vaddress=vaddress;
    }
    public  String getVaddress(){
        return this.vaddress;
    }
    public void setVtelephone (String  vtelephone){
        this.vtelephone=vtelephone;
    }
    public  String getVtelephone(){
        return this.vtelephone;
    }
}
