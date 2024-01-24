public class GreatCircle {
    public static void main(String[] args) {
        // TODO code application logic here
        double x_1, x_2, y_1, y_2, a_0, b_0, a_1, b_1, sqtr, distance;
        x_1 = Math.toRadians(Double.parseDouble(args[0])) ;
        y_1 = Math.toRadians(Double.parseDouble(args[1]));
        x_2 = Math.toRadians(Double.parseDouble(args[2]));        
        y_2 = Math.toRadians(Double.parseDouble(args[3]));
        
        a_0 = ((x_2 - x_1) / 2.0);
        b_0 = ((y_2 - y_1) / 2.0);
        
        a_1 = Math.sin(a_0); a_1 = a_1 * a_1;
        b_1 = Math.cos(x_1) * Math.cos(x_2) * Math.sin(b_0) * Math.sin(b_0);
        sqtr = Math.sqrt(a_1 + b_1);
        
        distance = 2.0 * 6371.0 * Math.asin(sqtr);
        
        System.out.print(distance + " kilometers");
    }   
}
