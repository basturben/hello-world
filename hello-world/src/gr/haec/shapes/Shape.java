package gr.haec.shapes;

public class Shape {
double area;
double perim;
String color;
public Shape(String color){
	this.color=color;
	System.out.println("����������� ��� "+color+" �����");
}
double getArea(){
	return area;
}
double getPerim(){
	return perim;
}
String getColor(){
	return color;
}
void calcArea(){
	System.out.println("��������� �� ������� ��� �� �����");
}
void calcPerim(){
	System.out.println("��������� ��� ��������� ��� �� �����");
}
}
