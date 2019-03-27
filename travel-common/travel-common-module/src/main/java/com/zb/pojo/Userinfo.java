package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Userinfo implements Serializable {
    //
    private Integer userId;
    //
    private Integer phone;
    //
    private String password;
    //
    private String userName;
    //
    private Integer gender;
    //
    private String address;
    //
    private String birth;
    //
    private String signature;
    //
    private String photo;
    //
    private Integer integral;
    //get set 方法
    public void setUserId (Integer  userId){
        this.userId=userId;
    }
    public  Integer getUserId(){
        return this.userId;
    }
    public void setPhone (Integer  phone){
        this.phone=phone;
    }
    public  Integer getPhone(){
        return this.phone;
    }
    public void setPassword (String  password){
        this.password=password;
    }
    public  String getPassword(){
        return this.password;
    }
    public void setUserName (String  userName){
        this.userName=userName;
    }
    public  String getUserName(){
        return this.userName;
    }
    public void setGender (Integer  gender){
        this.gender=gender;
    }
    public  Integer getGender(){
        return this.gender;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setBirth (String  birth){
        this.birth=birth;
    }
    public  String getBirth(){
        return this.birth;
    }
    public void setSignature (String  signature){
        this.signature=signature;
    }
    public  String getSignature(){
        return this.signature;
    }
    public void setPhoto (String  photo){
        this.photo=photo;
    }
    public  String getPhoto(){
        return this.photo;
    }
    public void setIntegral (Integer  integral){
        this.integral=integral;
    }
    public  Integer getIntegral(){
        return this.integral;
    }
}
