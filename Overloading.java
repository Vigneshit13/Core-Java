package first;

public class Overloading {
	void add(int a){
		System.out.println("It has SINGLE parameter");
	}
	void add(int a,int b){
		System.out.println("It is TWO parameter");
	}
	void add(){
		System.out.println("It is a DEFAULT Constructor");
	}
	void add(int a,float b){
		System.out.println("It is Parameterized Constructor with DIFFERENT datatype");
	}
public static void main(String[] args) {
	Overloading obj=new Overloading();
	obj.add();
	obj.add(10);
	obj.add(100, 100);
	obj.add(125, 125.225f);
	
}
}
