import java.util.scanner;

public class Number{
    public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
		
		int negative= 0;
		int positive = 0;
	    int zero;
	
	for(int i = 1; i <= 10;i++){
		     System.out.printf("Enter an interger");
			 int num = scan.nextInt();
			 
			 if(num > 0){
				 positive++;
			 }
			 else if (num < 0){
				 negative++
	         }
			 else{
	 	 zero++;
		}
	   
	}	
    System.out.printf("The number of positive interger is %d%n",positive);
    System.out.printf("The number of positive interger is %d%n",negative);
    System.out.printf("The number of positive interger is %d%n",zero);
}