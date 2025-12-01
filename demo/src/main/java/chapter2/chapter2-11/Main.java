
public class Main {
    public static void main(String[] args) {
        Outer.outerStaticField = 5;
        Outer.Inner ic = new Outer.Inner();
        ic.innerMethod();
        System.out.println(Outer.outerStaticField);
    }
}
