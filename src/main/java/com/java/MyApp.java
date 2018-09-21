package com.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyApp {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("resources/spring.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		/*ApplicationContext context=new ClassPathXmlApplicationContext("r");
		Car c=(Car)context.getBean("c");*/
		Car c=(Car)factory.getBean("c");
		c.getCarname();
		c.getEngine().getModelyear();
	}
}
