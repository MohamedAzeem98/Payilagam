package trichy;
public class Pasanga extends AmmaAppa {

	public Pasanga(){
		System.out.println("pasanga - const");
	}
	
	public Pasanga(int no){
		super();
		
		System.out.println("pasanga  -OneArgs- const");
	}
	
public static void main(String args[]){

Pasanga pp=new Pasanga(10);
	
	pp.meetRelatives();

}


}