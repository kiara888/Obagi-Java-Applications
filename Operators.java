public class Operators{
	 public static void main (String[] args ) {
	     //Assignment Operator(=)public class Operators{

		 
		 
		 int num1 = 13;
		 int num2 =5;
		 
		 //Arithmetiv Operator(+,*,-,/,%)
		 int sum = num1 + num2;
		 
		 int product = num1 * num2;
		 
		 int difference = num1 - num2;
		  
		 double quotient = (double) num1 / num2;
		 
		 int modulos = num1 % num2;
		 
		 //Relational Operators(>,<,>=,<=,==,!=)
		 boolean isLessThan = num1 < num2;
		 boolean isGreaterThan = num1 > num2;
		 boolean isLessThanorfEqualsTo = num1 <= num2;
		 boolean isGreaterThanorEqualsTo = num1 >= num2;
		 boolean isEqualTo = num1 == num2;
		 boolean isNotEqualTo = num1 != num2;
		 
		 //logical Operation(&&,||,!)
		 boolean isAndOperator = num1 > num2 && num1 >= num2;
		 boolean isOrOperator = num1 == num2 || num1 >= num2;
		 boolean isOrOperator = !(num1 == num2 || num1 >= num2); 
		 
		 System.out.printf("The sum of the numbers is : %d%n", sum);
		 System.out.printf("The product of the numbers is : %d%n", product);
		 System.out.printf("The difference between %d and percentage %d is: %d%n",num1,num2,difference);
		 System.out.printf("The quetient of num1 ans num 2 is %f%n",quotient);
	     System.out.printf("The remainder between num1 and num2 is: %d%n",modulos);
	     System.out.println("========================================================");
		 
		 
		 System.out.printf("Is %d < %d? %b%n",num1,num2,isLessThan);
	     System.out.printf("Is %d > %d? %b%n", num1,num2,isGreaterThan);
		 System.out.printf("Is %d <= %d? %b%n", num1,num2,isLessThanorfEqualsTo);     
		 System.out.printf("Is %d >= %d? %b%n", num1,num2,isGreaterThanorEqualsTo);
		 System.out.printf("Is %d == %d? %b%n", num1,num2,isEqualTo);     
		 System.out.printf("Is %d != %d? %b%n", num1,num2,isNotEqualTo);
		 System.out.println("========================================================");
		 
		 System.out.printf("is %d > %d && %d >= %d? %b%n",num1,num2,num1,num2,isAndOperator);
		 System.out.printf("is %d == %d || %d >= %d? %b%n",num1,num2,num1,num2,isAndOperator);
		  System.out.printf("is %d == %d || %d >= %d)? %b%n",num1,num2,num1,num2,isNotOperator);
    }  
}