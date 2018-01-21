import java.util.*;

class Programs1{
	int a,b,result;
public static void main(String[] args){
	Programs1 ob=new Programs1();
	int n;
	System.out.println(".......Programs.......");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number1:");
	ob.a=sc.nextInt();
	System.out.println("Enter the Number2:");
	ob.b=sc.nextInt();
	System.out.println("Enter the Choice.....\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
	n=sc.nextInt();
	switch(n){
	case 1:ob.add();break;
	case 2:ob.sub();break;
	case 3:ob.mul();break;
	case 4:ob.div();break;
	}}
	void add(){
		result=a+b;
	//	return result;
		display(result);
	}
	void sub(){
		result=a-b;
	//	return result;
		display(result);
	}
	void mul(){
		result=a*b;
	//	return result;
		display(result);
	}
	void div(){
		result=a/b;
	//	return result;
		display(result);
	}
	void display(int result){
	System.out.println("Result is:"+this.result);}
	
}
