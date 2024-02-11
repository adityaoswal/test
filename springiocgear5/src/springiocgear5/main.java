package springiocgear5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	

	
	public static void main(String[] args) {
		
	
	ApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
	
col c = (col) ac.getBean("c");
	
	System.out.println(c);
	
	}	
	
}
