package week2_eval_ja111;
import java.util.Scanner ;

public class Demo {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter number of Student");
		int stuNo = input.nextInt();
//		System.out.println(stuNo);
		Student[] student = new Student[stuNo] ;
		int total = 0 ;
		int tot = 0 ;
		  Student s1 = new Student() ;
		for(int i = 0 ;i<student.length;i++) {
		 
		     student[i] = s1 ;
			System.out.println("Enter Roll no :");
			student[i].roll = input.nextInt();
			System.out.println("Enter Name :");
			student[i].name = input.next();
//			
			System.out.println("Enter Address :");
			student[i].address = input.next();
			System.out.println("Enter Marks :");
			student[i].marks = input.nextInt();
////			System.out.println(item.marks);
			
			total = tot + student[i].marks ;
			 tot = total ;
			
		}
		for(Student item: student) {
			item.printD();
			System.out.println("///////////////////////");
		}
		int ave = total/student.length ;
		System.out.println("average of all Student marks is "+ ave);
//		System.out.println(student[1].name);
		
		
	
	}
	
}

class Student{
	Integer roll; 
	String name ;
	String address ;
	Integer marks ;
	
	void printD() {
		System.out.println("Roll no : " + roll);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Marks : " + marks); ;
	}
	
}
