package dev.nomizo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotation used to make amy class a REST Controller
@RestController
public class HelloController {

    // Annotation used on methods for a request to work.  Also passes in a string that represents the URL (GET BY DEFAULT)
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
}
