package day7_assingment;
import java.util.Scanner;

public class Demo {

	public static Bank getBank(String bnk) {
	if("axis".equalsIgnoreCase(bnk)) {
//		AxisBank axis = new  AxisBank() ;
//		System.out.println("yes going");
		return new  AxisBank() ; 
	}
	else{
//		ICICIBank icici = new ICICIBank();
		return new ICICIBank() ;
	}
	
}


	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in) ;
	String name = input.next();
//	String bnk = name+"" ;
//	if(name =="axis") {
//		System.out.println("Equal hai");
//	}
//	else {
//		System.out.println("not equal");
//	}
//	System.out.println(name);
	Bank b1 = getBank(name) ;
//	b1.displayDetails();
	if(b1 instanceof AxisBank) {
		AxisBank mybank = (AxisBank)b1;
		mybank.rateOfInterest = 7 ;
		mybank.displayDetails();
	}
	else{
		ICICIBank mybank = (ICICIBank)b1;
		mybank.rateOfInterest = 7 ;
		mybank.displayDetails();
	}
	
	
	if(name=="axis"){
	  AxisBank cre = (AxisBank)b1 ;
	  cre.getCreditCard();
	}
}
}
class Bank{
	String branchName ;
	String ifscCode ;
	void displayDetails() {
		System.out.println("Name of the Branch" + branchName);
		System.out.println("IFSC code " + ifscCode);
		
	}
}

class AxisBank extends Bank{
	double rateOfInterest;
	@Override
	void displayDetails(){
		System.out.println("Name of the Branch Axis Bank Saoner");
		System.out.println("IFSC code axis0041");
		System.out.println("Rate Of Interest is " + rateOfInterest);
		
	}
	void getCreditCard(){
		System.out.println("Get the Credit Card from the Axis bank");
		
	}
}
class ICICIBank extends Bank{
	double rateOfInterest;
	@Override
	void displayDetails(){
		System.out.println("Name of the Branch ICICI Bank Saoner");
		System.out.println("IFSC code icici0041");
		System.out.println("Rate Of Interest is " + rateOfInterest);
		
	}
}