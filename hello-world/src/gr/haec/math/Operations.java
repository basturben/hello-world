package gr.haec.math;


public class Operations {
	
double number1;
double number2;

public Operations(double number1,double number2){
	this.number1=number1;
	this.number2=number2;
}
public Operations(){
	
}
public static void main(String[]args){
	//Operations newOperations=new Operations(5.2,6.2);
	//System.out.println(newOperations.number1);
	//Operations newOperations2=new Operations(3,7);
	//double x=newOperations2.sum();
	//System.out.println(x);
}
//double sum(){
//double z=number1+number2;
//return z;
//}
public double sum(double x,double y){
	double z=x+y;
	return z;
}
}
