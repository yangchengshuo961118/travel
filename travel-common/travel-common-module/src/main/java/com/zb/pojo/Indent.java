package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Indent implements Serializable {
    //id
    private Integer id;
    //订单数量
    private Integer inum;
    //联系人
    private String iconsignee;
    //联系人电话
    private String iphone;
    //订单时间
    private String idate;
    //用户编号
    private Integer iuid;
    //景点id
    private Integer ivid;
    //总价
    private Double iamount;
    //订单编号
    private String iorderNo;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setInum (Integer  inum){
        this.inum=inum;
    }
    public  Integer getInum(){
        return this.inum;
    }
    public void setIconsignee (String  iconsignee){
        this.iconsignee=iconsignee;
    }
    public  String getIconsignee(){
        return this.iconsignee;
    }
    public void setIphone (String  iphone){
        this.iphone=iphone;
    }
    public  String getIphone(){
        return this.iphone;
    }
    public void setIdate (String  idate){
        this.idate=idate;
    }
    public  String getIdate(){
        return this.idate;
    }
    public void setIuid (Integer  iuid){
        this.iuid=iuid;
    }
    public  Integer getIuid(){
        return this.iuid;
    }
    public void setIvid (Integer  ivid){
        this.ivid=ivid;
    }
    public  Integer getIvid(){
        return this.ivid;
    }
    public void setIamount (Double  iamount){
        this.iamount=iamount;
    }
    public  Double getIamount(){
        return this.iamount;
    }
    public void setIorderNo (String  iorderNo){
        this.iorderNo=iorderNo;
    }
    public  String getIorderNo(){
        return this.iorderNo;
    }
}
