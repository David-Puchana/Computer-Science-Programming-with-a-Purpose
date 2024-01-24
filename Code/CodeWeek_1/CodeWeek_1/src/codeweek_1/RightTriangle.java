public class RightTriangle {
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        boolean triangle; 
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        
        triangle = (a > 0 && b >0 && c > 0) && ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a));
        System.out.print(triangle);
    }    
}
