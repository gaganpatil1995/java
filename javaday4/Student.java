package javaday4;

public class Student {
 int roll ;
 String name; 
 int age ;
 int marks ;
 Student() {
	 
	 
 }
 Student(int roll, String name,int age1, int marks) {
	this.roll = roll ;
	this.name = name ;
	this.age = age1;
	this.marks = marks ;
 }
 
 public static void main(String[] args) {
	
	 Student s1 = new Student(12,"jay",23,80) ; 
	 System.out.println("Rollno -"+ s1.roll); 
	 System.out.println("Name -"+s1.name); 
	 System.out.println("Age -"+s1.age); 
	 System.out.println("Marks-"+s1.marks); 
	 //	 s1.roll = 12 ;
//	 s1.name = "jay" ;
//	 s1.marks = 80 ;
   System.out.println("//////////////////////////////////////");
	 Student s2 = new Student();
	 s2.roll = 23 ;
	 System.out.println("Roll no :"+s2.roll);
	 s2.name = "Pawan" ;
	 System.out.println("Name :"+s2.name); 
	 s2.age = 22 ;
	 System.out.println( "Age :" + s2.age);
	 s2.marks = 90 ;
	 System.out.println("Marks :"+s2.marks);
	 
	

}
}
