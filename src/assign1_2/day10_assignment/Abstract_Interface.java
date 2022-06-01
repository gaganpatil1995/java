package day10_assignment;

public class Abstract_Interface {
// in below we have  abstract class and interface ;
	// abstract class and interface both are use to provide an abstraction 
	//while abstract class is provide 0 to 100% abstraction and interface is provide 100% abstraction
	// Method in abstract class may or may not have an abstract method ,abstract class also have normal method and members
	// but in interface all the method must be abstract method and all method is default abstract method
	//we cannot create Object of both abstract class and interface ;
	// we make abstract class and interface only when we need a class who's object cannot created directly but it can be inherited 
	// in other class
	// if we want to inherit abstract class we can use extends but we want to inherit interface we have to us implement 
	//abstract method is a empty body method which will get override in extended class or implemented class;
}

abstract class Abs{
	void funcA() {
		
	}
	abstract void funcB();
	
}
interface intr{
	void funcC();
	void funcW();
	
}