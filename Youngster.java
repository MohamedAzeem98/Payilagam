package salem;
public class Youngster extends parent {
	public static void main (String args[]){
	
		Youngster yy =new Youngster();
		yy.study();
		yy.gardening();
		yy.fixMarriage();
		parent pp=new parent();      // for a referencing , I create a method from parent classs
		pp.fixMarriage();
		}
	
	public void study(){
		System.out.println("studying");
	}
	public void fixMarriage(){
		System.out.println("marriage - opinion");
	}
	
}