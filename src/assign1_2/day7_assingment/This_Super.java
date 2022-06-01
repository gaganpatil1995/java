package day7_assingment;

public class This_Super {
	int num; 
	int sal ;
	String mal ;
	This_Super(int l,int s, String m){
		this.num = l;  // this keyword pointing towards the instance variable of same class 
		this.sal = s ; //this keyword is basically use to set the value in instance variable ; 
		this.mal = m ;
		
	}
	

}

class ChildOfSuper extends This_Super{
	 
	ChildOfSuper(int l,int s, String m){
		super(l,s,m) ;    // whenever we extends class from parent class , child class constructor call the parent class
		//constructor and if parent class constructor is having parameter then child class constructor must have to 
		// pass the same parameter
		// in given example parent class constructor having a parameter that is why inside the 
		//child constructor we write the parameterized super keyword which call the parent constructor ;
	}
	
}