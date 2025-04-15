public class MethodOverloading{
	public static void main(String[] args){
		MethodOverloading.greeting();
		MethodOverloading.greeting("Jack");
	}
	
	public static void greeting(){
		System.out.println("Good Afternoon,Everyone");
	}
		
	public static void greeting(String name){
		System.out.printf("Good Afternoon,%s%n",name);
	}
		
	public static void greeting(String name ,int age){
		System.out.printf("Good Afternoon,%s your are %d years old ");
	}
		
	public static void greeting(String name, int age, String gender){
		System.out.printf("Good Afternoon,%s,ypour are %d years old and you are a %s",name,age,gender);
	}
}