package com.boot.builder;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
@ImportResource(locations="com/boot/cfg/application-context.xml")
public class SpringApplicationCustomizeService {

	public static void main(String[] args) {
		ApplicationContext context=null;
    // ApplicationContext context=SpringApplication.run(SpringApplicationCustomizeService.class, args);
     SpringApplication spirngapp= new SpringApplicationBuilder(SpringApplicationCustomizeService.class).bannerMode(Mode.OFF).build();
     context= spirngapp.run(args);
		PriodicMaintainceService service=context.getBean("service",PriodicMaintainceService.class);
     int ser=service.getservicetilinyear();
     System.out.println(ser);
		
		
		
	}

}
