package javaEmp;
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
		for (int i=1;i<working_days;i++)
		{
			double random= Math.floor(Math.random()*10)%2;
			if (is_full_present==random)
			{
				salary=(wage_per_hr*full_day_work_hr);
				salary_per_month=(salary_per_month+salary);
			}
			else if (is_part_present==random)
			{
				salary=(wage_per_hr*part_day_work_hr);
				salary_per_month=(salary_per_month+salary);
			}
		}
		System.out.println("salary per month is"+salary_per_month);
	}
}
