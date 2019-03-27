package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Images implements Serializable {
    //
    private Integer id;
    //
    private String imagePath;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setImagePath (String  imagePath){
        this.imagePath=imagePath;
    }
    public  String getImagePath(){
        return this.imagePath;
    }
}
