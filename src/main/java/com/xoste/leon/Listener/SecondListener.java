package com.xoste.leon.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Leon
 */
public class SecondListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("SecondListener...init...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
