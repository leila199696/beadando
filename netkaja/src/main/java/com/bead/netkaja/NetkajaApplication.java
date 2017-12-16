package com.bead.netkaja;

import com.bead.netkaja.model.*;
import com.bead.netkaja.service.imp.ImpAllergenService;
import com.bead.netkaja.service.imp.ImpCustomerService;
import com.bead.netkaja.service.imp.ImpFoodService;
import com.bead.netkaja.service.imp.ImpOrderService;
import com.bead.netkaja.service.interf.AllergenService;
import com.bead.netkaja.service.interf.CustomerService;
import com.bead.netkaja.service.interf.FoodService;
import com.bead.netkaja.service.interf.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class NetkajaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(NetkajaApplication.class, args);
        AllergenService allergenService = context.getBean(ImpAllergenService.class);
        CustomerService customerService = context.getBean(ImpCustomerService.class);
        FoodService foodService = context.getBean(ImpFoodService.class);
        OrderService orderService = context.getBean(ImpOrderService.class);

        //default admin hozzáadása
        if (customerService.findByUsername("admin") == null) {
            Customer admin = new Customer("admin", "4dm1n", "Adminisztrátor", "Sehunse", "Sose vót", "admin@netkaja.hu");
            admin.setRole(Role.ADMIN);
            customerService.create(admin);
            System.out.println("Admin felhasználó létrehozva.");
        }

        //tesztelés create update delete list
        allergenService.create(new Allergen("Glutén", 1));
        allergenService.create(new Allergen("Rákfélék", 2));
        allergenService.create(new Allergen("Tojás", 3));
        allergenService.create(new Allergen("Hal", 4));
        allergenService.create(new Allergen("Földimogyoró", 5));
        allergenService.create(new Allergen("Szójabab", 6));
        allergenService.create(new Allergen("Tej", 7));
        allergenService.create(new Allergen("Diófélék", 8));
        allergenService.create(new Allergen("Zeller", 9));
        allergenService.create(new Allergen("Mustár", 10));
        Allergen allergen = allergenService.create(new Allergen("Szezámmag", 11));
        allergenService.create(new Allergen("Kén-dioxid", 12));
        allergenService.create(new Allergen("Csillagfürt", 13));
        allergenService.create(new Allergen("Puhatestűek", 14));
        foodService.create(new Food(FoodType.MAINCOURSE, "Túrós tészta", Arrays.asList(allergenService.findByName("Glutén"), allergenService.findByName("Tej"))));

        System.out.println("Allergének listája");
        allergenService.list().forEach(System.out::println);

        System.out.println("Zeller keresése");
        System.out.println(allergenService.findByName("Zeller"));

        System.out.println("Szezámmag törlése");
        allergenService.delete(allergen);
        System.out.println(allergenService.findByName("Szezámmag"));
    }
}
