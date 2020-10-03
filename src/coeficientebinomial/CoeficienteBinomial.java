/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coeficientebinomial;
import java.util.Scanner;
/**
 *
 * @author yudy-
 */
public class CoeficienteBinomial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("k = ");
        int k = sc.nextInt();
        System.out.println(""+cb(n,k));
    }
    
    private static int cb(int n, int m){
        if(n == m || m == 0){
            return 1;
        }else{
            return cb(n-1,m)+cb(n-1, m-1);
        }
    }
    
    
}
