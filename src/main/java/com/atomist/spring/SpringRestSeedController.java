package com.atomist.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class SpringRestSeedController {

    @GetMapping("/hello/{name1}")
    public String person(@PathVariable String name1) {
        return "Hello " + name1 + "!";
    }

}
