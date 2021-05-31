package javaEmp;
import java.util.*;
public class HelloEmp {
	public static void main(String[] args){
		int is_full_present=1; 
		int is_part_present=2; 
		int wage_per_hr=20;
		int full_day_work_hr=8; 
		int part_day_work_hr=4; 
		int salary;
		//double random= Math.floor(Math.random()*10)%3;
		//System.out.println("random value is:"+random);
		Random var = new Random();
		int random;
		random=var.nextInt(3);
		System.out.println("random variable is:"+random);
		switch (random) {
		case 1: 
			System.out.println("employee is present");
			salary=(wage_per_hr*full_day_work_hr);
			System.out.println("salary is:"+salary);
			break;
		case 2:
			salary=(wage_per_hr*part_day_work_hr);
			System.out.println("salary is :"+salary);
			System.out.println("employee is part time present");
		    break;
		default:
			System.out.println("when employee is absent for the day his salary is zero");					
		}
	}
}
