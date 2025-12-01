
import java.util.function.BiFunction;
import java.util.function.Predicate;



// @FunctionalInterface
// interface Func1{
//     boolean invoke(int x);
// }

// @FunctionalInterface
// interface Func2{
//     String invoke(int point, String name);
// }


public class Main {
    public static void main(String[] args) {
        Predicate<Integer> f1 = x -> x % 2 == 1;
        

        BiFunction<Integer, String, String> f2 = (p, n) ->
            n + "さんは" + (p > 65 ? "合格" : "不合格");
        

        System.out.println(f1.test(15));
        System.out.println(f2.apply(70, "Alice"));
    }
   
}
