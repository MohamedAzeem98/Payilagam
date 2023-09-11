public class ConstructorDemo {
	
          public static void main(String args[]){
	
		      ConstructorDemo cd=new ConstructorDemo();
			  ConstructorDemo cd2=new ConstructorDemo("Abc");
			  ConstructorDemo cd3=new ConstructorDemo(56.5f);
			  ConstructorDemo cd4=new ConstructorDemo(45.3f,63);
     	}
	
public ConstructorDemo(){                 //Default Constructor 
   
	    System.out.println("Default constructor ");
	 }
	
public ConstructorDemo(String a){         // parameterized Constructor
	
	  System.out.println(" 1 String  Argument Constructor");
	 
	  System.out.println(a);

}
	
public ConstructorDemo(float de){                                                   
	
	System.out.println(" 1 Float Argument Constructor");
	System.out.println(de);
}
	
	public ConstructorDemo(float re,int b){
	
	System.out.println("2 Argument with float & int data-Type Constructor");
	System.out.println("FLOAT VALUE : "+re+"   "+"INT VALUE : "+b);
}
	
	
}



