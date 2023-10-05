package LearnArray;
public class ArrayDemo2 {
	public static void main(String[] args) {
		int marks[]= {67,82,75,91,33,27};
		
		int sum=0;int avg=0;
	for(int i=0;i<marks.length;i++) {
		
		sum=sum+marks[i];              //Task 1
		avg=sum/marks.length;          //Task 2
	  }
	System.out.print("Total Marks : "+sum+" ");
	System.out.println("\nAverage of the marks : "+avg);
	ArrayDemo2.check_Progress(marks);  //Task 3
		}
	
	public  static void check_Progress(int marks[]) {
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<=35) {
				System.out.println(marks[i]+" => Fail");
			}else {
				System.out.println(marks[i]+" => Pass");
			}
		}
	}
}




