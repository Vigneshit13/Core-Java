import java.util.*;
public class Stack1{
	Scanner sc=new Scanner(System.in);
	Stack st=new Stack();
	static void showpush(Stack st,int a){
		st.push(new Integer(a));
		System.out.println("Push("+a+")");
		System.out.println("Stack:"+st);
	}

	static void showpop(Stack st){
		System.out.print("Pop->");
		Integer a=(Integer)st.pop();
		System.out.println(a);
		System.out.print("Stack:"+st);
	}
public static void main(String args[]){
	Stack st=new Stack();
	Stack1 st1=new Stack1();
	System.out.println("Stack:"+st);
	Scanner sc=new Scanner(System.in);
	while(true){
		System.out.println("Enter your choice:\n1.Push\n2.Pop");
		int choice=sc.nextInt();
		switch(choice){
			case 1:st1.push1();break;
			case 2:st1.pop1();break;
		}
	}
}
void push1(){
	System.out.println("Enter the number to push:");
	int num=sc.nextInt();
	showpush(st,num);
}
void pop1(){
	try{
		showpop(st);
	}catch(Exception e){
	System.out.println("Empty Stack...");
}
}
}
