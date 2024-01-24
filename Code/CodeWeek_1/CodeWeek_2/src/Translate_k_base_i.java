/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author david
 */
public class Translate_k_base_i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 4;
        if (a < b)
        {
            if (b < c)
            {
                if (c < a) System.out.println(a + " " + b + " " + c);
                else System.out.println(c + " " + b + " " + a);
            }
            else System.out.println(a + " " + c + " " + b);
        }
        else System.out.println(b + " " + a + " " + c);
        
    }    
}
