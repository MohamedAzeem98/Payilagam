public class  Bmw  extends Car {                          //abstract class
	public static void main(String args[]){
	
	Bmw t1=new Bmw();
	
	t1.show();
	
	t1.mechanism();
	
	t1.axleDesign();
	
	}
	
	public void mechanism(){
		System.out.println("GearBox rage mechanism");
	}
	
	public void axleDesign(){
		System.out.println("Six axle wheel base designing");
	}
	
}