package week3_eval_ja111;
import java.util.Scanner ;
import java.util.* ;

public class ExceptionHand {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of Elements");
		int num = input.nextInt();
		
		int[] arr = new int[num] ;
		System.out.println("Enter elements");
		for(int i=0;i<num;i++) {
		   
           int ele = input.nextInt();
           arr[i] = ele ;
		}
		try {
			System.out.println("Enter index of arr you want to access");
			int accInd = input.nextInt();
			System.out.println("array element at index "+accInd+" is "+arr[accInd]);
			System.out.println("The array Element successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException ind) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch (InputMismatchException le) {
			System.out.println("java.lang.NumberFormatException");
		}
		catch(NumberFormatException nfe) {
			System.out.println("java.lang.NumberFormatException");
		}
//		catch (Exception e) {
//		System.out.println(e);
//		}

	}
}
