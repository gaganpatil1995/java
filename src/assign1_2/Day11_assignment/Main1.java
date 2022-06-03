package Day11_assignment;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		String model  = input.next();
		Mobile mobModel = new Mobile();
		mobModel.searchOutdatedModel(model);
	}

}

class Mobile{
	String[] outdatedModels = {"Iphone5s","Iphone6s","Iphone7s","Samsungnote4","Samsungnote5"};

	void searchOutdatedModel(String model) {
		for(String mo :outdatedModels) {
			if(mo.equalsIgnoreCase(model)) {
				System.out.println(mo+"_OUTDATED");
			}
		}
	}
	
}