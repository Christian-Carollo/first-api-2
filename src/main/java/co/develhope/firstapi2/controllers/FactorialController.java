package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/factorial")
public class FactorialController {

    @GetMapping(value = "/{n}")
    public int getFactorial(@PathVariable int n){
        return n;

    }


}
