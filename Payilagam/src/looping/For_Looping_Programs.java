package looping;

public class For_Looping_Programs {
	public static void main(String[] args) {
		
		For_Looping_Programs fl=new For_Looping_Programs();
		
		fl.numberPattern1();
		fl.numberPattern2();
		fl.numberPattern3();
		fl.divisible_Infinity_Pattern();              //infinity
		fl.Break_Statement_Program();                 //break
		fl.Continue_Statement_Program();              //continue
	}

	private void Continue_Statement_Program() {               // 1 2 3 4 5 6 8 9 10 --->output
		
		for(int t=1;t<=10;t++) {
			
			if(t==7) {
				continue;
			}
			
			System.out.print(t+" ");
		}
	}
		
		
	private void Break_Statement_Program() {                   //  1 2 3 4 5 6 7 8 9 10 11 12 --->output
		
		for(int zo=1;zo<=15;zo++) {
			System.out.print(zo+" ");
			if(zo==12) {
				break;
			}
		}
		
	}

	private void divisible_Infinity_Pattern() {                //infinity times
      int i = 1;int count=0;
		for( ;true;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
				count++;
			}if(count==15) {
				break;
			}
		}
		
		
	}

	private void numberPattern3() {                   // 15 30 45 ----> output
		
		for(int no=1;no<=50;no++) {
			if(no%3==0 && no%5==0) {
				System.out.print(no+" ");
			}
			
		}
	}

	private void numberPattern2() {                 //  5 4 3 2 1   ---> output
													//	5 4 3 2 1	
													//	5 4 3 2 1
		for(int i=1;i<=5;i++) {						//	5 4 3 2 1	
			for(int j=5;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			
			
		}
		
		
		
		
	}

	private void numberPattern1() {                     //  1 1 1 1 1 ---> output
		int no=6;
		
		for(int i=1;i<6;i++) {
			System.out.print(1+" ");
		}
	}

}
