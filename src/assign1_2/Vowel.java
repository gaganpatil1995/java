package assign1_2;

public class Vowel {
	String ch = "a" ;
//	String co = "f" ;
//	String er = "#" ;
	
	void check() {
		if(ch=="a" ||ch=="e" ||ch=="i" ||ch=="o" ||ch=="u") {
			System.out.println("Vowel");
		}
		else if(ch=="b" ||ch=="c" ||ch=="d" ||ch=="f" ||ch=="g" ||ch=="h" 
				||ch=="j" ||ch=="k" ||ch=="l" ||ch=="m"||ch=="n" ||ch=="p" ||ch=="q" 
				||ch=="r" ||ch=="s" ||ch=="t"||ch=="v"||ch=="w" ||ch=="x" ||ch=="y" ||ch=="z") {
			System.out.println("Consonant");
		}
		else {
			System.out.println("invalid");
		}
		
	}
	
	
 public static void main(String[]args) {
	 Vowel a1 = new Vowel();
//	 System.out.println(a1.ch);
	 a1.check();
	 a1.ch="r" ;
	 a1.check();
	 a1.ch = "$" ;
	 a1.check();
 }
}
