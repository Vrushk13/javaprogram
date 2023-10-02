package Javaprograms;

public class largeno {

	public static void main(String[] args) {
         //wap for large no
		int arr[]= {1,3,4,5,7,8,9};
		int max=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			
		}
		System.out.println(max);
	}

}
