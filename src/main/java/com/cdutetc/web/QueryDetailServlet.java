package com.cdutetc.web;

import com.alibaba.fastjson.JSON;
import com.cdutetc.pojo.View;
import com.cdutetc.service.pageViewService;
import org.bson.Document;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/queryDetailServlet")
public class QueryDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        String s = reader.readLine();
        Integer brandID = JSON.parseObject(s, int.class);

        pageViewService db = new pageViewService();

//        System.out.println(brandID);
        Document document = db.QueryById(brandID);
        Integer readNum = (Integer) document.get("readNum");
        View view = new View();
        view.setBrandID(brandID);
        view.setReadNum(readNum);
        db.Update(view);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
