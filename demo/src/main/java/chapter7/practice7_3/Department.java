package chapter7.practice7_3;

import java.io.Serializable;

public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    Employee leader;

    public Department(String name, Employee leader){
        this.name = name;
        this.leader = leader;
    }
}
