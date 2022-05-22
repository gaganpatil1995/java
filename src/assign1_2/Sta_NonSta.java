package assign1_2;

public class Sta_NonSta {
	
	int g = 442 ;
	 void mth() {
		 
	 }
	 static int p = 434; 

	 public static void main(String[] args) {
		System.out.println(p) ;
		
		Sta_NonSta l1 = new Sta_NonSta() ; 
		
		l1.g = 4 ; 
		System.out.println(l1.g);
	}
}

/*in above example you can see the variable having static before it is static (p ,main())and other are non static(g,mth) 
 * static member is directly store in the RAM of computer but non static store in hard disk (secoundary memory)
 * inside static method if we want to use a static variable we can use them directly but if we want to use nonstatic variable we have to create a object 
 *  
 */
 