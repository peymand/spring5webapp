package com.peyman.spring5webapp.controllers;

import com.peyman.spring5webapp.controllers.di.PropertyInjectedController;
import com.peyman.spring5webapp.services.di.GreetingServiceImpl;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Peyman on 12/10/2017.
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;
    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello());
    }
}
