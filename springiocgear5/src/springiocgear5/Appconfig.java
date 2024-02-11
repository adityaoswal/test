package springiocgear5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {


	

@Bean
public col c ()
{
	
	col c = new col();
	
	List l = new ArrayList<>();
	l.add("hello");
	l.add(1);
	
	c.setList(l);
	
	Set s = new HashSet<>();
	s.add("adi");
	s.add("2");
	
	c.setSet(s);
	
	Map m = new HashMap<>();
	m.put(1, "popo");
	m.put(2,2);
	
	c.setMap(m);
	
	return c;
	
	
	
}
	
	
	
}
