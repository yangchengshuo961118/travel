package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Newscomment implements Serializable {
    //
    private Integer ncid;
    //昵称
    private String nauthor;
    //内容
    private String ncontent;
    //时间
    private String ncreatetime;
    //新闻外键
    private Integer ncsid;
    //get set 方法
    public void setNcid (Integer  ncid){
        this.ncid=ncid;
    }
    public  Integer getNcid(){
        return this.ncid;
    }
    public void setNauthor (String  nauthor){
        this.nauthor=nauthor;
    }
    public  String getNauthor(){
        return this.nauthor;
    }
    public void setNcontent (String  ncontent){
        this.ncontent=ncontent;
    }
    public  String getNcontent(){
        return this.ncontent;
    }
    public void setNcreatetime (String  ncreatetime){
        this.ncreatetime=ncreatetime;
    }
    public  String getNcreatetime(){
        return this.ncreatetime;
    }
    public void setNcsid (Integer  ncsid){
        this.ncsid=ncsid;
    }
    public  Integer getNcsid(){
        return this.ncsid;
    }
}
