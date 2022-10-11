class Parent1{

       void show() {

             System.out.println("inside the parent class");

       }

}

class Child1 extends Parent1{

       void display() {

             System.out.println("inside the child class");

       }

}

class Grand_Child extends Child1{

       void demo() {

             System.out.println("inside the grand_child class");

       }

}

public class Multi_level_inheritance {

       public static void main(String[] args) {

             Grand_Child g=new Grand_Child();

             g.demo();

             g.display();

             g.show();

       }

}