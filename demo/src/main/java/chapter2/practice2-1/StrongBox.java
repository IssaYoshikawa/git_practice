
public class StrongBox<E> {
    private E item;
    private KeyType keytype;
    private long count;

    public StrongBox(KeyType keytype){
        this.keytype = keytype;
    }


    public void put(E i){
        this.item = i;
    }

    public E get(){
        this.count++;
        switch (this.keytype) {
            case PADLOCK -> {
                if(count < 1024) return null;
            }
            case BUTTON -> {
                if(count < 10000) return null;
            }
            case DIAL -> {
                if(count < 30000) return null;
            }
            case FINGER -> {
                if(count < 100000L) return null;
            }
        }
        this.count = 0;
        return this.item;
    }

    


}
