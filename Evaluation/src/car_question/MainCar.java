package car_question;

public class MainCar {
	static void printDetails(Car s1) {
		System.out.println("Car Model :"+s1.model);
		System.out.println("Car company Name :" + s1.companyName);
		System.out.println("Car color :" + s1.color);
		System.out.println("Car RPM :"+s1.engine.rpm);
		System.out.println("Car Power :"+ s1.engine.power);
		System.out.println("Car Engine Manufacture :" + s1.engine.manufacture);
		s1.engine.enableTurbo();
		System.out.println("Car Has Turbo:" + s1.engine.hasTurbo) ;
	}

	public static void main(String[] srgs) {
		
		Car s1 = new Car("harrier","tata","black",new Engine()) ;
//		System.out.println(s1.companyName);
		printDetails(s1) ;
		Car s2 = new Car();
//		printDetails(s2) ;
	}
}
