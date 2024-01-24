/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeweek_2;

/**
 *
 * @author david
 */
public class RandomWalker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r, step = 0, x = 0, y = 0;
        double p;        
        
        r = Integer.parseInt(args[0]);
        
        System.out.println("(" + x +", " + y + ")");
        while(Math.abs(x) + Math.abs(y) < r){
            p = Math.random();
            if(p <= 0.25) x++;
            else if (p <= 0.5) x--;
            else if (p <= 0.75) y++;
            else if (p <= 1) y--;
            
            System.out.println("(" + x +", "+y+")");
            step++;
        }
        System.out.println("step = "+ step);                
    }
    
}
