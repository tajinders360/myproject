import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class testing 
{

	/*public static void sort(int[] arr)
	{
      	int temp=0;
		int n =arr.length;
		for(int i=0;i<n;i++)
		{
			for (int j=1;j<n;j++)
			{
				if (arr[j]<arr[j-1])
				{
					temp = arr[j-1];  
					arr[j] = temp;  
				}
			}
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]+"\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int arr[]={2,25,10,9,36,14};
		//{2,25,10,36,9};
		//{2,25,10,9,36};
		//{2,10,25,9,36}
		//{2,10,9,25,36}
		//{2,9,10,25,36}

		System.out.println("Normal Raar\n");

		for (int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);

		}
		System.out.println("Sorted Array :\n");
		sort(arr);

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);	
		}


	}*/

	// default/parameterized constructor
	/*int id;  
		String name; 

		void display()
		{
			System.out.println(id + " " +name);

		}

		testing(int n, String b)
		{
			id=n;
			name=b;

		}


		public static void main(String[] args) {

			//testing t1=new testing();
			//testing t2=new testing();

			//

			testing t1=new testing(4,"test");
			testing t2=new testing(5,"testing");
			t1.display();
			t2.display();

		}

	 */

	/*static int count=0;//will get memory when instance is created  

		testing(){  
		count++;  
		System.out.println(count);  
		}

		public static void main(String args[]){  

			testing c1=new testing();  
			testing c2=new testing();  
			testing c3=new testing();  

		 }  */

	/*void m(){System.out.println("hello m");}  
			void n(){  
			System.out.println("hello n");  
			//m();//same as this.m()  
			m();  
			}  


			public static void main(String args[]){  
			testing a=new testing();  
			a.n();  
			}
	 */


	/*public static int[] sorting()
	{
		int[] l={10,15,2,18,20};
		for(int i=0;i<l.length;i++)
		{
			for (int j=0;j<l.length-1;j++ )
			{				
				if (l[j]<l[j+1]){

					int temp= l[j+1];
					l[j+1]=l[j];
					l[j]=temp;

				}
			}

		}
		return l;
	}


	public static void main(String args[])
	{


		int[] arr =sorting();

		for (int i=0;i<arr.length;i++)

		{
			System.out.println(arr[i]);
		}


	}*/


	public static String getNextDate(String curDate) {
        String nextDate = "";
        try {
            Calendar today = Calendar.getInstance();
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date date = format.parse(curDate);
            today.setTime(date);
            today.add(Calendar.DAY_OF_YEAR, 2);
            nextDate = format.format(today.getTime());
        } catch (Exception e) {
            return nextDate;
        }
        return nextDate;
    }
	

	public static String currentDate()
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
		
	}
	
	public static void main(String args[])
	{
		System.out.println(currentDate());
        System.out.println(getNextDate(currentDate()));
	}
	
	

}  






















