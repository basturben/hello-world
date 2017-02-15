package gr.haec.hello;

public class StaticExamble {
  static int count;
public StaticExamble(int count){
	StaticExamble.count=count;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	StaticExamble.count = count;
}
static void printCount(){
	System.out.println(count);
}
public static void main(String[]args){
	//StaticExamble count1=new StaticExamble(4);
	//StaticExamble count2=new StaticExamble(5);
	//StaticExamble count3=new StaticExamble(6);
	StaticExamble.printCount();
	StaticExamble.printCount();
	StaticExamble.printCount();
}
}
