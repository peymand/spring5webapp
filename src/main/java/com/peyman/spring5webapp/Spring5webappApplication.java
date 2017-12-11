package com.peyman.spring5webapp;

import com.peyman.spring5webapp.controllers.AuthorController;
import com.peyman.spring5webapp.controllers.di.ConstructorInjectedController;
import com.peyman.spring5webapp.controllers.di.GetterInjectedController;
import com.peyman.spring5webapp.controllers.di.MyController;
import com.peyman.spring5webapp.controllers.di.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =  SpringApplication.run(Spring5webappApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
