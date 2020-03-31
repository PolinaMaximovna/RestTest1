package ru.java.courses.resttest.domain;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.stereotype.Controller;
import ru.java.courses.resttest.repos.LessonRepo;

@Controller
public class GreetingController
{
    @Autowired
    private LessonRepo lessonRepos;

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
       // Iterable<Lessons> lessons = LessonRepo.findAll();
        model.put("lessons", "hello, letsCode!");
        return "main";
    }
}


