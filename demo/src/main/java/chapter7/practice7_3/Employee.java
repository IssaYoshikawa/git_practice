package chapter7.practice7_3;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

}
