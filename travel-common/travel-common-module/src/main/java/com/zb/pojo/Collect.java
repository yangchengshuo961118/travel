package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Collect implements Serializable {
    //
    private Integer collectId;
    //
    private Integer uId;
    //
    private Integer tnId;
    //get set 方法
    public void setCollectId (Integer  collectId){
        this.collectId=collectId;
    }
    public  Integer getCollectId(){
        return this.collectId;
    }
    public void setUId (Integer  uId){
        this.uId=uId;
    }
    public  Integer getUId(){
        return this.uId;
    }
    public void setTnId (Integer  tnId){
        this.tnId=tnId;
    }
    public  Integer getTnId(){
        return this.tnId;
    }
}
