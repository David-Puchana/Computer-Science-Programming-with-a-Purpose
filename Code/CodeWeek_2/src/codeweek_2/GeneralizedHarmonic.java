/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeweek_2;

/**
 *
 * @author david
 */
public class GeneralizedHarmonic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        int n, r;
        double h = 0;
        
        n = Integer.parseInt(args[0]);
        r = Integer.parseInt(args[1]);
        
        for(int i = 1; i<= n; i++ ){
            h += (double)1/Math.pow(i, r);
        }
        
        System.out.print(h);                        
    }
    
}
