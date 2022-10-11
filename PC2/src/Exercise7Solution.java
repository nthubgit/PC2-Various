import java.util.Scanner;
public class Exercise7Solution {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int roll = in.nextInt();
        System.out.print("\nEnter name: ");
        String name = in.next();
        System.out.print("\nEnter age: ");
        int age = in.nextInt();
        System.out.print("\nEnter course: ");
        String course = in.next();
        Student s = new Student(roll,name,age,course);
        s.display();
   }
}
class Student{
   int roll,age;
   String name,course;
   Student(){
        roll=0;
        name=null;
        age=0;
        course=null;
   }
   Student(int r,String n,int a,String c){
        roll=r;
        course=c;
        int l,temp=0;
        l = n.length();
        for(int i=0;i<l;i++){
             char ch;
             ch=n.charAt(i);
             if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
                  temp=1;
        }
        //Checking Name
        try{
             if(temp==1)throw new NameNotValidException();
             else name=n;
        }
        catch(NameNotValidException e2) {
        	System.out.println(e2);}
        //Checking Age
        try {
             if(a>=15 && a<=21) age=a;
             else  throw new AgeNotWithInRangeException();
        }
        catch(AgeNotWithInRangeException e1) {
        	System.out.println(e1);}
   }
   void display() {
        System.out.println("roll Name Age Course");
        System.out.println("---------------------");
        System.out.println(roll+" "+name+" "+age+" " +course);
   }
}
class AgeNotWithInRangeException extends Exception{
   //public String validage() {//toString() {
   //     return ("Age is not between 15 and 21. please ReEnter the Age");
   //}
   public String toString() {
       return ("Age is not between 15 and 21. please ReEnter the Age");
  }
}
class NameNotValidException extends Exception{
	//public String validname() {
   //   return ("Name is not Valid..Please ReEnter the Name");
 //} 
	public String toString() {
        return ("Name is not Valid..Please ReEnter the Name");
 }
}