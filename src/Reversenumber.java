import java.util.Scanner;


public class Reversenumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int n=123, reverse = 0;
		
	   /* System.out.println("Enter the number to reverse and press enter: ");

		Scanner in= new Scanner(System.in); 
		n=in.nextInt()*/;
		
		while(n!=0)
		{
		reverse = reverse * 10;
        reverse = reverse + n%10;
        n = n/10;
		}
        System.out.println("Reverse of entered number is "+ reverse);

	}

}
