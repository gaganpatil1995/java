package javaday4;

public class StudentQ3 {
    Integer roll ;
	String name ;
	String address ;
	String collageName ;
	StudentQ3(Integer roll,String name,String address){
		this.roll = roll ; 
		this.name = name;
		this.address = address ;
		this.collageName = "NIT" ;
	}
	StudentQ3(Integer roll,String name,String address , String collage){
		this.roll = roll ; 
		this.name = name;
		this.address = address ;
		this.collageName = collage ;
	}
	String getname(){
		return name ;
	}
	Integer getroll() {
		return roll ;
	}
	String getaddress() {
		return address ;
	}
	String getcollageName() {
		return collageName ;
	}
	public static StudentQ3 getStudent(boolean isFromNit) {
		if (isFromNit==true) {
			StudentQ3 s1 = new StudentQ3(34,"vicky","Mumbai") ;
			s1.collageName = "NIT" ;
			return s1 ;
		}
		else {
			StudentQ3 s1 = new StudentQ3(42,"ram","banglore","priyadarshini");
			return s1 ;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		StudentQ3 s2 = getStudent(true) ;
		 System.out.println("Rollno -"+ s2.roll); 
		 System.out.println("Name -"+s2.name); 
		 System.out.println("Address -"+s2.address); 
		 System.out.println("Collage-"+s2.collageName); 
		
		
		StudentQ3 s3 = getStudent(false) ;
		System.out.println("Rollno -"+ s3.roll); 
		 System.out.println("Name -"+s3.name); 
		 System.out.println("Address -"+s3.address); 
		 System.out.println("Collage-"+s3.collageName); 
		
	}

}
