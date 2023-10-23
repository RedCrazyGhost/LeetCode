package 每日一题;

public class Question50 {
    public double myPow(double x, int n) {
        double o = x;
        if (x == 0) {
            return 0;
        } else {
            if (n == 0||x==1) {
                return 1;
            }
            if (n < 0) {
                x = 1 / x;
                o = x;
                n *= -1;
            }
            for (int i = 1; i < n; i++) {
                x *= o;
            }
        }
        return x;
    }
}
