
public class Primenumber {

	
	public static void main(String[] args) {
	
		
		for (int i=2;i<=100;i++)
		{
			boolean prime=true;
			
	   //  for (int j=2;j<i;j++)
				
			for(int j=i/2;j>1;j--)	
			{
				
				if(i%j==0)
				{
					
					prime= false;
					break;
					
				}
				
				System.out.println( i + " " + j + " " );
				
			}
			
			if(prime)
				
			{
				
				//System.out.print(i + " " );
			}
			
		}
		
		

	}

}
