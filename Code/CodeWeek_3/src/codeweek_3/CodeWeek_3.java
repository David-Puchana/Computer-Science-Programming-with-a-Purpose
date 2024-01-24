/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeweek_3;

/**
 *
 * @author david
 */
public class CodeWeek_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] a = new int[10];

        for (int i = 0; i < 10; i++){
            a[i] = 9 - i;
            System.out.println(a[i]);
        }
        
        for (int j = 0; j < 10; j++){
            System.out.print(j + " " + a[j] + " ");
            a[j] = a[a[j]];
            System.out.println(a[j]);
        }                     
    }
    
}
