public class BookShop2{                              // 'This' keyword concept
	
	String name;
	int price;
	int pages;
	
	BookShop2 (String name ,int  price ,int  pages){
		this.name=name;
		this.price=price;
		this.pages=pages;
	}
	
public static void main(String args[]){      
		
		BookShop2 book1 = new BookShop2("abc",50,200);
		
		BookShop2 book2 = new BookShop2("bcd",100,300);
	
		book1 .display();
		book2.display();


     }
	
	public void display(){
		System.out.println("BookName : "+this.name);
		System.out.println("BookPrice : "+this.price);
		System.out.println("BookPages : "+this.pages);
	}
}