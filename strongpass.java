import java.util.*;
class strongpass{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String num = "0123456789";
String lc = "abcdefghijklmnopqrstuvwxyz";
String uc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String spc = "!@#$%^&*()-+";
int n=sc.nextInt();
int test=0;
String str=sc.next();
int count=str.length();
char a[]=str.toCharArray();
if(n==count){
if(count<6){
int s=6-count;
System.out.println(s);
}
/*else if((!str.contains(num) && !str.contains(lc) && !str.contains(uc)) || (!str.contains(lc) && !str.contains(uc) && !str.contains(spc)) || (!str.contains(uc) && !str.contains(spc) && !str.contains(num))){System.out.println("3");
}else if((!str.contains(num) && !str.contains(lc)) || (!str.contains(lc) && !str.contains(uc)) || (!str.contains(uc) && !str.contains(spc)) || (!str.contains(spc) && !str.contains(num))){System.out.println("2");
}
else if(!str.contains(num) || !str.contains(lc) || !str.contains(uc) || !str.contains(spc)){System.out.println("1");
}*/


else{

for(int i=0;i<n;i++){

if(!num.contains(a[i])){
test=test+1;
}
if(!lc.contains(a[i])){
test=test+1;
}
if(!uc.contains(a[i])){
test=test+1;
}
if(!spc.contains(a[i])){
test=test+1;
}
System.out.println(test);
}

}
}
}





}
