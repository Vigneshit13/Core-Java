import java.util.*;
class arraylist1{
public static void main(String args[]){
ArrayList<String> list=new ArrayList<String>();
list.add("ADD");
list.add("SUB");
list.add("MUL");
list.add("DIV");

Iterator i=list.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
for(String a:list){
System.out.println(a);
}

}
}
