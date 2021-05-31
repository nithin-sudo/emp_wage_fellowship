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
		int working_days=20;
		int salary_per_month=0;
		int total_working_hrs=0;
			//System.out.println("random variable is:"+random);
		int i;
		  for (i=0;i<working_days;i++)
		  {
				Random var = new Random();
				int random;
				random=var.nextInt(3);
				switch(random) {
				case 1:
					salary=(wage_per_hr*full_day_work_hr);
					salary_per_month=(salary_per_month+salary);
					total_working_hrs=(total_working_hrs+full_day_work_hr);
					break;
				case 2:
					salary=(wage_per_hr*part_day_work_hr);
					salary_per_month=(salary_per_month+salary);
					total_working_hrs=(total_working_hrs+part_day_work_hr);
					break;
			  }
				if (total_working_hrs==100 || i==20)
				{
					break;
				}
			}
		System.out.println("salary is credited for" +total_working_hrs+ "hours"  +i+ "days"+salary_per_month);
	}
}
