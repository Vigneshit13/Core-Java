import java.util.*;
class str101{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s[]=new String[n];
String str="hackerrank";
int l1=str.length();
char a[]=str.toCharArray();
for(int i=0;i<n;i++){
s[i]=sc.next();
}

for(int i=0;i<n;i++){
String str1=s[i];
char b[]=str1.toCharArray();
int l2=str1.length();
int times=0;boolean bool=false;
int count=0;
for(int j=0;j<l1;j++){
for(int k=times;k<l2;k++){

if(a[j]==b[k]){

count++;

}

}

times=times+1;
}

if(count==10){
System.out.println("YES");
}else
System.out.println("NO");
}

}
}

