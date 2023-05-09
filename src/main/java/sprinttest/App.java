package sprinttest;

import Service.Database.MYSQL_Database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
	/*	ApplicationContext cxt = new FileSystemXmlApplicationContext("beans.xml");
		student s1bean = cxt.getBean("id1",student.class);
		System.out.println(s1bean);
		ApplicationContext cxt1 = new ClassPathXmlApplicationContext("beans1.xml");
		student s1bean1 = cxt1.getBean("id2",student.class);
		System.out.println(s1bean1);
		
		
		

		ApplicationContext cxt2 = new FileSystemXmlApplicationContext("beansp.xml");
		Person p =(Person) cxt2.getBean("idp",Person.class);
		System.out.println(p);
		((FileSystemXmlApplicationContext) cxt2).close();   */
		
		/*scope demo*/
		
	/*	ApplicationContext cxt_s = new ClassPathXmlApplicationContext("scopes.xml");
		ScopeDemoClass s1 = cxt_s.getBean("id_ScopeSingleton",ScopeDemoClass.class);
		s1.setStr("Singleton_updated_string");
		System.out.println(s1);
		
		ScopeDemoClass s2 = cxt_s.getBean("id_ScopeSingleton",ScopeDemoClass.class);
		System.out.println(s2);
		
		
		

		
		ScopeDemoClass p1 = cxt_s.getBean("id_ScopePrototype",ScopeDemoClass.class);
		p1.setStr("prototype_updated_string");
		System.out.println(p1);
		
		ScopeDemoClass p2 = cxt_s.getBean("id_ScopePrototype",ScopeDemoClass.class);
		System.out.println(p2); 
		*/
		
		
	/*	student s = new student();
		s.setName("abc");
		s.setMarks(90);
		System.out.println(s);
		// TODO Auto-generated method stub  */
		
		/* life cycle demo */
		
		ApplicationContext cxt_LC = new ClassPathXmlApplicationContext("Lifecycle.xml");
	    LifeCycleHook hook = (LifeCycleHook) cxt_LC.getBean("hook_Id"); 
		
		
		/* autowiring demo */
		
	  /* ApplicationContext cxt_au = new ClassPathXmlApplicationContext("autowiring1.xml");
		User ctoUser = (User) cxt_au.getBean("cto");
		System.out.println(ctoUser);
		
		User ceoUser = (User) cxt_au.getBean("ceo");
		System.out.println(ceoUser); */
		
		
		
		/* autowiring annotation demo */
		
	/*	ApplicationContext cxt_anno = new ClassPathXmlApplicationContext("autowiring_annotation.xml");
		//AnnotationConfigApplicationContext cxt_anno = new AnnotationConfigApplicationContext();
		//cxt_anno.scan("sprinttest");
		//cxt_anno.refresh();
		Orange ofruit = (Orange) cxt_anno.getBean(Orange.class);
		System.out.println(ofruit);
		
		Apple afruit = (Apple) cxt_anno.getBean(Apple.class);
		System.out.println(afruit);
		
		
		Basket fruits = (Basket) cxt_anno.getBean(Basket.class);
		System.out.println(fruits);
		
		
		
		
		
		((ClassPathXmlApplicationContext) cxt_anno).close();
		//cxt_anno.close();
		*/
		
	/*	
		System.out.println("hello world");
		ApplicationContext cxt_db = new FileSystemXmlApplicationContext("beans_jdbc.xml");
		
		MYSQL_Database dbobj =(MYSQL_Database)cxt_db.getBean(MYSQL_Database.class);
		dbobj.displayData();
		
		
	//	System.out.println("***********************");
	//	dbobj.createData();
		System.out.println("***********************");
		dbobj.deleteData(4);
		
		
		((FileSystemXmlApplicationContext) cxt_db).close();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
