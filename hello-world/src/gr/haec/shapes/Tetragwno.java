package gr.haec.shapes;

public class Tetragwno extends Shape {
   double sideA;
	public Tetragwno(String color,double sideA) {
		super(color);
		this.sideA=sideA;
		System.out.println("κατασκευάζω ένα  "+color+" τετράγωνο");
	}
	void calcArea(){
		 this.area=sideA*sideA;
		 System.out.println("Υπολογίζω το εμβαδόν για το τετράγωνο "+area);
	}
	void calcPerim(){
		this.perim=sideA*4;
		System.out.println("Υπολογίζω την περίμετρο για το τετράγωνο "+perim);
	}
	public String toString(){
		return "είμαι ένα "+color+" τετράγωνο με πλευρά "+sideA;
	}
	public static void main(String[] args) {
     Tetragwno newTetragwno=new Tetragwno("κόκκινο",6);
     newTetragwno.calcArea();
     newTetragwno.calcPerim();
     System.out.println(newTetragwno);
     newTetragwno.toString();
	}
}
