public class Condition31{
	public static void main(String args[]){
	
	float person1=5.2f;
		float person2=15.4f;
		float person3=6.2f;
		
		
	if(person1>person2){
		 if(person1>person3){
			System.out.println("person1");
		}
		else if(person3>person1){
			System.out.println("person3");
		}
		
		else{
			System.out.println("person3,person1");
		}
	}
	
		else if(person2>person1){
			if(person2>person3){
				System.out.println("person2");
			}
			else if(person3>person2){
				System.out.println("person3");
			}
			else{
				System.out.println("person3,person2");
			}
			
			}
		
		else if(person1>person3){
			System.out.println("person1");
		}
		else if(person3>person1){
			System.out.println("person3");
		}
		else{
			System.out.println("person1,person3");
		}
	}
}