package com.peyman.spring5webapp.controllers;

import com.peyman.spring5webapp.controllers.di.ConstructorInjectedController;
import com.peyman.spring5webapp.controllers.di.GetterInjectedController;
import com.peyman.spring5webapp.services.di.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Peyman on 12/10/2017.
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;
    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController =
                new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS,constructorInjectedController.sayHello());
    }
}
