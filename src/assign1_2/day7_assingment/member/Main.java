package day7_assingment.member;

public class Main {
	
	public static void main(String[] args) {
		Employee employe = new Employee();
		Manager manager = new Manager() ;
		employe.name = "Abhishke chouhan" ;
		employe.age = 27 ;
		employe.phoneNumber = "9087343454";
		employe.address = "Nagpur Maharashtra";
		employe.salary = 200000;
	
		System.out.println("employe Name :"+employe.name) ;
		System.out.println("employe Age:" +employe.age);
		System.out.println("employe Phone number:"+ employe.phoneNumber);
		System.out.println("employe Address :"+ employe.address);
		employe.printSalary();
		
		
		System.out.println("   ");
		
		manager.name = "Gagan Patil" ;
		manager.age = 27 ;
		manager.phoneNumber = "9094389474";
		manager.address = "Indore Madhya pradesh";
		manager.salary = 2500000;
	
		System.out.println("manager Name :"+manager.name) ;
		System.out.println("manager Age:" +manager.age);
		System.out.println("manager Phone number:"+ manager.phoneNumber);
		System.out.println("manager Address :"+ manager.address);
		manager.printSalary();
	}

}
