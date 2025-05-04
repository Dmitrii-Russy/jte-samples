package com.example.jte_samples;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/demo/primitives-n-objects")
    public String showPrimitivesAndObjects(Model model) {
        var str = "World";
        model.addAttribute("str", str);
        return "primitives-n-objects";
    }

    @GetMapping("/demo/for-loop")
    public String showForLoop(Model model) {
        var items = List.of("Item 1","Item 2","Item 3");
        model.addAttribute("items", items);
        return "for-loop";
    }

    @GetMapping("/demo/object")
    public String showObject(Model model) {
        var person = new Person("Johnnie Walker");
        model.addAttribute("person", person);
        return "object";
    }

    @GetMapping("/demo/if")
    public String showIf(@RequestParam(required = false) Integer num, Model model) {
        model.addAttribute("num", num);
        return "if";
        //http://localhost:8080/demo/if
        //http://localhost:8080/demo/if?num=1234567890
    }

}
