package emmanuel.com;
import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		Double Test1;
		Double Test2;
		Double Exam;
		Double Average;
			System.out.println("Enter Test1 Marks:");
			 Test1=scr.nextDouble();
			 
			 System.out.println("Enter Test2 Marks:");
			 Test2=scr.nextDouble();
			 
			System.out.println("Enter the Exam Marks:");
			 Exam=scr.nextDouble();
				
			 Average=(Test1+Test2+Exam)/3;
			 
			if(Average<60) {		
					
			 System.out.printf("The Average Marks is:%.0f.This is the Grade E",Average);
			
			}else if(Average<70) {	
				 
				System.out.printf("The Average Marks is:%.0f.This is the Grade D",Average);
				
				
			}else if(Average<80) {	
				 
				System.out.printf("The Average Marks is:%.0f.This is the Grade C",Average);
				
			}else if(Average<90) {	
				 
				System.out.printf("The Average Marks is:%.0f.This is the Grade B",Average);
				
			}else if(Average<=100) {	
				 
				System.out.printf("The Average Marks is:%.0f.This is the Grade A",Average);
				
				
			}else {
		System.out.println("The Average Marks is"+Average+".This Marks is invalid please try again");
	}
}
}
