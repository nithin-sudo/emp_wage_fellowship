package javaEmp;
public class HelloEmp {
	public static void main(String[] args){
		int is_full_present=1;
		double random=Math.floor(Math.random()*10)%2;
		System.out.println("random value is:"+random);
		if (random==is_full_present) 
		{
			System.out.println("employee is present");
		}
		else
		{
			System.out.println("employee is absent");			
		}
	}
}
