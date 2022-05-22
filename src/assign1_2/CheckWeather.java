package assign1_2;

public class CheckWeather {

	public static void main(String[] args) {
		boolean isSnowing = true ;
		boolean isRaining = false ;
		double temperature = 60.0 ;
		
		if((isSnowing==true && isRaining ==true)|| temperature<50.0) {
			System.out.println("Let's stay home.");
		}
		else {
			System.out.println("Let's go out!");
		}
	}
	
}
