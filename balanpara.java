
import java.util.*;
class balanpara{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

String fp="";
int pl=0;

for(int i=0;i<str.length();i++){
char c=str.charAt(i);
if(c=='('){
pl++;
fp+=c;
}
else if(c==')'){
if(pl>0){
pl--;
fp+=c;
}
}
else{
fp+=c;}

}

String sp="";
int ipl=0;

for(int i=fp.length()-1;i>=0;i--){
char s=fp.charAt(i);
if(s==')'){
ipl++;
sp=s+sp;
}
else if(s=='('){
if(ipl>0)
{
ipl--;
sp=s+sp;
}
}

else{
sp=s+sp;}

}
String s1=sp;
System.out.print(s1);
}
}
