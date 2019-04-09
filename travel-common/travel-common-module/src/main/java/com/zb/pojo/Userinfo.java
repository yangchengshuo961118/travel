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
    private String phone;
    //
    private String password;
    //
    private String userName;
    //
    private String gender;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress (String address){
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
