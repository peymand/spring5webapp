package com.peyman.spring5webapp.controllers.di;

import com.peyman.spring5webapp.services.di.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Peyman on 12/10/2017.
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
}

    public String sayHello(){
        return greetingService.sayGreeting();
    }


}
