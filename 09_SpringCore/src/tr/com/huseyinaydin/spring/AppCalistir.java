package tr.com.huseyinaydin.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Java EE
*
*/

public class AppCalistir {

	public static void main(String[] args) {
		//Araba araba = new Araba();
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("springConf.xml"));
		
		Araba araba = (Araba) beanFactory.getBean("araba");
		araba.calistir();
	}
}