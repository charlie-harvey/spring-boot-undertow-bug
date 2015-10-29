package com.example.endpoints;

import java.util.concurrent.Callable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloEndpoints {

    @RequestMapping(value = "/{text}", method = RequestMethod.GET)
    public final Callable<String> there(
                    @PathVariable final String text) {
        return new Callable<String>() {

            public String call() {
                return text;
            }
        };
    }
}
