import java.util.*;
class num2alp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number:");
int num=sc.nextInt();

String ch[]=new String[10];

int count=0;
while(num>0){
num--;

char a=(char)((num%26)+65);

//System.out.print(a+" ");
//for(int i=0;i<1;i++){
ch[count]=String.valueOf(a);

num=num/26;
count++;
}
for(int len=count-1;len>=0;len--){
System.out.print(ch[len]+" ");
}
}
}
