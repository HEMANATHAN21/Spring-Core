package caeengine;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
		Car c = context.getBean(Car.class);
		System.out.println(c);

	}

}
