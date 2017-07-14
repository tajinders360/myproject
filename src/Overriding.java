class MyBaseClass{
	 void disp()
   {
       System.out.println("Parent class method");
   }
}
class Overriding extends MyBaseClass{
	 void disp(){
      System.out.println("Child class method");
   }
   public static void main( String args[]) {
	   MyBaseClass obj = new MyBaseClass();
	   MyBaseClass obj1 = new Overriding();

       obj.disp();
       obj1.disp();
   }
}