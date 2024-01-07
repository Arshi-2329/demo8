
class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day4Program0{
public static void main(String args[]){
Student[] ob=new Student[3];ob[0]=new Student();

ob[0].setId(1111);
ob[0].setName("Test");
System.out.println("ID:"+ob[0].getId());
System.out.println("Name:"+ob[0].getName());
ob[1]=new Student();
ob[1].setId(26026);
ob[1].setName("shalini");
System.out.println("ID:"+ob[1].getId());
System.out.println("Name:"+ob[1].getName());
ob[2]=new Student();
ob[2].setId(26194);
ob[2].setName("balaji");
System.out.println("ID:"+ob[2].getId());
System.out.println("Name:"+ob[2].getName());
}
}