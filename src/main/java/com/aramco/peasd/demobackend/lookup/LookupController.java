package com.aramco.peasd.demobackend.lookup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lookup")
public class LookupController {

    @GetMapping("/fields")
    public String getFields(){
        return "ABQQ";
    }

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
}
