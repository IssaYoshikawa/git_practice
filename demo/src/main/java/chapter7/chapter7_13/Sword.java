package chapter7.chapter7_13;

import java.io.Serializable;

public class Sword implements Serializable {
    String name;
    int power;

    public Sword(String name, int power){
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString(){
        return "名前：" + name + ", POWER = " + power;
    }
}
