public class Hero {
    private String name;
    private int hp, mp;

    @Override
    public String toString(){
        return "勇者（名前= " + this.name + "/HP= " + this.hp + "/MP= " + this.mp + "）";
    }
}
