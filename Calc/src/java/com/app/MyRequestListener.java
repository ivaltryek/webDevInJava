/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Web application lifecycle listener.
 *
 * @author user1
 */
public class MyRequestListener implements ServletRequestListener {
    ServletContext context;
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
           context = sre.getServletContext();
           context.log("Request Destroyed");
           System.out.println("request destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        context = sre.getServletContext();
           context.log("Request Initialized");
          System.out.println("request initialized");
          String s =((HttpServletRequest)sre.getServletRequest()).getRequestURI();
          System.out.println(s);
    }
}
