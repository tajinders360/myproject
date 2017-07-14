

public class Armstrongnumber {


	public static void main(String[] args) {

		int n=370;
		int m=0;
        int temp=n;
		while(n!=0)
		{
			int s= n%10;
			m = m + s*s*s;
			n =n/10;
				
		}
		
		if(temp==m){
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not an armstrong");
		}

	}

}