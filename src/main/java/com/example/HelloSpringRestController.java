package com.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by john.tumminelli on 10/21/16.
 */
@RestController
public class HelloSpringRestController {
    @RequestMapping(path = "/person.json", method = RequestMethod.GET)
    public Person person(Model model, String name, String city, Integer age) {
        if (name == null) {
            name = "Alice";
        }
        if (city == null)  {
            city = "New York";
        }
        if (age == null){
            age = 40;
        }
        return new Person(name, city, age);
    }
}
