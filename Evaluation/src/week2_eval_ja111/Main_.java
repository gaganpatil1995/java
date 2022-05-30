package week2_eval_ja111;
import java.util.Scanner ;

public class Main_ {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter Number of Passenger");
		int numOfP = input.nextInt();
		System.out.println("Enter Number of Kms");
		int numOfK = input.nextInt();
		OLA s1 = new OLA() ;
		
		Car mycar = s1.bookCar(numOfP,numOfK); 
//		System.out.println(mycar.numberOfPassenger);
		
		
		
		if(numOfP <=3) {
		  HatchBack ride = new   HatchBack() ; 
		  int res = ride.farePerKm * numOfK;
		  System.out.println("Total Fare amount is " + res);
		  return ;
		}
		
		Sedan ride = new Sedan() ;
			
		
		
		int res = ride.farePerKm * numOfK;
//		int a = mycar.farePerKm ;
//		System.out.println(hatch.farePerKm);
//		int res = numOfK *a  ;
		System.out.println("Total Fare amount is " + res);
	}

}

class Car {
	int numberOfPassenger ;
	int numberOfKms ;
	
}
class Sedan extends Car{
  final int farePerKm = 20 ;
	
}
class HatchBack extends Car {
	 final int farePerKm = 15 ;
}
class OLA {
	public Car bookCar(int numberOfPassenger, int numberOfKms) {
		if(numberOfPassenger<=3) {
			HatchBack hat = new HatchBack();
			
			System.out.println(hat.farePerKm);
			
			return hat ;
		}
		
			Sedan hat = new Sedan() ;
			return hat ;
		
	}
//	int calculateBill(Car c1 ,int numOfK) {
//		int res = c1.farePerKm * numOfK ;
//	}
}