package Arrays;

public class powXandN {
    public static double myPow(double x, int n) {
        double result = Math.pow(x,n);
        return result;
    }

    public static void main(String[] args) {
        int n = 2 ;
        double x = 3;

        System.out.println(myPow(x, n));
    }
}
