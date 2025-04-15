import java.util.Scanner;

public class MathsClassMethod{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in){
			
		System.out.printf("Enter number: ");
		double num = scan.nextDouble();
		
		System.out.printf("The absolute value is %f%n",Math.abs(num));
	}
}