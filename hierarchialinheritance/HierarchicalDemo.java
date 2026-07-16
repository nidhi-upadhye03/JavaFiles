package com.tns.hierarchialinheritance;

public class HierarchicalDemo {

    public static void main(String[] args) {
    Person p1= new Person("abhilash","mysore");
System.out.println(p1);

Person p;//dynamic  binding
p=new Student("varun","bengaluru","5th",89.0f);
System.out.println(p);
p=new Employee("divya","tumkur",101,34.5f,"cse");
System.out.println(p);


    }

}
