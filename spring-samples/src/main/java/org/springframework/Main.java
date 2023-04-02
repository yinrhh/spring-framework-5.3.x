package org.springframework;

import org.springframework.beans.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author: YRH
 * @date: ${DATE}
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath*:application.xml");
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("classpath*:application.xml"));
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getName());
	}

	public void test(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("classpath*:application.xml"));
		Person person = (Person) bf.getBean("person");
	}
}