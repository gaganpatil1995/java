package ja111_first_eval;
import java.util.Scanner ;
public class Course {
	
	int courseId ;
	String courseName; 
	int courseFee ;
	void displayCourseDetails() {
		System.out.println("Course Id :" + courseId);
		System.out.println("Course Name :" + courseName);
		System.out.println("Course Fee :" + courseFee);
	}
	static void authenticate(String username,String password) {
		
		if(username == "Admin" && password=="1234") {
			Course c1 = new Course();
			System.out.println("Enter Your Course Id;");
			Scanner input = new Scanner(System.in);
			int id= input.nextInt();
//			System.out.println(id);
			c1.courseId = id ;
			input.nextLine();
			System.out.println("Enter your Course name:");
			String name = input.nextLine();
			c1.courseName = name ;
			System.out.println("Enter Course Fee");
			int fee = input.nextInt();
			c1.courseFee = fee ;
//			System.out.println(c1.courseId,c1.courseName,c1.courseFee);
//			System.out.println(name);
			c1.displayCourseDetails();
			
//			String c1.courseName= input.nextLine() ; 
			
			input.nextLine();
		}
		else {
			System.out.println("Invalid Username or Password");
		}
		
	}
	public static void main(String[] arg) {
		authenticate("Admin","1234");
		authenticate("Admin","2341") ;
	}

}
