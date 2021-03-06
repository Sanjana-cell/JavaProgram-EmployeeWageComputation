/**
 * @author Sanjana K R 
 * Created on: 18-Jul-2020
 * Compilation Command: javac -d path_of_package EmpWageComputation.java
 * Execution Command: java package_name EmpWageComputation
 */
public class EmpWageComputation {
	
	final static int WAGE_PER_HOUR=20; //Assigned wage per hour as 20
	final static int FULL_TIME=2; //Assigned full time with 2
	final static int PART_TIME=1; //Assigned part time with 1
	final static int MAX_WORKING_DAYS=20; //Assigned maximum working days in month with 20
	final static int MAX_WORKING_HOURS=100; //Assigned maximum working hours in month with 100
	static int dailyWage=0;	 //Stores dailyWage of employee
	static int workHours=0;  //Stores work hour of employee
	static int totalWorkingDays=1; //Stores total working days of an employee in month
	static int totalWages=0; //Stores total wages in a month
	static int totalWorkingHrs=0; //Stores total working hours of an employee in month
	
	//Computes DailWage of an Employee
	public static int ComputeWage(int hours) {
				return hours*WAGE_PER_HOUR;
	} 
	
	public static void main(String[] args) {
		int attendence; //Stores value of employee attendance 
		
		
		//Continues till totalWorkings days reached maximum working days
		while(totalWorkingDays<=MAX_WORKING_DAYS || totalWorkingHrs<=MAX_WORKING_DAYS) {
			attendence=(int)(Math.random()*3); // Generates 0 or 1 using random() and stores the value
			
			/*Checks if Employee is working full time,part time or absent and store work hours and calculate daily wage of employee
		  		according to work time*/
			switch(attendence) {
			case FULL_TIME: System.out.println("Employee is Present Full Time");
						workHours=8;
						break;
						
			case PART_TIME: System.out.println("Employee is Present Part Time");
						workHours=4;
						break;
						
			default:	System.out.println("Employee is Absent");
		
			}
			dailyWage=ComputeWage(workHours); //Calculates daily wages
			totalWorkingHrs+=workHours; //Increments by workHours
			System.out.println("Daily Wage of an Employee on Day "+totalWorkingDays+" is "+dailyWage);
			totalWorkingDays++;
		}
		
		totalWages=ComputeWage(totalWorkingHrs); //Calculates total wages in month
		System.out.println("Total Wages in a month = "+totalWages);

	}

}
