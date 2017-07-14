
public class Plaindrome {


	public static void main(String[] args) {

		//plaindrome number
		int r=0,sum=0;
		int n=221;
     	int temp= n;
		while(n!=0)
		{
			r= n%10;
			sum= (sum*10) + r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is plaindrome");
		}
		else
		{
			System.out.println("Number is not plaindrome");
		}

		// plaindrome string
		
		String st="ttatt";
		boolean result =false;
		int com=st.length()-1;

		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==st.charAt(com))
			{
				result=true;
			}
			else
			{
				result=false;
			}
			com--;
		}
		if(result)
		{
			System.out.println("STRING IS PALINDROME");
		}
		else
		{
			System.out.println("STRING IS NOT PALINDROME");
		}
	}





}




