
public class findnumber {


	public static void main(String[] args) {

		int number[]= {9,1,3,5,6,8,15,16,22};

		int smallnumber=number[0];
		int largenumber= number[0];

		for (int i=0;i<number.length;i++)
		{
				if(smallnumber>number[i])
				{
					smallnumber=number[i];

				}
				else if(largenumber<number[i])

				{
					largenumber=number[i];
					
				}

			
		}
		System.out.println("Smallest number : " + smallnumber);	
		System.out.println("Largest number : " + largenumber);



	}

}
