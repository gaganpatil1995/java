package Day11_assignment;

public class Demo1 {

	public static void main(String[] args) {
		ZImpl zimpl = new ZImpl();
		zimpl.funcA();
		zimpl.funcAY();
		zimpl.funcAZ();
		zimpl.funcDX();
		zimpl.funcDY();
		X.funcS();
		Y.funcSY();
		
	}
	
}

class ZImpl implements Z{

	@Override
	public void funcA() {
		System.out.println("funcA of class ZImpl");
		
	}

	@Override
	public void funcAY() {
		System.out.println("funcAY of class ZImpl");
		
	}

	@Override
	public void funcAZ() {
		System.out.println("funcAZ of class funcAZ");
		
	} 
	@Override
	public void funcDX() {
		System.out.println("defaul method override in ZImpl class");
	}
	
	
}
interface Z extends X,Y{
 void funcAZ();
}

interface X{
	
	void funcA();
	
	default void funcDX(){
		System.out.println("Default method of X inteface");
	}
	static void funcS(){
		System.out.println("method of static in interface X");
	}
}
interface Y{
	void funcAY();
	
	default void funcDY(){
		System.out.println("Default  method in interface Y");
	}
	static void funcSY(){
		System.out.println("Static method in interface Y");
	}
}