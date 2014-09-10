package org.koushik.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//import java.util.List;

public class Triangle implements  ApplicationContextAware, BeanNameAware, Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context;
	
	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw(){
		
			System.out.println("Drawing Triangle");
			
			System.out.println("PointA = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
			System.out.println("PointB = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
			System.out.println("PointC = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
	}


	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
	}


	@Override
	public void setBeanName(String BeanName) {
	
		System.out.println("Bean name is: " + BeanName);
	}

}
