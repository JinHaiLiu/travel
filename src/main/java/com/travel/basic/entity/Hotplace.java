package com.travel.basic.entity;


/**
 * @author suhu
 */
public class Hotplace {
    private Integer id;

    private String sImg;

    private String sName;

    private String sLevel;

    private String sArea;

    private Integer sPrice;

    private Integer sSoldnum;

    private Integer sightHot;

    private String sReplace;

    private String sSlogen;
    
    private String sMonth;
    
    
    
    private String soldnum1; // 上月份人气数字段
    
    private String soldnum2; // 当前月人气数字段
    
    private String price1; // 上月份价格字段
    
    private String price2; // 当前月份价格字段
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getsImg() {
        return sImg;
    }

    public void setsImg(String sImg) {
        this.sImg = sImg == null ? null : sImg.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsLevel() {
        return sLevel;
    }

    public void setsLevel(String sLevel) {
        this.sLevel = sLevel == null ? null : sLevel.trim();
    }

    public String getsArea() {
        return sArea;
    }

    public void setsArea(String sArea) {
        this.sArea = sArea == null ? null : sArea.trim();
    }

    public Integer getsPrice() {
        return sPrice;
    }

    public void setsPrice(Integer sPrice) {
        this.sPrice = sPrice;
    }

    public Integer getsSoldnum() {
        return sSoldnum;
    }

    public void setsSoldnum(Integer sSoldnum) {
        this.sSoldnum = sSoldnum;
    }

    public Integer getSightHot() {
        return sightHot;
    }

    public void setSightHot(Integer sightHot) {
        this.sightHot = sightHot;
    }

    public String getsReplace() {
        return sReplace;
    }

    public void setsReplace(String sReplace) {
        this.sReplace = sReplace == null ? null : sReplace.trim();
    }

    public String getsSlogen() {
        return sSlogen;
    }

    public void setsSlogen(String sSlogen) {
        this.sSlogen = sSlogen == null ? null : sSlogen.trim();
    }
    
    public String getsMonth() {
        return sMonth;
    }

    public void setsMonth(String sMonth) {
        this.sMonth = sMonth;
    }
    
    public String getSoldnum1() {
        return soldnum1;
    }

    public void setSoldnum1(String soldnum1) {
        this.soldnum1 = soldnum1;
    }

    public String getSoldnum2() {
        return soldnum2;
    }

    public void setSoldnum2(String soldnum2) {
        this.soldnum2 = soldnum2;
    }
    
    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public String getPrice2() {
        return price2;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }

    @Override
    public String toString() {
        return "Hotplace [id=" + id + ", sImg=" + sImg + ", sName=" + sName + ", sLevel=" + sLevel + ", sArea=" + sArea
                + ", sPrice=" + sPrice + ", sSoldnum=" + sSoldnum + ", sightHot=" + sightHot + ", sReplace=" + sReplace
                + ", sSlogen=" + sSlogen + ", sMonth=" + sMonth + "]";
    }
    
}