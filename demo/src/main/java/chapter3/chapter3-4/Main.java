
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class Main{
    public static void main(String[] args) {
        Function<String, Integer> func = s -> s.length();
        int n = func.apply("Java");
        System.out.println("文字列「Java」は" + n + "文字です");

        double b = 3.14;
        IntToDoubleFunction func2 = x -> x * x * b;
        double a = func2.applyAsDouble(2);
        System.out.println("2*2*pi=" + a);
    }
}