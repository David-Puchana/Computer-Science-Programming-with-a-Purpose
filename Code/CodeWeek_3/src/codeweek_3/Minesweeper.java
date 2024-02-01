public class Minesweeper {
    public static void main(String[] args) {
        
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);        
        int k = Integer.parseInt(args[2]);
        int count = 0;
        
        boolean [][] array = new boolean[m][n];
        
        while(count < k){
            int m_1 = (int) (Math.random() * m);
            int n_1 = (int) (Math.random() * n);
                       
            if(!array[m_1][n_1]){
                array[m_1][n_1] = true;
                count++;
            }
        }
                
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n; j++){
                count = 0;
                if(array[i][j]){
		    if(j == n - 1)System.out.print("*"); 			
		    else System.out.print("*  ");                
                } else {
                    for(int x = -1; x < 2;x++){
                        for(int y = -1; y < 2; y++){
                            if(i + x < 0 || i + x >= m || j + y < 0 || j + y >= n)continue;
                            if(array[i + x][j + y])count++;                                                                        
                        }                   
                    }
		
		    if(j == n - 1)System.out.print(count); 	
                    else System.out.print(count + "  ");                                                          
                }                                
            }
            System.out.println("");
        }            
   }
    
}
