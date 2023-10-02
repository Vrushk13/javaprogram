package Javaprograms;

public class Primeno {

	public static void main(String[] args) {
           //wap for prime no
		//divisible by itself
		
		int num=4,temp=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
			if(temp>0) {
				System.out.println("not prime");
			}
			else {
				System.out.println("prime");
			}
		
	
		
		
	}
}
