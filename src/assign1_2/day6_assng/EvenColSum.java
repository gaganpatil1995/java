package day6_assng;
import java.util.Scanner ;


public class EvenColSum {
	
	public static void evenSum(int[][] ar) {
		
	
		for(int i=0 ;i<ar.length ;i++) {
			int ans =0 ;
			int var =0 ;
			for(int j=0 ;j<ar.length;j++) {
				if(ar[j][i]%2==0) {
//					System.out.println(ar[j][i]);
					ans = var +ar[j][i] ;
					var = ans ;
				}
			}
			System.out.println(var);
		}
//		return 0 ;
		
		
	}

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in) ;
//		Scanner.nextLine();
//		int[][] arr = new int[3][3];
//		System.out.println("Enter number");
//		String num = input.nextLine();
//		System.out.println(num);
		
//		String[] r1 = num.split(" ");
//		arr[0][0]=Integer.valueOf(r1[0]) ;
//		System.out.println(arr[0][0]);
//		System.out.println(typeOf(r1[0]));
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}} ;
		
		evenSum(arr);
		
		
		
		
		
	}
}
