import java.util.Scanner;

public class MathClassMethods{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in){
			
        System.out.print("Enter number: ");
		double num = scan.nextDouble();
		
		System.out.printf("The absolute value is %f%n",Math.abs(num));
		
		System.out.printf("The rounded value is %d%n",Math.abs(Math.round(num)));
		
	    System.out.printf("The absolute value is %f%n",Math.pow(num,2));
	}
}	