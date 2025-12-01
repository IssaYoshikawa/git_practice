
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        
    }
}

class MyStream<T>{
    private final List<T> data;

    private MyStream(List<T> data){
        this.data = data;
    }

    @SafeVarargs
    public static <T> MyStream<T> of(T... values){
        return new MyStream<>(Arrays.asList(values));
    }

    public MyStream<T> filter(Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for(T item : data){
            if(predicate.test(item)){
                result.add(item);
            }
        }
        return new MyStream<>(result);
    }
}
