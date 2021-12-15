package com.codechef;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        /*

         */
       Manager m1 = new Manager();
       Employee m2 = new Employee();
        m1.name = "nitin";
        m2.name = "yugal";
        m1.age = 20;
        m2.age = 19;
        m1.phoneNo = 876545342;
        m2.phoneNo = 675434521;
        m1.address = "varanasi";
        m2.address = "lucknow";
        m1.salary = 20000;
        m2.salary = 23000;
        m1.salary();
        m2.salary();

    }
}
class Manager extends Member{
    String specialization,department;
}
class Employee extends Member{
    String Specialization,department;
}
class Member{
    int age,salary;
    long phoneNo;
    String name,address;
    void salary(){
        System.out.println("salary of "+this.name+" is "+this.salary+" whose address, age and phoneNo is "+this.address+" "
        +this.age+" "+this.phoneNo);
    }

}
