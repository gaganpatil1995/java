package javaday4;

public class DemoConstructor {
	public DemoConstructor() {
		this("string") ;
		System.out.println("this is emty parameter constructor ") ;
	}
	public DemoConstructor(String s) {
		this(10);
		System.out.println("This is String parameter constructor") ;
	}
	public DemoConstructor(int i) {
		this(105f);
		System.out.println("This is integer parameter constructor") ;
	}
	public DemoConstructor(float f) {
		System.out.println("This is Float parameter constructor") ;
	}
	public static void main(String[] ag) {
		DemoConstructor d1 = new DemoConstructor() ;
	}

}
