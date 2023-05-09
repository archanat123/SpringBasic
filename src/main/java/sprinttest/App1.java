package sprinttest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext cxt1 = new ClassPathXmlApplicationContext("beansp.xml");
		Person s1bean1 = cxt1.getBean("id2",Person.class);
		System.out.println(s1bean1);

	}

}
