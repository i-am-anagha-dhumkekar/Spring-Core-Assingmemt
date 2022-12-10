package com.nissan.bean;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.nissan.service.*;
@Component
public class FortuneService implements ICoach{
	@Override
	public String getFortune()
	{
		String[] arr= {"Chance","Luck","Assests"};
		//Random rand=new Random();
		int i=(int) (Math.random()*3);
		//System.out.println(i);
		return arr[i];
		
	}
}
