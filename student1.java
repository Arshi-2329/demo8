class Student{

int rollno;
String name;
static String college="ITS";
static void change(){
college="MTIET";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+""+name+""+college);}
}
class TestStaticVariable1{
public static void main(String args[]){
Student s1=new Student(111,"arshi");
Student s2=new Student(222,"hannu");
s1.display();
s2.display();

Student.change();
Student s3=new Student(333,"Arshi");
s1.display();
s2.display();
s3.display();
}
}