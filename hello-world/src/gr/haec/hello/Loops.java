package gr.haec.hello;

public class Loops {

	public static void main(String[]args){
		int x=0;
		int y=0;
		while(x<10){
			String message="to x einai ";
		System.out.println(message+x);
		x=x+1;
		}
		do{
		String message="to y einai ";
			System.out.println(message+y);
			y=y+1;
		}while(y<=10);
		for(int z=0,h=10;(z<10)&&(h>5);z+=1,h-=1){
			System.out.println("z="+z+",h="+h);	
		}
	}
}
