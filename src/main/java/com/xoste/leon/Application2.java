package com.xoste.leon;

import com.xoste.leon.Listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author Leon
 */
@SpringBootApplication
public class Application2 {
    public static void main(String[] args) {
        SpringApplication.run(Application2.class, args);
    }

    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean() {
        ServletListenerRegistrationBean<SecondListener> bean = new ServletListenerRegistrationBean<>(new SecondListener());
        return bean;
    }
}
