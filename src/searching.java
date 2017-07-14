
public class searching {


	/*//linear search or sequential search


	public static int linearsearch(int[] arr, int key)
	{
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;

			}

		}
		return 0;
	}



	public static void main(String[] args) {

		int [] arr1={10,5,15,20};
		int index= 15;

		System.out.println("index of key: " + linearsearch(arr1, index));

	}

	 */

	//bubble sort

	/*	
	public static void bubblesort(int[] arr)

	{
		int temp =0;

		for (int i=0;i<arr.length;i++)
		{
			for (int j=1;j<arr.length;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;	

				}


			}

		}


	}



	public static void main(String[] args) {

		int[] arr={10, 5, 15, 7, 20};

		bubblesort(arr);
		for (int i=0;i<arr.length;i++)
		{

			System.out.println(arr[i]);

		}




	}
	 */

	//recursion finite/factorial
	/*
	 static int count=0;
		static void p(){  

			count++;

			if(count<=5)

		System.out.println("hello " +count);  
		p();  
		}  

		public static void main(String[] args) {  
		//p();
			System.out.println(fac(10));
		}  

		static int fac(int n)
		{
			if(n==1)
				return 1;

			else
				return(n * fac(n-1));
			}
	 */


	//selection sort


	/*public static void selectionsort(int[] arr)
 {
	 for (int i=0;i<arr.length;i++)
		{
		    int index =i;
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{

					index =j;


				}
			}

				int s= arr[index];
				arr[index]=arr[i];
				arr[i]=s;



 }

 }

	public static void main(String[] args) {

		int[] arr={10, 5, 15, 7, 20};

		selectionsort(arr);
		for (int i=0;i<arr.length;i++)
		{

			System.out.println(arr[i]);

		}




	}
	 */


	//reverse a string

	public static void main(String[] args) {

	  String test="I am Tajinder";
	  String test1="";
      
      for(int i=test.length()-1;i>=0;i--)
      {
    	
    	  test1= test1 + test.charAt(i);
    	    
      }
      System.out.println("Print the  string: " + test1);
      
     //Using stringbuilder class 
      StringBuilder sb= new StringBuilder(test);
      System.out.println("Print the reverse string: " + sb.reverse());
      
      
	}
	
	
    
	
	

} 











