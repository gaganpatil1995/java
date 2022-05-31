package day6_assng;

public class PrimeNumber {
	public static int[] findAndPrime(int[] arr) {
		int mainco = 0 ;
		int[] ansarr = new int[3] ;
		for(int i=0 ;i<arr.length ;i++) {
			int coun = 0 ;
			
			if(arr[i]>0) {
				for(int j=1 ;j<arr[i] ;j++) {
					if(arr[i]%j==0) {
						coun++ ;
						
					}
				}
				if(coun<3) {
					System.out.println(arr[i]);
					mainco++ ;
					for(int p=0 ;p<3 ;p++) {
						ansarr[p] = arr[i] ;
					}
				}
				
				
			}
		   
		}
//		System.out.println(mainco);
		if(mainco==0) {
			System.out.println("Prime Number not fount in the supplied Array");
		}
		return ansarr;
	}
	
	public static void main(String[] arg) {
		
		int[] arr = {10,12,5,50,11,14,15} ;
		findAndPrime(arr) ;
		
	}

}
