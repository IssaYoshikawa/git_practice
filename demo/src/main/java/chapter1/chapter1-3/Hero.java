public class Hero {
    public String name;
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if(!(o instanceof Hero)) return false;
        Hero h = (Hero) o;
        return this.name != null && this.name.equals(h.name);
    }
}
