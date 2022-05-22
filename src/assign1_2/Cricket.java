package assign1_2;

public class Cricket {
  static void total(int ones,int twos,int threes,int fours,int sixes) {
	  int total1 = ones*1 + twos*2 + threes*3 + fours*4 + sixes*6 ;
	  System.out.println(total1);
  }
	public static void main(String[] args) {
	  
		total(9,3,2,4,3);
	}
}
