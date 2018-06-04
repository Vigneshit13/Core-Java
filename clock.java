import java.util.*;
class clock{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
String a[]=str.split(":");
int hr=Integer.parseInt(a[0]),min=0;
String sec=a[2];
if(str.contains("AM") && hr==12){
System.out.println("00:"+a[1]+":"+sec.substring(0,2));
}else if(str.contains("AM")){
System.out.println(a[0]+":"+a[1]+":"+sec.substring(0,2));
}else if(str.contains("PM") && hr==12){
System.out.println(hr+":"+a[1]+":"+sec.substring(0,2));
}else if(str.contains("PM")){
hr=Integer.parseInt(a[0])+12;
System.out.println(hr+":"+a[1]+":"+sec.substring(0,2));
}
}
}
