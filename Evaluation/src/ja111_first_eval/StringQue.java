package ja111_first_eval;

public class StringQue {
	// Strings are immutable because string can not change, it can be reassign but the character of string is can not be change ;
	// the difference between string and string builder is that string is immutable but string builder is mutable ;
	// string take spaces while reassign but string builder don't take space as it is change in same memory location ;
	public static void main(String[] args) {
		String s1 = "012345678" ;
		String s2 = "abc" ;
		String s3 = "abc" ;
		String s4 = new String("abc" ) ;
		System.out.println(s4);
		System.out.println(s1.charAt(4));
		System.out.println(s1.equals(s2)) ;
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		char[] strArr = s1.toCharArray();
		System.out.println(strArr);
		s1 = s1.replace("8", "10");
		System.out.println(s1);
		System.out.println(s1.split(""));
		String[] s5 = s1.split("") ;
		for(int i=0 ;i<s5.length;i++) {
			System.out.println(s5[i]);
		}
		
	}

}
