package com.telusko;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Inside doGet"); // This should print when you visit /hello
        resp.setContentType("text/plain");
        resp.getWriter().write("Hello from HelloServlet!");
    }
}
