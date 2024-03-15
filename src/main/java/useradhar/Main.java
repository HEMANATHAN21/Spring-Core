package useradhar;

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) 
	{
//		User u = new User();
//		System.out.println(u);
		
//		ClassPathResource resourse = new ClassPathResource("user.xml");
//		BeanFactory bf = new XmlBeanFactory(resourse);
//		ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
		
//		System.out.println(bf.getBean("user"));
//		User u = (User)bf.getBean("user");
//		System.out.println(u);
		
//		User u = context.getBean(User.class);
//		System.out.println(u);
		
//		User u = context.getBean(User.class,"user");
//		System.out.println(u);
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//		Adhar a = context.getBean(Adhar.class);
//		System.out.println(a);
		
		Demo d1 = context.getBean(Demo.class);
		Demo d2 = context.getBean(Demo.class);
		Demo d3 = context.getBean(Demo.class);
		Demo d4 = context.getBean(Demo.class);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

	}

}
