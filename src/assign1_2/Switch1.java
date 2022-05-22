package assign1_2;

public class Switch1 {
	
	public static void main(String[] args) {
//		System.out.println("Name");
		
		String city= "Delhi" ;
		
		
		switch(city) {
		case "Mumbai": 
			System.out.println("Financial city");
		    break;
		case "Kolkata" : 
			System.out.println("City of Joy");
			break;
		case "Delhi" :
			System.out.println("Capital of the country");
			break;
		case "Bangalore" :
			System.out.println("Cyber city");
			break;
		default:
			System.out.println("May be Other City");
			break;
			
		
		}
		
		
	}

}
