package com.travel.basic.entity;

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

    @Override
    public String toString() {
        return "Hotplace [id=" + id + ", sImg=" + sImg + ", sName=" + sName + ", sLevel=" + sLevel + ", sArea=" + sArea
                + ", sPrice=" + sPrice + ", sSoldnum=" + sSoldnum + ", sightHot=" + sightHot + ", sReplace=" + sReplace
                + ", sSlogen=" + sSlogen + "]";
    }

}