package helloWorld;

public class HelloWorld {

	
	public static void main(String[] args) {
		
		String methodName = "Main Method 1"; // instance variable
		
		System.out.println("Method Name "+ methodName);

		Object obj = new  Object();
		obj.myMethod();
		
		Dog dog = new Dog();
		
		System.out.println("DOG Color : " + dog.getColor());
		System.out.println("DOG Name : "+ dog.getName());
		
		dog.setName("ALPHA");
		dog.setColor("Black");
		
		System.out.println("DOG Color : " +dog.getColor());
		System.out.println("DOG Name : "+ dog.getName());
		
		System.out.println("First program for vipun");
		
		methodExample();
		
	}
	
	public static void methodExample() {
		System.out.println("method  called");
	
		
	}

}
