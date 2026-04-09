package METHODS;
import java.util.*;
public class permutation_Combination {

    //without using methods - normal code 
   /*  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nFact = 1;
        for(int i=1;i<=n;i++){
            nFact *= i;
        }

        int rFact = 1;
        for(int i=1;i<=r;i++){
            rFact *= i;
        }

        int nrFact = 1;
        for(int i=1;i<=n-r;i++){
            nrFact *= i;
        }

        int result = nFact / (rFact * nrFact);
        System.out.println(result);

        sc.close();
    }
    */

    // using methods 
     public static int Fact(int x){
        int f = 1;
        for(int i=1;i<=x;i++){
            f *= i;
        }
        return f;
     }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = Fact(n)/(Fact(r)*Fact(n-r));
        System.out.println(result);

        sc.close();
        
     }

}
