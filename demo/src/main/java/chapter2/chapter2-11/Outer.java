
public class Outer {
    int outField;
    static int outerStaticField;

    static class Inner{
        void innerMethod(){
            outerStaticField = 10;
        }
    }
    
    void outerMethod(){
        Inner ic = new Inner();
    }
}
