package com.desenvolve.tech.exercicios.web.helloworld.controller;

import com.desenvolve.tech.exercicios.web.helloworld.service.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting") //Certifica que o HTTP GET resquest vai ser aprontado para o método greeting()
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) { //Víncula o valor da query, do tipo string, ao atributo name do método gretting()
        return new Greeting(counter.incrementAndGet(), String.format(template, name));            //Se o valor for nulo, a string World é atribuída por padrão
    }
}