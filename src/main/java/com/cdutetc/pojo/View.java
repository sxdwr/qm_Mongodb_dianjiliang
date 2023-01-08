package com.cdutetc.pojo;

public class View {
//    商品ID
    private int brandID;
//    图片的路径
    private String imageURL;
//    图片的标题
    private String imageTitle;
//    当前价钱
    private Double priceNow;
//   预估价
    private Double forecast;
//    结束时间
    private String dateline;
//    浏览量
    private int readNum;
//    参与者人数
    private int participateNum;

    public View() {
    }

    public View(int brandID, String imageURL, String imageTitle, Double priceNow, Double forecast, String dateline, int readNum, int participateNum) {
        this.brandID = brandID;
        this.imageURL = imageURL;
        this.imageTitle = imageTitle;
        this.priceNow = priceNow;
        this.forecast = forecast;
        this.dateline = dateline;
        this.readNum = readNum;
        this.participateNum = participateNum;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    public Double getPriceNow() {
        return priceNow;
    }

    public void setPriceNow(Double priceNow) {
        this.priceNow = priceNow;
    }

    public Double getForecast() {
        return forecast;
    }

    public void setForecast(Double forecast) {
        this.forecast = forecast;
    }

    public String getDateline() {
        return dateline;
    }

    public void setDateline(String dateline) {
        this.dateline = dateline;
    }

    public int getReadNum() {
        return readNum;
    }

    public void setReadNum(int readNum) {
        this.readNum = readNum;
    }

    public int getParticipateNum() {
        return participateNum;
    }

    public void setParticipateNum(int participateNum) {
        this.participateNum = participateNum;
    }

    @Override
    public String toString() {
        return "View{" +
                "brandID=" + brandID +
                ", imageURL='" + imageURL + '\'' +
                ", imageTitle='" + imageTitle + '\'' +
                ", priceNow=" + priceNow +
                ", forecast=" + forecast +
                ", dateline='" + dateline + '\'' +
                ", readNum=" + readNum +
                ", participateNum=" + participateNum +
                '}';
    }
}
