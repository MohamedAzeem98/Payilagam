public class Calculator {
		
		static  void add(int a,int b){
		int result=a+b;
		System.out.println("Add  =  "+result);
		}
	
		static  void sub(int a,int b){
		int result=a-b;
		System.out.println("Sub =  "+result);
		}
	
		static  void multiply(int a,int b){
		int result=a*b;
		System.out.println("Multiply  =  "+result);
		}
	
		static  void divide(int a,int b){
		int result=a%b;
		System.out.println("Divide  =  "+result);
		}
		
		public static void main(String args[]){
		
		  add(7,8);
		  sub(16,2);
		  multiply(4,5);
		  divide(22,2);
		   
		   }
	}