import java.util.Scanner;

public class SwitchCaseStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# to load data");
		System.out.println("Enter *310# to Check Balance");
		System.out.println("Enter *303# to borrow data");
		
		System.out.print("Enter Code: ");
		String option = input.nextLine();
		
		switch(option){
			case "*131#":
			{
				System.out.println("");
				System.out.println("Enter 1 for 1 Month Plan");
				System.out.println("Enter 2 for 2 Months Plan");
				System.out.println("Enter 3 for 3 Months Plan");
				System.out.println("Enter 4 for 4 Months Plan");
				System.out.println("");
				
				System.out.print("Enter Code: ");
				int code = input.nextInt();
			
				switch(code){
					case 1:
					{
						System.out.println("Your 1 month subscription has been activated");
					}
					break;
					
					case 2:
					{
						System.out.println("Your 2 months subscription has been activated");
					}
					break;
					
					case 3:
					{
						System.out.println("Your 3 months subscription has been activated");
					}
					break;
					
					case 4:
					{
						System.out.println("Your 4 months subscription has been activated");
					}
					break;
					default:
					System.out.println("Invalid Input");
				}
			}
			break;
			
			case "*310#":
			{
				System.out.println("Your balance is N782.97");
			
			}
			break;
			
			case "*303#":
			{
				System.out.println("");
				System.out.println("Enter 1 to borrow 1000");
				System.out.println("Enter 2 to borrow 2500");
				System.out.println("Enter 3 to borrow 4500");
				System.out.println("Enter 4 to borrow 7000");
				System.out.println("");
			
				System.out.print("Enter Code: ");
				int code = input.nextInt();
				
				switch(code){
					case 1:
						{
							System.out.println("Your account has been credited with N1000");
						}
					break;
					
					case 2:
						{
							System.out.println("Your account has been credited with N2500");
						}
					break;
						
					case 3:
						{
							System.out.println("Your account has been credited with N4500");
						}
					break;
						
					case 4:
						{
							System.out.println("Your account has been credited with N7000");
						}
					break;
					
					default:
					System.out.println("Invalid code");
				}
			}
			break;

			default:
			System.out.println("Invalid Input");
		}
		
	}
}