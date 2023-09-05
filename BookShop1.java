public class BookShop1 {
	
	String name;
	int price;
	int pages;
	
	BookShop1 (String a,int b,int c){
		name=a;
		price=b;
		pages=c;
	}
	
public static void main(String args[]){      
		
		BookShop1 book1 = new BookShop1("abc",50,200);
		
		BookShop1 book2 = new BookShop1("bcd",100,300);
	
		book1 .display();
		book2.display();


     }
	
	public void display(){
		System.out.println("BookName : "+name);
		System.out.println("BookPrice : "+price);
		System.out.println("BookPages : "+pages);
	}
}