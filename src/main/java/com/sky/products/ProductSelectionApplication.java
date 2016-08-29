package com.sky.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * <p>
 *     Runs spring boot com.sky.products.application with embedded Tomcat server.
 * </p>
 * @author Lee Grubb
 * Date: 29/08/2016
 */
@SpringBootApplication
public class ProductSelectionApplication extends SpringBootServletInitializer {

	private static Class<ProductSelectionApplication> applicationClass = ProductSelectionApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(ProductSelectionApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(applicationClass);
	}
}
