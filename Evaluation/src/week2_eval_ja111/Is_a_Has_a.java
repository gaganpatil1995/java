package week2_eval_ja111;

public class Is_a_Has_a {
// In  IS_A relationship one class is related with the other class
// in below so can see dogs class is extended from pets
	// and this pet class is extended from animal so this classes is
	// IS_A relation with each other
	//In HAS_A relationship  parent class has a relation with the child class
	// in below example you can see Animal HAS_A relation with the Pets class and Pets class HAS_A relation 
	//with the dogs class
	
// Access modifiers 
	//there are four type of access modifier 
	// 1. Public  2.Default 3.protected 4.private ;
	//Public : we can access this type of  member/classes everywhere out side the package also (access in every where) ;
	//Default: we can access only inside the same package.
	//protected: it same as default but this type of member can be access outside the class if we extent the same class
	//outside the package ;
	// Private : it only can access inside the same class outside the class it cannot be access  
	

}
class Animal{
	
}
class Pets extends Animal{
	
}
class Dogs extends Animal{
	
}