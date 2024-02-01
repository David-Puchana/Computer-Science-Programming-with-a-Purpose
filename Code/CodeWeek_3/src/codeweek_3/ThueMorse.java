public class ThueMorse {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);    
        int base = (int) Math.ceil(Math.log(n) / Math.log(2));
        
        boolean[] thueMorse = new boolean[(int) Math.pow(2, base)];
        
        for (int i = 1; i < thueMorse.length; i *= 2) {
            for (int j = 0; j < i; j++) {
                thueMorse[i + j] = !thueMorse[j];                
            }
        }     
                
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == n - 1) System.out.print(thueMorse[i] == thueMorse[j] ? "+" : "-");
                else System.out.print(thueMorse[i] == thueMorse[j] ? "+  " : "-  ");
            }
            System.out.println();
        }        
    }  
}
