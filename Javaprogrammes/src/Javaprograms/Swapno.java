package Javaprograms;

public class Swapno {

	public static void main(String[] args) {

       int a=10 , b=20,c,temp=0;
       temp=a;  
       a=b;
       b=temp;
       System.out.println("swapping the numbers:"+a+" "+b);
       
       
       //without using third variable
       
       int x=10 , y=20;
       
       x=x+y;
       y=x-y;
       x=x-y;
       System.out.println("swapping the number:"+x+" "+y);
       
       
	}

}
