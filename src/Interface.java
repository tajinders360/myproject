
 interface Interface1 {

	   public int mymethod(int num1, int num2);
	}
	public class Interface implements Interface1{

	    public int mymethod(int num1, int num2){
	           int op= num1+num2;
	           return op;
	    }
	    public static void main(String args[])
	    {
	    	Interface obj= new Interface();
	        System.out.println(obj.mymethod(2, 3));
	}
}