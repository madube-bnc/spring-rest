package com.atomist.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class SpringRestSeedController {

    @GetMapping("/hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!!!!!!! AIza12423asdfasdfasdfafdasdfasdfasdfasd";
    }
}
