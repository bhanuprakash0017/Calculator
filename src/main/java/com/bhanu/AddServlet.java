package com.bhanu;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    public void  service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i=Integer.parseInt(req.getParameter("num1"));
        int j=Integer.parseInt(req.getParameter("num2"));
        PrintWriter out=res.getWriter();
        int k=i+j;
        out.println("result is"+k);
    }
}
