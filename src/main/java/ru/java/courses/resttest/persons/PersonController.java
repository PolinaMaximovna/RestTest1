package ru.java.courses.resttest.persons;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/welcome")
    public Person getPerson(@RequestParam(value="name", required=false, defaultValue="Test") String name)
    {
        System.out.println(name);
        return new Person(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping("/ru")
    public Person getPerson()
    {
        return new Person(counter.incrementAndGet(),
                String.format(template, "YYYY"));
    }


}
