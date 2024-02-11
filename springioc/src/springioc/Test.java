package springioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	
	public static void main(String[] args) {
		
		
	ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	
	Employee e = ac.getBean("a",Employee.class);
	System.out.println(e);
	
	
	
	
	
	
	
		
	}
}
