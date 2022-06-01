package day10_assignment;

public class Main {

	public static void main(String[] args) {
		Area area = new Area();
		int circle = area.circleArea(4) ;
		int rec = area.rectangularArea(5, 10);
		int squ = area.squareArea(5) ;
		
		System.out.println("Area of circle of Radius 4 is : "+ circle);
		System.out.println("Area of rectangle of length 5 and breath 10 is :"+ rec);
		System.out.println("Area of Square of side 5 is "+ squ);
	}
}

abstract class Shape{
	abstract public int rectangularArea(int length,int breath);
	abstract public int squareArea(int side);
	abstract public int circleArea(int radius) ;
	
}
class Area extends Shape{
	public int rectangularArea(int length,int breath) {
		 int area = length*breath;
		 return area ;
		
	}
	public int squareArea(int side) {
		int area = side*side ;
		return area ;
	}
	public int circleArea(int radius) {
		int area = (int)(3.14 * (radius*radius));
		return area ;
	}
}