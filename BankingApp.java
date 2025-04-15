import java.util.Scanner;


public class BankingApp{
    String accountName = "James Williams";
	String accountNumber = "504059995";
	double accountBalance = 595575.48;
	
	public double deposit(int amount){
	    accountBalance += amount;
		
		return accountBalance;
		
	}
	
	public double withdrawal(int amount){
		
		
		if(amount > accountBalance){
			System.out.println("Insufficient funds.");
	    }
	    else{
		    accountBalance -= amount;
	    }
		return accountBalance;
	}
	
	public double checkBalance(){
		return accountBalance;
	}
	
	public static void main(String[] args){
		BankingApp bankApp = new BankingApp();
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Welcome to UBA");
		System.out.println("Enter 1 To Deposit");
		System.out.println("Enter 2 To Withdraw");
		System.out.println("Enter 3 To Check Balance");
		System.out.println();
				
		System.out.println("Enter your choice; ");
		int choice = input.nextInt();
		System.out.println();
				
		switch(choice){
			case 1:
			{
				System.out.print("Enter the amount to deposit: ");
				int depositAmount = input.nextInt();
				
				System.out.println("==============================");
				
				
			    System.out.println("Account Name: "  +bankApp.accountName);
				System.out.println("Account Number: " +bankApp.accountNumber);
			    System.out.println("Initial Balance: %c.2%f%n",'$',bankApp.accountBalance);	
				
				bankApp.deposit(depositAmount);
				System.out.printf("Your balance is %c.2%f%n",'$',bankApp.checkBalance());
				System.out.println("================================");
			}		
		    break;
		   
		   
		    case 2:
		    {
				System.out.print("Enter the amount to withdraw: ");
				int withdrawalAmount = input.nextInt();
				
				
				System.out.println("===============================");
				
				
			    System.out.println("Account Name: " +bankApp.accountName);
				System.out.println("Account Number: p " +bankApp.accountNumber);
			    System.out.println("Initial Balance: %c%.2f%n" ,'$',bankApp.accountBalance);	
				
				bankApp.withdraw(withdrawalAmount);
				System.out.printf("Your balance is %c%.2f%n", '$',bankApp.checkBalance());
				System.out.println("=================================");
		    }
		    break;
			
			case 3:
			{
				System.out.printf("Your balance is %c%.2f%n", '$',bankApp.checkBalance());
			}
			break;
			
			
			default:
			System.out.println("Invalid option"); 
		}
	}	
}

