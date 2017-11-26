package com.bead.netkaja;

public class Controller {

    //customer
/*
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute(new Customer());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user, Model model) {
        try {
            userService.login(user);
            return redirectToGreeting(user);
        }
        catch (UserNotValidException e) {
            model.addAttribute("error", true);
            return "login";
        }
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("customer", new Customer());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        user.setRole(USER);
        userService.register(user);

        return redirectToGreeting(user);
    }

    private String redirectToGreeting(@ModelAttribute User user) {
        return "redirect:/user/greet?name=" + user.getUsername();
    }

    //admin
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute(new Customer());
        return "login";
    }

    @GetMapping("/food")
    @PostMapping("/food")
    @GetMapping("/allergens")
    @PostMapping("/allergens")
    @GetMapping("/orders")
    @PostMapping("/orders")
    @GetMapping("/customers")
    @PostMapping("/customers")
    @GetMapping("/customer/data")
    @PostMapping("/customer/data")*/
}
