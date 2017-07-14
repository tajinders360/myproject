
public class calculator {
	
	
	public int add(int x, int y)
	{
		
		return x+ y;
		
	}
	
	public int sub(int x, int y)
	{
		
		return x-y;
		
	}
	public int mul(int x, int y)
	{
		
		return x*y;
		
	}
	public int div(int x, int y)
	{
		
		return x/y;
		
	}
	
	
	public static void main(String[] args) {
		
	  calculator cal= new calculator();
	  System.out.println(cal.add(10,15));
	  System.out.println(cal.mul(10,15));
	  System.out.println(cal.sub(20,15));
	  System.out.println(cal.div(30,15));

	   
		
	}
	

}
