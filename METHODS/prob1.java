package METHODS;
import java.util.*;
//finding max out of 4 numbers 
public class prob1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
