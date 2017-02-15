package gr.haec.shapes;

public class Square {
double side;

public Square(double side){
this.side=side;
}
double getArea(){
	double a=side*side;
	return a;
}
void print_area(){
	String message="Το εμβαδόν του τετραγώνου είναι  ";
	System.out.println(message+getArea());
}
double getPerimeter(){
	double b=side*4;
	return b;
}
void print_perimeter(){
	String message="Η περίμετρος του τετραγώνου είναι ";
	System.out.println(message+getPerimeter());
}
public static void main(String[]args){
	Square newSquare=new Square(2);
	newSquare.print_area();
	newSquare.print_perimeter();
}
}
