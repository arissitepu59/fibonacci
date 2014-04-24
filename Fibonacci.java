/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;
import java.util.Scanner;
/**
 *
 * @author Asisten
 */
public class Fibonacci {

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Input Angka : ");
       int n = s.nextInt();
       fibonacci(n);
   }

   public static void fibonacci(int n) {
       if (n == 0) {
           System.out.println("0");
       } else if (n == 1) {
           System.out.println("0 1");
       } else {
           System.out.print("0 1 ");
           int a = 0;
           int b = 1;
           int Jumlah=1;
           for (int i = 1; i < n; i++) {
               int nextAngka = a + b;
               System.out.print(nextAngka + " ");
               Jumlah=Jumlah+nextAngka;
               a = b;
               b = nextAngka;                              
           }
           System.out.println();
           System.out.println("Jumlah :" +Jumlah);
       }       
   }
}
