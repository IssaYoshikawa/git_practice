public class Account {
    int zandaka;
    String name;

    public Account(String name, int zandaka){
        this.name = name;
        this.zandaka = zandaka;
    }
     @Override
    public String toString(){
        return name + "(残高: " + zandaka + ")";
    }

}
