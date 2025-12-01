
import java.util.Set;


@FunctionalInterface
public interface PartlyInfoConsymer {
    void prosess(Set<Hero> party, Hero leader, String pName);
    
}

class Hero{
    private String name;
    public Hero(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

