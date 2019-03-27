package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Customerinfo implements Serializable {
    //
    private Integer id;
    //
    private String name;
    //
    private String phone;
    //
    private String identitCard;
    //
    private Integer roomId;
    //
    private String checkRoom;
    //
    private String checkinDate;
    //
    private Double roomRate;
    //
    private Double cashPledge;
    //
    private String checkoutDate;
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
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setIdentitCard (String  identitCard){
        this.identitCard=identitCard;
    }
    public  String getIdentitCard(){
        return this.identitCard;
    }
    public void setRoomId (Integer  roomId){
        this.roomId=roomId;
    }
    public  Integer getRoomId(){
        return this.roomId;
    }
    public void setCheckRoom (String  checkRoom){
        this.checkRoom=checkRoom;
    }
    public  String getCheckRoom(){
        return this.checkRoom;
    }
    public void setCheckinDate (String  checkinDate){
        this.checkinDate=checkinDate;
    }
    public  String getCheckinDate(){
        return this.checkinDate;
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
    public void setCheckoutDate (String  checkoutDate){
        this.checkoutDate=checkoutDate;
    }
    public  String getCheckoutDate(){
        return this.checkoutDate;
    }
    public void setRemark (String  remark){
        this.remark=remark;
    }
    public  String getRemark(){
        return this.remark;
    }
}
