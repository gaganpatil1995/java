package car_question;

public class Car {
	String model = "Tuv300" ;
	String companyName = "Mahindra" ;
	String color = "White" ;
	Engine engine = new Engine();
	Car(){
		
	}
	Car(String model,String company,String color , Engine engine){
		this.model = model ;
		this.companyName = company ;
		this.color = color ;
		this.engine = engine ;
	}
	public static void main(String[] srgs) {
	   
	 Car s1 = new Car("harrier","tata","black",new Engine()) ;
	 System.out.println(s1.color);
	}
	

}
