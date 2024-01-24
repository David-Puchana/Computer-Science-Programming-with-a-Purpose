/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeweek_2;

/**
 *
 * @author david
 */
public class BandMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        int n, width;
                
        n = Integer.parseInt(args[0]);
        width = Integer.parseInt(args[1]);
                
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((j >= i - width && j <= i + width) && j < n - 1)System.out.print("*  ");
                else if(j <= i + width && j == n - 1) System.out.print("*");                  
                else if(j == n - 1) System.out.print("0");                                
                else System.out.print("0  ");
                
            }            
            System.out.println("");
        }                
    }
    
}
