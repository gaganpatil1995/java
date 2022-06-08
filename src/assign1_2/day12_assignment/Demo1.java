package day12_assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo1 {
	public boolean validate(String name,String mobileNum,String aadharCard) {
		if(Pattern.matches("[a-zA-Z]{3,8}", name) && Pattern.matches("[6789]{1}[0-9]{9}", mobileNum) && Pattern.matches("[0-9]{12}", aadharCard)) {
			
			
			return true ;
		}
		else 
			return false ;
	}
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter your Name : ") ;
		String name = input.next();
		System.out.println("Enter Mobile Number") ;
		String number = input.next() ;
		System.out.println("Enter your Adhaar Number") ;
		String addar = input.next();
		
		Demo1 d1 = new Demo1();
		Boolean b = d1.validate(name,number,addar) ;
//		System.out.println(b);
		if(b) {
			Citizen c1 = new Citizen(name,number,addar) ;
			System.out.println("Your name :"+ c1.getName()) ;
			System.out.println("Your Mobile number is : " +c1.getMobileNumber());
			System.out.println("Your Adhaar Number is : "+ c1.getAadharNumber());
		}
		else
			System.out.println("Please Enter valid Information");
		
	}

}

class Citizen{
	private String name ;
	private String aadharNumber ;
	private String mobileNumber ;
	
	public Citizen(String name,String aadharNumber ,String mobileNumber) {
		this.aadharNumber = aadharNumber ;
		this.name = name ;
		this.mobileNumber  = mobileNumber ;
	}
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	
}