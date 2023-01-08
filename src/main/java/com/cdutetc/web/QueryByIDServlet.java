package com.cdutetc.web;

import com.alibaba.fastjson.JSON;
import com.cdutetc.service.pageViewService;
import org.bson.Document;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/queryByIDServlet")
public class QueryByIDServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        pageViewService db = new pageViewService();

        BufferedReader br = request.getReader();
        String id = br.readLine();

//        System.out.println(id);

        int id1 = JSON.parseObject(id, int.class);
        //String brandID = request.getParameter("brandID");
        Document query = db.QueryById(id1);

        String brand = JSON.toJSONString(query);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(brand);

//        System.out.println(brand);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
