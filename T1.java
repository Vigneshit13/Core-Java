class T1{
public static void main(String args[]){
int i,j;
for(i=0;i<5;i++){
int f=1;
for(j=0;j<5&&i<5;i++,j++){
if(i==j){
System.out.println("Inside first if loop...."+i+" "+j+" "+f);
f=0;
break;
}
System.out.println("Inside inner for loop"+i+" "+j+" "+f);
}
if(f==1){
System.out.println("Insdide Second if loop..."+i+" "+j+" "+f);
}
System.out.println("Insdie outer for loop...."+i+" "+j+" "+f);
}
}
}
