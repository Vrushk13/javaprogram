package Javaprograms;

public class palindrome_no {

	public static void main(String[] args) {
          //to find the palindrome NITIN=NITIN
		
		String s ="Nitin";
		   String rev="";
		   int len = s.length();
		   System.out.println(len);
		   for(int i=len-1;i>=0;i--) {
			   rev=rev+s.charAt(i);
		   }
		   if(rev.equalsIgnoreCase(s)) {
			   System.out.println("string is palindrome");
		   }
		   else {
			   System.out.println("string is not palindrome");
		   }
	}

}


