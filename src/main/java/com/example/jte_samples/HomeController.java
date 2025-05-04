package com.example.jte_samples;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/demo/string")
    public String showString(Model model) {
        var str = "World";
        model.addAttribute("str", str);
        return "String";
    }

    @GetMapping("/demo/list")
    public String showList(Model model) {
        var items = List.of("Item 1","Item 2","Item 3");
        model.addAttribute("items", items);
        return "list";
    }

    @GetMapping("/demo/person")
    public String showPerson(Model model) {
        var person = new Person("Johnnie Walker");
        model.addAttribute("person", person);
        return "person";
    }

}
