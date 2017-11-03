package com.bead.netkaja;

import com.bead.netkaja.model.Allergens;
import com.bead.netkaja.model.Role;
import com.bead.netkaja.model.User;
import com.bead.netkaja.service.imp.ImpAllergensService;
import com.bead.netkaja.service.imp.ImpUserService;
import com.bead.netkaja.service.interf.AllergensService;
import com.bead.netkaja.service.interf.UserService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NetkajaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NetkajaApplication.class, args);
		UserService userService = context.getBean(ImpUserService.class);
		userService.create(new User("admin","admin", Role.ADMIN));
		User user = new User("admin","admin", Role.ADMIN);
		new User();
	}
}
