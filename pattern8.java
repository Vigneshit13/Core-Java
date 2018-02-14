public class pattern8{
public static void main(String args[]){
int n=7;
int ps=n/2;
int ph=n-ps;
for(int i=ph;i>=1;i--){
for(int j=ps;j>=i;j--){System.out.print("  ");}
for(int k=1;k<=n;k++){System.out.print("* ");}
n-=2;System.out.println();
}
}
}
