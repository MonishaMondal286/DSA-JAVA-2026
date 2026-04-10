package METHODS;

public class PassByValueAndReference {
    public static void change(int x){
         x = 8;
    }
    public static void main(String args[]){
        int x = 9;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
