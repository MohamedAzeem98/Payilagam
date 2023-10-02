package looping;

public class NestedLoopingDay2 {
	public static void main(String[] args) {
		NestedLoopingDay2 l2=new NestedLoopingDay2();
		l2.day1();
		l2.day2_Break_Statement();     //break;
		l2.day2_Continue_Statement();  //continue
		l2.day2_DoWhile_Statement();   //do while
	}
		
	private void day2_DoWhile_Statement() {
		// TODO Auto-generated method stub
		int yo=1;
		do {
			System.out.print(yo+" ");
			yo++;
		}while(yo<=7);
	
	}
		
	private void day2_Continue_Statement() {
		// TODO Auto-generated method stub
			int von=1;
			while(von<=5) {
				System.out.println(von+" ");
				von++;
				if(von==4) {
					von++;
					continue;
					
				}
				
			}
		
	}
	
	private void day1() {
			int start=1;
		while(start<=100) {
			if(start%3==0 ^ start%5==0) {
				System.out.print(start+" ");
			}
			start++;
		}
			
	}

	private void day2_Break_Statement() {
		// TODO Auto-generated method stub
		int count=1;
		while(count<=10) {
			System.out.print(count+" ");
			if(count==5) {
				break;
			}
			count++;
		}
		
	}

}
