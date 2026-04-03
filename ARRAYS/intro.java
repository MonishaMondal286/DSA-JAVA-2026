// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package ARRAYS;

import java.util.Scanner;

public class intro {
   public intro() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the array size : ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.print("Enter the array elements : ");

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      System.out.print("Print negative arrays : ");

      for(int var5 = 0; var5 < var2; ++var5) {
         if (var3[var5] < 0) {
            System.out.print(var3[var5] + " ");
         }
      }

   }
}
