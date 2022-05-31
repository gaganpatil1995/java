package day6_assng;
import java.util.Scanner ;

public class reverseString {
     public static String reverseStr(String str) {
    	 String[] mainstr = str.split("");
    	 String rev ="";
    	 for(int i=mainstr.length-1;i>=0 ;i--) {
    		String r =rev + mainstr[i];
    		rev = r ;
    	 }
    	 return rev ;
    	 
     }
     public static void main(String[] args) {
//		String[] mai = "mainewal".split("");
    	 Scanner input = new Scanner(System.in);
    	 System.out.println("Enter a String to reverse");
    	 String reve = input.next();
    	String ans = reverseStr(reve);
    	System.out.println(ans);
//		System.out.println(mai.toString());
	}
}
