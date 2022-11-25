package io.muzoo.ssc.mysports;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam String firstName, @RequestParam(required = false) String lastName) {
        return "Welcome " + firstName + " " + lastName;
    }
}
