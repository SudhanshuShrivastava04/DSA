public class Power {
    // Binary Exponentiation
    public double myPow(double x, int n) {
        double ans = 1.0;
        int nn = n;
        if (n < 0) {
            nn = -1 * nn;
        }
        while (nn > 0) {
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                x *= x;
                nn /= 2;
            }
        }
        return n<0 ? 1/ans : ans;
    }
}
