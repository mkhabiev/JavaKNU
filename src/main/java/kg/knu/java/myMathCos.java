package kg.knu.java;

public class myMathCos {
    private static final double EPSILON = 1.0E-10;
    public static void main(String[] args) {

        double x = 1;
        // sin(x)
        int n = 1;
        double pow = x, factorial = 1, result = 0, compute = 1;

        while (compute > EPSILON){
            compute = (pow) / (factorial);
            // if (n%2==0) result += -compute; else result += compute;
            result += (n % 2 == 0) ? -compute : compute;
            factorial *= (n*2) * (n*2+1);
            pow *= x * x;
            n++;
        }
        System.out.println("sin(" + x + ") =  " + result);
        System.out.println("Math(" + x + ") = "  + Math.sin(x));

        // cos(x)
        pow = 1; factorial = 1; result = 1; compute = 1; n = 1;

        while (compute > EPSILON){
            factorial *= (n*2-1) * (n*2);
            pow *= x * x;
            compute = (pow) / (factorial);
            result += (n%2==1) ? -compute : compute;
            n++;
        }
        System.out.println("cos(" + x + ") =  " + result);
        System.out.println("Math(" + x + ") = "  + Math.cos(x));
    }
}
