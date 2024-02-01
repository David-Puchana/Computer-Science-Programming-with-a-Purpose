public class DiscreteDistribution {
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a =  new int[args.length - 1]; 
        int m = Integer.parseInt(args[0]);        
        int [] s = new int [a.length + 1]; 
        
        for (int i = 0; i < a.length;i++){
            a[i] = Integer.parseInt(args[i + 1]); 
            s[i + 1] = a[i] + s[i];
        }
             
        int r;
        for (int j = 0; j < m; j++){            
            r = (int)(Math.random()* s[s.length - 1]);            
            for(int k = 0; k < s.length;k++){
                if(r >= s[k] && r < s[k + 1]){
                    System.out.print((k + 1) + " "); 
                    break;
                }
            }            
        }        
    }
    
}
