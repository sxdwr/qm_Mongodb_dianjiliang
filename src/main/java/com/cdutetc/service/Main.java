package com.cdutetc.service;

import com.cdutetc.pojo.View;

public class Main {
    public static void main(String[] args) {
        pageViewService db = new pageViewService();

        View view1 = new View();
        view1.setBrandID(1);
        view1.setImageURL("./images/brand1.jpg");
        view1.setImageTitle("车牌号为桂A11V13的宝马1997CC越野车一辆");
        view1.setPriceNow(23.68);
        view1.setForecast(28.29);
        view1.setDateline("12 月 22 日 10:00 ");
        view1.setReadNum(44555);
        view1.setParticipateNum(456);
        db.Insert(view1);

        View view2 = new View();
        view2.setBrandID(2);
        view2.setImageURL("./images/brand2.jpg");
        view2.setImageTitle("鲁Q967GN福田牌重型自卸货车一辆");
        view2.setPriceNow(9.8);
        view2.setForecast(8.5);
        view2.setDateline("12 月 14 日 10:00 ");
        view2.setReadNum(45654);
        view2.setParticipateNum(454);
        db.Insert(view2);

        View view3 = new View();
        view3.setBrandID(3);
        view3.setImageURL("./images/brand3.jpg");
        view3.setImageTitle("兰德酷路泽普拉多牌小型越野客车");
        view3.setPriceNow(18.252);
        view3.setForecast(14.299);
        view3.setDateline("12 月 15 日 10:00 ");
        view3.setReadNum(54645);
        view3.setParticipateNum(5454);
        db.Insert(view3);

        View view4 = new View();
        view4.setBrandID(4);
        view4.setImageURL("./images/brand4.jpg");
        view4.setImageTitle("鲁Q22T22埃尔法小型普通客车一辆");
        view4.setPriceNow(85.00);
        view4.setForecast(80.29);
        view4.setDateline("12 月 25 日 10:00 ");
        view4.setReadNum(56466);
        view4.setParticipateNum(455);
        db.Insert(view4);

        View view5 = new View();
        view5.setBrandID(5);
        view5.setImageURL("./images/brand5.jpg");
        view5.setImageTitle("车牌号为云PEG777大众牌汽车一辆");
        view5.setPriceNow(9.29);
        view5.setForecast(9.68);
        view5.setDateline("12 月 20 日 10:00 ");
        view5.setReadNum(5646);
        view5.setParticipateNum(454);
        db.Insert(view5);

        View view6 = new View();
        view6.setBrandID(6);
        view6.setImageURL("./images/brand6.jpg");
        view6.setImageTitle("路虎发现牌小型越野客车一辆");
        view6.setPriceNow(8.625);
        view6.setForecast(7.56);
        view6.setDateline("12 月 23 日 10:00 ");
        view6.setReadNum(5645);
        view6.setParticipateNum(545);
        db.Insert(view6);

        View view7 = new View();
        view7.setBrandID(7);
        view7.setImageURL("./images/brand7.jpg");
        view7.setImageTitle("浙B6929T丰田牌小型汽车");
        view7.setPriceNow(8.06);
        view7.setForecast(9.02);
        view7.setDateline("12 月 26 日 10:00 ");
        view7.setReadNum(4645);
        view7.setParticipateNum(544);
        db.Insert(view7);

        View view8 = new View();
        view8.setBrandID(8);
        view8.setImageURL("./images/brand8.jpg");
        view8.setImageTitle("重型半挂车牵引车及浙B399T重型自卸半挂车");
        view8.setPriceNow(14.68);
        view8.setForecast(20.29);
        view8.setDateline("12 月 24 日 10:00 ");
        view8.setReadNum(4554);
        view8.setParticipateNum(564);
        db.Insert(view8);

    }
}
