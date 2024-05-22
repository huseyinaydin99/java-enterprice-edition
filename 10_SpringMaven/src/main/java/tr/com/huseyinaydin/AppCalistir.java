package tr.com.huseyinaydin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCalistir {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeanConf.xml");
		
		Araba araba = (Araba) applicationContext.getBean("araba");
		araba.calistir();
	}
}