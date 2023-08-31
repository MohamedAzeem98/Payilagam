public class Shop {
	
	String name;
	int price;
	
public static void main(String args[]){
	
		int no=40;            //it should be initialized with value
		
	Shop s1=new Shop();
	
		s1.name="abc";
		s1.price=20;
	
	Shop s2=new Shop();
	
		s2.name="bcd";
		s2.price=200;
	
	Shop s3=new Shop();
	
		s3.name="cde";
		s3.price=2000;
		
		System.out.println(s1.name + " "+s1.price);
		System.out.println(s2.name+" "+s2.price);
		System.out.println(s3.name+" "+s3.price);
		System.out.println(no);
	
		s1.buy();          //method call
		s1.sell();
	
	}
	
	public void buy(){                                                                                 //method definition
		System.out.println("Buying the products");
	}
	
	public void sell(){
		System.out.println("Selling the  products");
	}
	
	
	
}