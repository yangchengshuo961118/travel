package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Shipcontact implements Serializable {
    //
    private Integer contactId;
    //
    private Integer uId;
    //
    private String area;
    //
    private String phone;
    //
    private Integer postcode;
    //
    private Integer status;
    //get set 方法
    public void setContactId (Integer  contactId){
        this.contactId=contactId;
    }
    public  Integer getContactId(){
        return this.contactId;
    }
    public void setUId (Integer  uId){
        this.uId=uId;
    }
    public  Integer getUId(){
        return this.uId;
    }
    public void setArea (String  area){
        this.area=area;
    }
    public  String getArea(){
        return this.area;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setPostcode (Integer  postcode){
        this.postcode=postcode;
    }
    public  Integer getPostcode(){
        return this.postcode;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
}
