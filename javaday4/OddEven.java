package javaday4;

public class OddEven {
  
	void Odd(int n) {
		if(n<0) {
			System.out.println("Error");
		}
		
	   else if(n%2==0) {
          int i = n ;
          int a = n ;
    while(i>10) {
    	 a = i-10 ;
    	  i = a ;
    }
			int ans = n - i +10 ;
			System.out.println(ans);
		}
		else if(n%2!=0) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		OddEven n1 = new OddEven(); 
		n1.Odd(88);
		n1.Odd(67);
		n1.Odd(-567);
	}
}
