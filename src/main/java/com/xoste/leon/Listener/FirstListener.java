package com.xoste.leon.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Leon
 */
@WebListener
public class FirstListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("FirstListener...init...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
