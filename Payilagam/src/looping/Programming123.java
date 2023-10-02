package looping;

public class Programming123 {      // infinity program
	public static void main(String[] args) {
		int start=1;int count=0;
        while (true) {
            if (start % 3 == 0 && start % 5 == 0) {
                System.out.print(start + " ");
                count++;
            }
            start++;
            if (count == 10) {
                break;
            }
        }
	}

}








