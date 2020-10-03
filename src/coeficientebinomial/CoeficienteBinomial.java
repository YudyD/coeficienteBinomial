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
        int i,j;
        int[][] tabla = new int[n+1][n+1];
        if (m == 0 || m == n) {
            return 1;
        }else{
            for (i=0; i <= n; i++) {
                tabla[i][0] = 1;
            }
            for (i=1; i <= n; i++) {
                tabla[i][1] = i;
            }
            for (i=2; i <= m; i++) {
                tabla[i][i] = 1;
            }
            for (i=3; i <= n; i++) {
                for (j=2; j < n; j++) {
                    if (j <= m){
                        tabla[i][j] = tabla[i-1][j-1] + tabla[i-1][j];
                    }
                }
            }
        }
        
        return tabla[num1][num2];
    }
    
    
}
