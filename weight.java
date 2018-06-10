import java.util.*;
class weight{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
char a[]=str.toCharArray();
int n=sc.nextInt();

int num[]=new int[n];
for(int i=0;i<n;i++){
num[i]=sc.nextInt();
}

//
int num1[]=new int[str.length()];
for(int i=0;i<str.length();i++){
char ch=a[i];
num1[i]=(int)(ch)-96;
//System.out.println(a[i]+" - "+num1[i]);
}
int num2[]=new int[str.length()*2];
int ln=0;boolean bool=false;
for(int i=0;i<str.length();i++){
int count=1;
for(int j=i+1;j<str.length();j++){
if(num1[i]==num1[j]){
count++;
}
}
for(int k=1;k<count;k++){
num2[ln]=num1[i]*k;

System.out.println("The number "+num1[i]+"is repeated and val is - "+num2[ln]);
ln++;
}

}

//System.out.println("YES");


}
}
