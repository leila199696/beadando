package com.bead.netkaja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NetkajaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NetkajaApplication.class, args);
	/*	AllergensService allergensService = context.getBean(ImpAllergensService.class);
		CustomerService customerService = context.getBean(ImpCustomerService.class);
		FoodService foodService = context.getBean(ImpFoodService.class);
		OrderService orderService = context.getBean(ImpOrderService.class);

		//tesztelés create update delete list
		allergensService.create(new Allergen("Glutén",1));
		allergensService.create(new Allergen("Rákfélék",2));
		allergensService.create(new Allergen("Tojás",3));
		allergensService.create(new Allergen("Hal",4));
		allergensService.create(new Allergen("Földimogyoró",5));
		allergensService.create(new Allergen("Szójabab",6));
		allergensService.create(new Allergen("Tej",7));
		allergensService.create(new Allergen("Diófélék",8));
		allergensService.create(new Allergen("Zeller",9));
		allergensService.create(new Allergen("Mustár",10));
		Allergen allergens = allergensService.create(new Allergen("Szezámmag",11));
		allergensService.create(new Allergen("Kén-dioxid",12));
		allergensService.create(new Allergen("Csillagfürt",13));
		allergensService.create(new Allergen("Puhatestűek",14));

		System.out.println("Allergének listája");
		allergensService.list().forEach(System.out::println);

		System.out.println("Zeller keresése");
		System.out.println(allergensService.findByName("Zeller"));

		System.out.println("Szezámmag törlése");
		allergensService.delete(allergens);
		System.out.println(allergensService.findByName("Szezámmag"));*/
	}
}
