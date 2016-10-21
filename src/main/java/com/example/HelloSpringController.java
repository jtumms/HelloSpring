package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by john.tumminelli on 10/21/16.
 */

@Controller
public class HelloSpringController {
    @RequestMapping(path = "/person", method = RequestMethod.GET)
    public String person(Model model, String name, String city, Integer age) {
        if (name == null) {
            name = "Alice";
        }
        if (city == null)  {
            city = "New York";
        }
        if (age == null){
            age = 40;
        }
        Person p = new Person(name, city, 40);
        model.addAttribute("person", p);
        return "person";
    }
}
