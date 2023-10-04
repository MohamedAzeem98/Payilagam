package Java_8_Features;
@FunctionalInterface
public interface Functional_Interface_Demo {
	public abstract void add(int a,int b); 
	default void divide() {
		System.out.println("Hi I am default method");
	}
	
	static void mult() {
		System.out.println("Hi Iam static method");
	}

}



//public abstract void add();

 
	//public abstract int add(int a,int b);