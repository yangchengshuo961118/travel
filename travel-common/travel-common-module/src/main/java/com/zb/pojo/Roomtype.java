package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Roomtype implements Serializable {
    //
    private Integer id;
    //
    private String roomType;
    //
    private Double roomPrice;
    //
    private Integer roomNum;
    //
    private Integer imageId;
    //
    private Integer hotelId;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setRoomType (String  roomType){
        this.roomType=roomType;
    }
    public  String getRoomType(){
        return this.roomType;
    }
    public void setRoomPrice (Double  roomPrice){
        this.roomPrice=roomPrice;
    }
    public  Double getRoomPrice(){
        return this.roomPrice;
    }
    public void setRoomNum (Integer  roomNum){
        this.roomNum=roomNum;
    }
    public  Integer getRoomNum(){
        return this.roomNum;
    }
    public void setImageId (Integer  imageId){
        this.imageId=imageId;
    }
    public  Integer getImageId(){
        return this.imageId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }
}
