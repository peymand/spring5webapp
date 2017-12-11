package com.peyman.spring5webapp.controllers;

import com.peyman.spring5webapp.controllers.di.GetterInjectedController;
import com.peyman.spring5webapp.controllers.di.PropertyInjectedController;
import com.peyman.spring5webapp.services.di.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Peyman on 12/10/2017.
 */
public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;
    @Before
    public void setUp() throws Exception{
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS,getterInjectedController.sayHello());
    }
}
