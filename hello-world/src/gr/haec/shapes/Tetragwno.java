package gr.haec.shapes;

public class Tetragwno extends Shape {
   double sideA;
	public Tetragwno(String color,double sideA) {
		super(color);
		this.sideA=sideA;
		System.out.println("����������� ���  "+color+" ���������");
	}
	void calcArea(){
		 this.area=sideA*sideA;
		 System.out.println("��������� �� ������� ��� �� ��������� "+area);
	}
	void calcPerim(){
		this.perim=sideA*4;
		System.out.println("��������� ��� ��������� ��� �� ��������� "+perim);
	}
	public String toString(){
		return "����� ��� "+color+" ��������� �� ������ "+sideA;
	}
	public static void main(String[] args) {
     Tetragwno newTetragwno=new Tetragwno("�������",6);
     newTetragwno.calcArea();
     newTetragwno.calcPerim();
     System.out.println(newTetragwno);
     newTetragwno.toString();
	}
}
