package javaEmp;
public class HelloEmp {
	public static void main(String[] args){
		int is_full_present=1;
		int wage_per_hr=20;
		int full_day_work_hr=8;
		int salary;
		double random=Math.floor(Math.random()*10)%2;
		System.out.println("random value is:"+random);
		if (random==is_full_present) 
		{
			System.out.println("employee is present");
			salary=(wage_per_hr*full_day_work_hr);
			System.out.println(salary);
		}
		else
		{
			System.out.println("when employee is absent for the day his salary is zero");		
			System.out.println("employee is absent");			
		}
	}
}
