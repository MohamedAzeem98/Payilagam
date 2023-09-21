public class Cafe implements Mess , FoodCourt

{
	
	public static void main(String[]args)
		
	{
		Cafe ca = new Cafe();
		 
		ca.offer();
		ca. refreshmentOffer();
		ca.unlimitedMealOffer();
		ca.saladsOffer();

	}
		
public void offer() {
 System.out.println("offers Beverages,starters,fastfood,continental");
   }
   
public void refreshmentOffer() {
 System.out.println(" For every purchase , take away 250 grams pakora for free");
   }

public void unlimitedMealOffer() { 
System.out.println(" For  every  75.00 INR mealBox , get unlimited meals with starters");
   }

public void saladsOffer(){
System.out.println("Today special is a cup of cherries flown with honey");
   }
  
  }
