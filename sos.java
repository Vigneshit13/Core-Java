import java.util.*;
class sos{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
char a[]=str.toCharArray();
int count=0;
for(int i=0;i<str.length()/3;i++){
for(int j=0;j<3;j++){
if(j==0 || j==2){
if(a[(3*i)+j]!='S')
count=count+1;
//System.out.println(a[(3*i)+j]+" :  a[o] a[2] : "+count);
}else if(j==1){
if(a[(3*i)+j]!='O')
count=count+1;
//System.out.println(a[(3*i)+j]+" : a[1] : "+count);

}
}

}
System.out.println(count);
}
}
