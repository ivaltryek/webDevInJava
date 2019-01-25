/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author user1
 */
public class MyContextListener implements ServletContextListener {
    ServletContext context;
    int i;
    @Override
    synchronized public void contextInitialized(ServletContextEvent sce) {
        
        System.out.println("Context Initialized");
        context = sce.getServletContext();
        context.setAttribute("hits", i);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Destroyed");
        context = sce.getServletContext();
        i = (Integer) context.getAttribute("hits");                                                                      
    }
}
