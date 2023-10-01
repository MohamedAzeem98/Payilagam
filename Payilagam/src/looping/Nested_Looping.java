package looping;

public class Nested_Looping {
	public static void main(String[] args) {
		int row=0;
		while(row<5) {
			int col=5;
			while(col>=1) {
				System.out.print(col+" ");
			col--;
			}
			System.out.println();
			row++;
		}
	}

}


