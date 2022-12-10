package com.nissan.app;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nissan.bean.Patient;
import com.nissan.service.DemoInterface;
@SuppressWarnings("deprecation")
public class DemoTestApp {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Patients Name: ");
		String name=input.nextLine();
		System.out.println("Enter Medicine name suggested: ");
		String medicines=input.nextLine();
		System.out.println("Enter total amount paid: ");
		int bill=input.nextInt();
		System.out.println("Select option: \n1.ApplicationContext \n2.Bean Factory");
		int option=input.nextInt();
		switch(option)
		{
		case 1:
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			DemoInterface inter=context.getBean("patient",DemoInterface.class);
			System.out.println("--------------------------Patient details-------------------------");
			System.out.println(inter.getPatient(name));
			System.out.println(inter.getMedicine(medicines));
			System.out.println(inter.getBills(bill));
			break;
		case 2:
			BeanFactory factory = new ClassPathXmlApplicationContext("application.xml");
			DemoInterface inter1=factory.getBean("patient",DemoInterface.class);
			System.out.println("--------------------------Patient details-------------------------");
			System.out.println(inter1.getPatient(name));
			System.out.println(inter1.getMedicine(medicines));
			System.out.println(inter1.getBills(bill));
			break;
		default:
			System.out.println("Wrong option selected...");
			break;
		}
		
	}
}
