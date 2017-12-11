package com.peyman.spring5webapp.services.di;

import org.springframework.stereotype.Service;

/**
 * Created by Peyman on 12/10/2017.
 */
@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello- I was injected Via the Setter";
    }
}
