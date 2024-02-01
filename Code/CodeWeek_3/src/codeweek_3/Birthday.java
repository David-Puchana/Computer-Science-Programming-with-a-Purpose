public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);        
        int [] frequency = new int[n + 1];
        
        for(int i = 0; i < trials; i++){
            int numPerson = 0;            
            boolean [] room = new boolean[n + 1];                        
            while(true){
                int birthday = (int) (Math.random() * (double) (n));
                if(room[birthday])break;                
                numPerson++;                
                room[birthday] = true;
            }            
            frequency[numPerson]++;            
        }                      
        
        double probability = 0.0;
        int count = 0;
        
        while(probability < 0.5){            
            probability = probability + (double) frequency[count]/(double)trials;
            System.out.printf("%-10d%-10d%.4f%n", (count + 1), frequency[count],probability);                 
            count++;
        }                       
                        
    }        
}
