package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Newsinfo implements Serializable {
    //
    private Integer nsid;
    //标题
    private String title;
    //摘要
    private String summary;
    //内容
    private String content;
    //时间
    private String createtime;
    //地址
    private String imgsrc;
    //分类外键
    private Integer ntid;
    //get set 方法
    public void setNsid (Integer  nsid){
        this.nsid=nsid;
    }
    public  Integer getNsid(){
        return this.nsid;
    }
    public void setTitle (String  title){
        this.title=title;
    }
    public  String getTitle(){
        return this.title;
    }
    public void setSummary (String  summary){
        this.summary=summary;
    }
    public  String getSummary(){
        return this.summary;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setCreatetime (String  createtime){
        this.createtime=createtime;
    }
    public  String getCreatetime(){
        return this.createtime;
    }
    public void setImgsrc (String  imgsrc){
        this.imgsrc=imgsrc;
    }
    public  String getImgsrc(){
        return this.imgsrc;
    }
    public void setNtid (Integer  ntid){
        this.ntid=ntid;
    }
    public  Integer getNtid(){
        return this.ntid;
    }
}
