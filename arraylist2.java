import java.util.*;
class Student{
int rollno,marks;
public Student(int rollno,int marks){
this.rollno=rollno;
this.marks=marks;
}
}

public class arraylist2{
public static void main(String args[]){
Student s1=new Student(101,95);
Student s2=new Student(102,98);
ArrayList<Student> l=new ArrayList<Student>();
l.add(s1);
l.add(s2);

Iterator i=l.iterator();
while(i.hasNext()){

Student s=(Student)i.next();
System.out.println(s.rollno+" "+s.marks);
}

}
} 
