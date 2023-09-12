package salem;
public class Youngster extends parent{
		public static void main(String args[]){
	

	Youngster yy=new Youngster();
	
	yy.gardening();
	
	yy.fixMarriage();
		
	yy.takeRest();
			
		System.out.println(yy.age);
	
			}
			public void fixMarriage(){                                                    //Method overriding     
				super.fixMarriage();        // calling same method from parent class
			System.out.println("Marriage -- opinion ");
				Youngster.study();          //calling static method in instance method of current class
			
			}
	
			public static void study(){
				System.out.println("studying");
			}
			
			
	}