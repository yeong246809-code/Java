package test3;
public class Test06 {
    
    public static void main(String[] args) {
        Adder a1 = Adder.getInstance();
        a1.add(1, 2);
        a1.show();
        
        int[] arr = {10, 20};
        a1.add(arr);
        a1.show();
        
        Adder.add(a1);
        a1.show();
        
        a1 = Adder.add(a1, 3);
        a1.show();
    }
}