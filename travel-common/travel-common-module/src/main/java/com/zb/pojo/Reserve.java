package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Reserve implements Serializable {
    //
    private Integer id;
    //
    private String name;
    //
    private Integer days;
    //
    private Integer guest;
    //
    private Integer roomNumber;
    //
    private Integer roomType;
    //
    private String checkinDate;
    //
    private String checkoutDate;
    //
    private Double roomRate;
    //
    private Double cashPledge;
    //
    private String remark;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setDays (Integer  days){
        this.days=days;
    }
    public  Integer getDays(){
        return this.days;
    }
    public void setGuest (Integer  guest){
        this.guest=guest;
    }
    public  Integer getGuest(){
        return this.guest;
    }
    public void setRoomNumber (Integer  roomNumber){
        this.roomNumber=roomNumber;
    }
    public  Integer getRoomNumber(){
        return this.roomNumber;
    }
    public void setRoomType (Integer  roomType){
        this.roomType=roomType;
    }
    public  Integer getRoomType(){
        return this.roomType;
    }
    public void setCheckinDate (String  checkinDate){
        this.checkinDate=checkinDate;
    }
    public  String getCheckinDate(){
        return this.checkinDate;
    }
    public void setCheckoutDate (String  checkoutDate){
        this.checkoutDate=checkoutDate;
    }
    public  String getCheckoutDate(){
        return this.checkoutDate;
    }
    public void setRoomRate (Double  roomRate){
        this.roomRate=roomRate;
    }
    public  Double getRoomRate(){
        return this.roomRate;
    }
    public void setCashPledge (Double  cashPledge){
        this.cashPledge=cashPledge;
    }
    public  Double getCashPledge(){
        return this.cashPledge;
    }
    public void setRemark (String  remark){
        this.remark=remark;
    }
    public  String getRemark(){
        return this.remark;
    }
}
