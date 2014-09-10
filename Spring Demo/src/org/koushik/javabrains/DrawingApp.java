package org.koushik.javabrains;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String[] args){
		
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		//Shape triangle = (Shape) context.getBean("triangle1");
		Shape circle  = (Shape) context.getBean("circle");	
		//triangle.draw();
		circle.draw();

	}
}
