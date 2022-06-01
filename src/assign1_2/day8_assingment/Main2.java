package day8_assingment;

public class Main2 {
	public static void main(String[] args) {

		Animal[] animal = new Animal[3] ;
//		animal[0] = new Animal() ;
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Tiger();
		
		for(Animal item : animal) {
			item.makeNoise();
			item.eat();
			item.walk();
		}
		//		Dog d1 = new Dog() 
//		d1.makeNoise();
	}


}
class Animal{
public void makeNoise() {
	System.out.println("Animal making Noise");
}
public void eat() {
	System.out.println("Animal is eating");
}
public void walk() {
	System.out.println("Animal is walking");
}
}
class Dog extends Animal{
	@Override
	
	public void makeNoise() {
		System.out.println("Barking.....");
	}
	
}
class Cat extends Animal{
	@Override

	public void makeNoise() {
		System.out.println("Meow.....");
	}
	
}
class Tiger extends Animal{
	@Override
	
	public void makeNoise() {
		System.out.println("Raoring.....");
	}
	
}
