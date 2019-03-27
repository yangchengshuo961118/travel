package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Travelnotes implements Serializable {
    //
    private Integer tnId;
    //
    private Integer uId;
    //
    private Integer pId;
    //
    private String title;
    //
    private String author;
    //
    private String content;
    //
    private Integer browseNum;
    //
    private String picturePath;
    //
    private Integer status;
    //
    private String createDate;
    //get set 方法
    public void setTnId (Integer  tnId){
        this.tnId=tnId;
    }
    public  Integer getTnId(){
        return this.tnId;
    }
    public void setUId (Integer  uId){
        this.uId=uId;
    }
    public  Integer getUId(){
        return this.uId;
    }
    public void setPId (Integer  pId){
        this.pId=pId;
    }
    public  Integer getPId(){
        return this.pId;
    }
    public void setTitle (String  title){
        this.title=title;
    }
    public  String getTitle(){
        return this.title;
    }
    public void setAuthor (String  author){
        this.author=author;
    }
    public  String getAuthor(){
        return this.author;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
    }
    public void setBrowseNum (Integer  browseNum){
        this.browseNum=browseNum;
    }
    public  Integer getBrowseNum(){
        return this.browseNum;
    }
    public void setPicturePath (String  picturePath){
        this.picturePath=picturePath;
    }
    public  String getPicturePath(){
        return this.picturePath;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
    public void setCreateDate (String  createDate){
        this.createDate=createDate;
    }
    public  String getCreateDate(){
        return this.createDate;
    }
}
