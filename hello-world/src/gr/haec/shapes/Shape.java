package gr.haec.shapes;

public class Shape {
double area;
double perim;
String color;
public Shape(String color){
	this.color=color;
	System.out.println("κατασκευάζω ένα "+color+" σχημα");
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
	System.out.println("Υπολογίζω το εμβαδόν για το σχήμα");
}
void calcPerim(){
	System.out.println("Υπολογίζω την περίμετρο για το σχήμα");
}
}
