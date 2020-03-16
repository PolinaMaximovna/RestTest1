package ru.java.courses.resttest.persons;

import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController
{
    @RequestMapping("/welcome")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    )
    {
        model.put("name", name);
        return "page";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "hello, letsCode!");
        return "main";
    }
}

//
//@Controller
//public class Controller {
//
//
//    @RequestMapping("/welcome")
//    public String greeting(
//            @RequestParam(name="name", required=false, defaultValue="World") String name,
//            Map<String, Object> model
//    )
//    {
//        model.put("name", name);
//        return "page";
//    }
//
//    @GetMapping
//    public String main(Map<String, Object> model) {
//        model.put("some", "hello, letsCode!");
//        return "main";
//    }
//}
