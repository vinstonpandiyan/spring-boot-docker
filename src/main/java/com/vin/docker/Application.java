package com.vin.docker;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring-boot Docker Tomcat example
 * 
 * @author Vinston Pandiyan
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

	private static Log logger = LogFactory.getLog(Application.class);

	@Bean
	protected ServletContextListener listener() {
		return new ServletContextListener() {
			@Override
			public void contextInitialized(ServletContextEvent sce) {
				logger.info("ServletContext initialized");
			}
			@Override
			public void contextDestroyed(ServletContextEvent sce) {
				logger.info("ServletContext destroyed");
			}
		};
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}