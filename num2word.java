import java.util.*;
class num2word{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number:");
int num=sc.nextInt();
int oned,twod;
String [] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "tweleve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

String [] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

String [] hundreds = {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred", 
            "six hundred", "seven hundred", "eight hundred", "nine hundred" }; 

while(num!=-1){
if(num<20){
String res=ones[num];
System.out.println(res);
break;
}

if(num>=20&&num<100){
twod=num/10;
oned=num%10;
System.out.println(tens[twod]+" "+ones[oned]);
break;
}
}

}
}
