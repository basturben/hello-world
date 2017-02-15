package gr.haec.hello;
import gr.haec.math.Operations;
import java.util.Scanner;
public class Laptop {
 String manufacturer,model,cpu="intel";
 int ram=4;
 float hddCapacity;
 boolean hdd_ssd=false,has_dvd;
 
 public Laptop(String manufacturer, String model, String cpu) {
	this.manufacturer=manufacturer;
	this.model=model;
	this.cpu=cpu;
}
 public Laptop(){
	 
 }
void setRam (int newRam){
	 ram=newRam;
 }
 void printRam (){
	String message="Η μνημη του Laptop ειναι";
	 System.out.println(message+" "+ram); 
 } 
 void addRam(int extraRam){
	 Operations op=new Operations();
	 ram=(int) op.sum(5,5);
 }
 void userInsertRAM(){
	 int userRAM;
	 System.out.println("Εισάγεται την μνήμη του υπολογιστή ");
	 Scanner userInput=new Scanner(System.in);
	 userRAM=userInput.nextInt();
	 ram=userRAM;
 }
}

