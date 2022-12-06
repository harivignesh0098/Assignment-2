package assignment2;

public class Fibonacci 
{
   public static void main(String[] args)
   {
	   int a=0;
	   int b=1;
	   int c=a+b;
	   int num = 8;
	   for(int i=0;i<num;i++)
	   {
		   System.out.println(a);
		   a=b;
		   b=c;
		   c=a+b;
	   }
	  
   }
}
