public class Beta extends Dada {     //Dynamic binding-child class
	public static void main(String args[]){
	
	//	final int amount=78787878;
	Dada obj=new Beta();
//	Dada obj=new Dada();
		obj.bankBalance();
		obj.profession();
	
   }
	
	public void bankBalance(){
	
		System.out.println(amount);
	
	}
	
	public void profession(){
		System.out.println("Police ");
	}
}