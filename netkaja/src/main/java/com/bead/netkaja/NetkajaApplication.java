package com.bead.netkaja;

import com.bead.netkaja.model.Allergens;
import com.bead.netkaja.service.imp.ImpAllergensService;
import com.bead.netkaja.service.imp.ImpCustomerService;
import com.bead.netkaja.service.imp.ImpFoodService;
import com.bead.netkaja.service.imp.ImpOrderService;
import com.bead.netkaja.service.interf.AllergensService;
import com.bead.netkaja.service.interf.CustomerService;
import com.bead.netkaja.service.interf.FoodService;
import com.bead.netkaja.service.interf.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NetkajaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NetkajaApplication.class, args);
		AllergensService allergensService = context.getBean(ImpAllergensService.class);
		CustomerService customerService = context.getBean(ImpCustomerService.class);
		FoodService foodService = context.getBean(ImpFoodService.class);
		OrderService orderService = context.getBean(ImpOrderService.class);

		//tesztelés create update delete list
		allergensService.create(new Allergens("Glutén",1));
		allergensService.create(new Allergens("Rákfélék",2));
		allergensService.create(new Allergens("Tojás",3));
		allergensService.create(new Allergens("Hal",4));
		allergensService.create(new Allergens("Földimogyoró",5));
		allergensService.create(new Allergens("Szójabab",6));
		allergensService.create(new Allergens("Tej",7));
		allergensService.create(new Allergens("Diófélék",8));
		allergensService.create(new Allergens("Zeller",9));
		allergensService.create(new Allergens("Mustár",10));
		Allergens allergens = allergensService.create(new Allergens("Szezámmag",11));
		allergensService.create(new Allergens("Kén-dioxid",12));
		allergensService.create(new Allergens("Csillagfürt",13));
		allergensService.create(new Allergens("Puhatestűek",14));

		System.out.println("Allergének listája");
		allergensService.list().forEach(System.out::println);

		System.out.println("Zeller keresése");
		System.out.println(allergensService.findByName("Zeller"));

		System.out.println("Szezámmag törlése");
		allergensService.delete(allergens);
		System.out.println(allergensService.findByName("Szezámmag"));
	}
}
