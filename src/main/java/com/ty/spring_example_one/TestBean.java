package com.ty.spring_example_one;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBean {

	public static void main(String[] args) {
		
		//using spring core container
		
		Resource resource=new ClassPathResource("my_conf.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
		
		Person per=(Person)bf.getBean("myPerson");
		per.message();
		
		//using J2EE(application context) container
		
		ApplicationContext appCont=new ClassPathXmlApplicationContext("my_conf.xml");
		Person person=(Person)appCont.getBean("myPerson");
		person.message();
		
		//or we can use ConfigurableApplicationontext Interface as reference
		ConfigurableApplicationContext appCont1=new ClassPathXmlApplicationContext("my_conf.xml");
		Person person1=(Person)appCont.getBean("myPerson");
		person1.message();
		 
	}
}
