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
    public static String sumOnesBinary(int num) {        
        if(num == 0){
            return "+";
        } else if (num == 1){
            return "-";
        } else {
            int result = 0;                        
            while(num >= 1 ){
                if(num % 2 != 0){                
                  result++;  
                } 
                num = num / 2;
            }             
            return (result % 2 == 0) ? "+":"-";                    
        }        
    }

    public static void main(String[] args) {

        int m = 8;    
        int count = 0;
                                                 
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(j < m - 1) System.out.print(sumOnesBinary(count) + "  ");                
                else System.out.print(sumOnesBinary(count));                 
                count++;
            }
            System.out.println("");
        }        
    }    
}