package com.bead.netkaja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NetkajaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NetkajaApplication.class, args);

	}
}
