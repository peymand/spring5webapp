package com.peyman.spring5webapp.controllers.di;

import com.peyman.spring5webapp.services.di.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Peyman on 12/10/2017.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return this.greetingService.sayGreeting();
    }
}
