import java.util.*;
class str102{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s1[]=new String[n];
for(int i=0;i<n;i++){
s1[i]=sc.next();
}
for(int i=0;i<n;i++){
String a=s1[i];
System.out.println(checkIfIsHacker(a));
}
}

private static String checkIfIsHacker(String s) {

        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }
}
