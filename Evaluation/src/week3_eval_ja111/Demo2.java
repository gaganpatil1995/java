package week3_eval_ja111;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern; ;

public class Demo2 {

	public static void main(String[] args) {
		Customer cus = new Customer();
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter Username");
		String usernam = input.next();
		if(Pattern.matches("[a-zA-Z]{3,8}",usernam)){
			cus.setUsername(usernam);
		}
		else {
			System.out.println("Please Enter valid User Name");
		}
     
		System.out.println("Enter password");
		String passw = input.next();
		
		if(Pattern.matches("[a-zA-Z0-9]{3,8}", passw)) {
			cus.setPassword(passw);
		}
		else {
			System.out.println("Please Enter valid password");
		}
//		System.out.println(cus.getPassword());
		System.out.println("Enter Mobile Number");
		String mobile = input.next();
		if(Pattern.matches("[789]{1}[0-9]{9}", mobile)) {
			cus.setMobileNumber(mobile);
		}
		else {
			System.out.println("Please Enter valid Mobile number");
		}
//		System.out.println(cus.getMobileNumber());
		
		System.out.println("Enter Your Email Id");
		String email = input.next();
		
		Pattern p = Pattern.compile("@gmail.com");
		Matcher m = p.matcher(email);
		
		if(m.find()) {
			cus.setEmail(email);
		}
		else {
			System.out.println("Please Enter valid Email");
		}
	}
}

class Customer{
	private String username ;
	private String password ;
	private String mobileNumber ;
	private String email ;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}