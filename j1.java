import java.util.*;

public class j1{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int factorial=fact(num);
System.out.println("Factorial of "+num+" is "+factorial);
}
public static int fact(int num){
if(num==0)
	return 1;
else

	return (num*fact(num-1));


}
}
