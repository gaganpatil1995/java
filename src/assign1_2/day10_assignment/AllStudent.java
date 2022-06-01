package day10_assignment;
import java.util.Scanner ;


public class AllStudent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student Name :-");
		String name = input.nextLine();
		System.out.println("Enter Student Address :-");
		String address = input.nextLine() ;
		System.out.println("Enter Branch name:-");
		String branch = input.next() ;
		
		if(branch.equalsIgnoreCase("science")) {
			System.out.println("Enter Physics Marks :-");
			double ph = input.nextDouble();
			System.out.println("Enter Chemistry Marks:-");
			double ch = input.nextDouble();
			System.out.println("Enter Maths Marks:-");
			double mh = input.nextDouble();
		
//		HistoryStudent historyStudent = new HistoryStudent(ph,ch,mh,name,address);
		ScienceStudent scienceStudent = new ScienceStudent(ph,ch,mh,name,address);
		double percent = scienceStudent.getPercentage();
		System.out.println("Percentage of Science Student "+name+" "+" is "+percent+"%");
		
		}
		else if(branch.equalsIgnoreCase("history")) {
			System.out.println("Enter History Marks :-");
			double ph = input.nextDouble();
			System.out.println("Enter Civis Marks:-");
			double ch = input.nextDouble();
		;
		
		HistoryStudent historyStudent = new HistoryStudent(ph,ch,name,address);
	
		double percent = historyStudent.getPercentage();
		System.out.println("Percentage of History Student "+name+" "+" is "+percent+"%");
		}
	}
}
abstract class Student{
	String name ;
	String address ;
	abstract double getPercentage();
	Student(String name ,String address){
		this.name =name;
		this.address = address ;
	}
}
class ScienceStudent extends Student{
	double physicsMarks;
	double chemistryMarks;
	double mathsMarks;
	@Override
	double getPercentage() {
		double percentage = ((physicsMarks +chemistryMarks+mathsMarks)/300 ) *100;
		return percentage ;
	}
	ScienceStudent(double physicsMarks,double chemistryMarks,double mathsMarks,String name,String address){
		super(name,address);
		this.physicsMarks = physicsMarks ;
		this.chemistryMarks = chemistryMarks ;
		this.mathsMarks = mathsMarks ;
	}
	
}
class HistoryStudent extends Student{
	double historyMarks ;
	double civicsMarks ;
	HistoryStudent(double hist,double civics,String name,String address){
		super(name,address);
		this.historyMarks = hist ;
		this.civicsMarks = civics ;
	}
	@Override 
	double getPercentage() {
		double percentage = ((historyMarks+civicsMarks)/200)*100;
		return percentage;
	}
}
