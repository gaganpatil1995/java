package day7_assingment;

//

public class Main{
	
	

	public static void main(String[] args) {
		Hosteller hostelStudent = new Hosteller(24,"praju",4560,7050);
		double payfee = hostelStudent.payFee(3600);
		double totalFee = payfee + hostelStudent.hostelFee ;
		System.out.println("Student of hostel has to pay " + totalFee);
		
		DayScholar dayScholarStudent = new DayScholar(24,"praju",4560,3050);
		double payfee2 = dayScholarStudent.payFee(3600);
		double totalFee2 = payfee + dayScholarStudent.transportFee ;
		System.out.println("Student of DayScholar has to pay " + totalFee2);
		
	}
}




class Student {
	Integer studId;
	String studName ;
	double examFee ;
	
	
	void displayDetail() {
		
	}
	double payFee(double fee) {
		
		return fee + examFee;
				
	}
	public Student(Integer Id,String name,Double Fee) {
		this.studId = Id ;
		this.studName = name ;
		this.examFee = Fee ;
		
	}
	
	

}
class DayScholar extends Student{
	double transportFee ;
	DayScholar(Integer Id,String name,double Fee ,double transportFee){
		super( Id,name, Fee) ;
		this.transportFee=transportFee;
	}
	
	
}
class Hosteller extends Student{
	double hostelFee ;
	 Hosteller(Integer id,String name,double Fee,double hostelFee) {
		 
		super(id,name, Fee);
		this.hostelFee = hostelFee ; 
	}
	
}
