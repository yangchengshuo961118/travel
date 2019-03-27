package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Hotel implements Serializable {
    //
    private Integer id;
    //
    private String hotelName;
    //
    private String hotelType;
    //
    private Integer imageId;
    //
    private String hotelContext;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setHotelName (String  hotelName){
        this.hotelName=hotelName;
    }
    public  String getHotelName(){
        return this.hotelName;
    }
    public void setHotelType (String  hotelType){
        this.hotelType=hotelType;
    }
    public  String getHotelType(){
        return this.hotelType;
    }
    public void setImageId (Integer  imageId){
        this.imageId=imageId;
    }
    public  Integer getImageId(){
        return this.imageId;
    }
    public void setHotelContext (String  hotelContext){
        this.hotelContext=hotelContext;
    }
    public  String getHotelContext(){
        return this.hotelContext;
    }
}
