package com.peyman.spring5webapp.services.di;

import org.springframework.stereotype.Service;

/**
 * Created by Peyman on 12/10/2017.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS="Hello Gurus!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
