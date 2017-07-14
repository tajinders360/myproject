class test
{
   void methodA(int num)
   {
       System.out.println ("methodA:" + num);
   }
   void methodA(int num1, int num2)
   {
       System.out.println ("methodA:" + num1 + "," + num2);
   }
   double methodA(double num) {
       System.out.println("methodA:" + num);
       return num;
   }
}

public class Sample
{
   public static void main (String args [])
   {
	   test Obj = new test();
       double result;
       Obj.methodA(20);
       Obj.methodA(20,30);
       result = Obj.methodA(5.5);
       System.out.println("Answer is:" + result);
   }
}