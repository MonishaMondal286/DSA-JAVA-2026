package ARRAYS;
import java.util.*;

public class intro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Print negative arrays : ");
            for(int i=0;i<n;i++){
                if(arr[i]<0){
                    System.out.print(arr[i]+" ");
                }
            }
        
    }
}