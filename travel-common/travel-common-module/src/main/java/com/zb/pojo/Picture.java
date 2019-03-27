package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Picture implements Serializable {
    //
    private Integer pId;
    //
    private String pictures;
    //get set 方法
    public void setPId (Integer  pId){
        this.pId=pId;
    }
    public  Integer getPId(){
        return this.pId;
    }
    public void setPictures (String  pictures){
        this.pictures=pictures;
    }
    public  String getPictures(){
        return this.pictures;
    }
}
