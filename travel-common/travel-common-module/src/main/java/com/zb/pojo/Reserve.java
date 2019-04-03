package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Reserve implements Serializable {
    //
    private String id;
    //
    private String name;
    //
    private Integer days;
    //
    private Integer guest;
    //
    private String roomType;
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

    private String card;

    private String phone;

    private Integer status;

    private String email;

    //get set 方法
    public void setId (String   id){
        this.id=id;
    }
    public  String  getId(){
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
    public void setRoomType (String  roomType){
        this.roomType=roomType;
    }
    public  String getRoomType(){
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

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
