package gr.haec.shapes;

public class Triangle {
double a;
double b;

public Triangle(double a,double b){
	this.a=a;
	this.b=b;
}
double area(){
	double d=(a*b)/2;
	return d;
}
double perimeter(){
	double c=Math.sqrt((a*a)+(b*b));
	double p=a+b+c;
	return p;
}
void printArea(){
	String message="Το εμβαδόν του ορθογωνίου τριγώνου είναι ";
	System.out.println(message+area());
}
void printPerimeter(){
	String message="Η περίμετρος του ορθογωνίου τριγώνου είναι ";
	System.out.println(message+perimeter());
}
public static void main(String[]args){
	Triangle newTriangle=new Triangle(3,4);
	newTriangle.printArea();
	newTriangle.printPerimeter();
}
}
