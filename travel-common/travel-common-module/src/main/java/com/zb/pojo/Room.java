package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Room implements Serializable {
    //
    private Integer id;
    //
    private String roomName;
    //
    private Integer roomType;
    //0：空房，1：已预订，2：已入住
    private Integer roomSatatus;
    //
    private Integer hotelId;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setRoomName (String  roomName){
        this.roomName=roomName;
    }
    public  String getRoomName(){
        return this.roomName;
    }
    public void setRoomType (Integer  roomType){
        this.roomType=roomType;
    }
    public  Integer getRoomType(){
        return this.roomType;
    }
    public void setRoomSatatus (Integer  roomSatatus){
        this.roomSatatus=roomSatatus;
    }
    public  Integer getRoomSatatus(){
        return this.roomSatatus;
    }
    public void setHotelId (Integer  hotelId){
        this.hotelId=hotelId;
    }
    public  Integer getHotelId(){
        return this.hotelId;
    }
}
