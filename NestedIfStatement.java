import java.util.Scanner;

public class NestedIfElse{
	public static void main (string[] args) {
		Scanner input = new scanner (System.in);
		
		system.out.print(Enter name: ");
		string name = input.nextLine();
		
		system.out.print("Enter mark: ");
		int mark = input.nextLine();
		
		if(mark >= 80){
		    System.out.printf("Your name is %s%n",name);
	        System.out.printf("Your name is %d%n",marks);
		    System.out.printf("Your name is %c%n",'A');
	    }
		else if(mark >= 70){
		      System.out.printf("Your name is %s%n",name);
			  System.out.printf("Your name is %d%n",marks);
			  System.out.printf("Your name is %c%n",'B');
	    }	  
	    else if(mark >= 60){
		       System.out.printf("Your name is %s%n",name);
			   System.out.printf("Your name is %d%n",marks);
			   System.out.printf("Your name is %c%n",'C');
		}
	    else if(mark >=50){
		       System.out.printf("Your name is %s%n",name);
			   System.out.printf("Your name is %d%n",marks);
			   System.out.printf("Your name is %c%n",'D');
		}
	    else if(mark >=40){
		       System.out.printf("Your name is %s%n",name);
			   System.out.printf("Your name is %d%n",marks);
			   System.out.printf("Your name is %c%n",'E');
		}
	    else if(mark < 40){
		       System.out.printf("Your name is %s%n",name);
			   System.out.printf("Your name is %d%n",marks);
			   System.out.printf("Your name is %c%n",'F');
		}
	}
}