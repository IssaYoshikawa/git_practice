import java.util.Objects;

public class Hero {
    public String name;
    int hp;

    public Hero(String string) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if(!(o instanceof Hero)) return false;
        Hero h = (Hero) o;
        return Objects.equals(this.name, h.name) && this.hp == h.hp;
    }

    public int hashCode(){
        return Objects.hash(this.name, this.hp);
    }

    public void setSword(Sword s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSword'");
    }

    public Sword getSword() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSword'");
    }


}
