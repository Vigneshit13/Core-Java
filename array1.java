import java.util.*;
public class array1{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String a=sc.next();
	array1 ob=new array1();
	System.out.print(ob.Unique(a));
}
public static String Unique(String test){
	boolean uniq=false;
	for(char c:test.toCharArray()){
	if(test.indexOf(c)==test.lastIndexOf(c))
		return "It is Unique...";
	}
	return "It is Not Unique...";	

}
}
