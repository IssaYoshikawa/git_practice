package chapter7.chapter7_13;

import java.io.Serializable;

public class Hero implements Serializable {
    private String name;
    private int hp;
    private int mp;
    private Sword sword;

    public Hero(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    @Override
    public String toString(){
        return "名前 = " + name + ", HP = " + hp + ", MP = " + mp;
    }
}
