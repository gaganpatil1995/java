package day10_assignment;
import java.util.Scanner ;

public class Demo1 {
	
	public Hotel provideFood(int amount) {
		if(amount>1000) {
			TajHotel tajhotel = new TajHotel();
			return tajhotel ;
		}
		else if(amount>200) {
			RoadSideHotel roadHotel = new RoadSideHotel();
			return roadHotel ;
		}
		else {
			return null ;
		}
	}
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		int  inputAmount = input.nextInt();
		System.out.println("Enter Amount customer have");
		Demo1 demo = new Demo1();
		Hotel myHotel = demo.provideFood(inputAmount) ;
//		myHotel.chickenBiryani();
		if(myHotel instanceof TajHotel) {
			TajHotel tajhotel = (TajHotel)myHotel ;
			tajhotel.chickenBiryani();
			tajhotel.masalaDosa();
			tajhotel.WelcomeDrink();
		}
		else {
			myHotel.chickenBiryani();
			myHotel.masalaDosa();
		}
		
	}

}
interface Hotel{
	void chickenBiryani();
	void masalaDosa();
}
class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
	System.out.println("Chicken Biryani from Taj hotel");
	}

	@Override
	public void masalaDosa() {
		System.out.println("Masal dosa from Taj Hotel");
	}
	public void WelcomeDrink() {
		System.out.println("Welcome Drinks from the Taj hotel");
	}
	
}
class RoadSideHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		System.out.println("Chicken biryani from Road Side hotel");
	}

	@Override
	public void masalaDosa() {
	System.out.println("Masala dosa from road side hotel");
		
	}
	
}

