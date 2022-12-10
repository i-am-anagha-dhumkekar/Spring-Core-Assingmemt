package com.nissan.app;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.service.Vehicle;
public class DemoVehicleTest {

	public static void main(String[] args) {
		
		try {
		Scanner scanner=new Scanner(System.in);
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
				

		
		int choice=0;
		
		do {
	    System.out.println("1.Nissan");
	    System.out.println("2.Tata");
	    System.out.println("3.Mahindra");
	    System.out.println("4.Exit");
	    System.out.println("=================================");
	    System.out.println("Enter your choice");
	     choice=scanner.nextInt();
	    switch(choice) {
	    case 1 :
	    	Vehicle car=context.getBean("nissan",Vehicle.class);
			car.carInfo();
			break;
	    case 2 :
	    	Vehicle car2=context.getBean("tata",Vehicle.class);
			car2.carInfo();
	    case 3 :
	    	Vehicle car3=context.getBean("mahindra",Vehicle.class);
			car3.carInfo();
	    	break;
	    case 4 :
	    	System.out.println("Successfully exited");
	    	break;
	    default:
	    	System.out.println("Invalid option");
	    }
	    
	    }while(choice!=4);
		}catch(Exception e)
		{
			System.out.println("Something went wrong...");
		}
	}

}
