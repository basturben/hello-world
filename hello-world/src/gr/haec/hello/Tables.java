package gr.haec.hello;

public class Tables {
int[] array;
public static void main(String[]args){
	int[] array={2,4,6,8,10};
	for(int x=0;x<5;x++){
		if(array[x]<5){
		System.out.println(array[x]);
		}
		else if(array[x]>5&&array[x]<8){
			System.out.println(array[x]*array[x]);	
		}
		else{
			System.out.println(array[x]*array[x]*array[x]);	
		}
	}
}
}
