package METHODS;

// public class prob4 {
//     public static void sum(int a, int b){ //parameters 
//          System.out.println(2+7);
//     }
//     public static void main(String args[]){
//        sum(2,3); //arguments 
//     }
// }


//finding the max of the numbers 
public class prob4{
    public static void max(int a, int b, int c){
        if(a>b && a>c)System.out.println(a);

        else if(b>a && b>c)System.out.println(b);
        
        else System.out.println(c);
        
    }
    public static void main(String args[]){
        max(3,4,5);
    }
}

