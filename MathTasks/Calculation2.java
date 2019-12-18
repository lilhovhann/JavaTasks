import java.sql.SQLOutput;

public class Calculation2 {
    public static int x = 2;
    public static int y = 7;
    public static int a = 5;
    public static int b = 2;
    public static int c = 4;
    public static int d = 8;
    public static int z = 10;
    public static int n = 10;



    public static void main(String args[]) {
        //Exercise 2
        double exercise2 = (Math.pow(x, 2) - 4) / (Math.pow(y, 2) + 2) + Math.pow(2, Math.sin(Math.sqrt(Math.pow(x, 2) + 1)));
        System.out.println("Exercise 2: The answer is " + exercise2);

        //Exercise 13
        System.out.println();
        double Y;
        if (a + Math.abs(b) < -5) {
            Y = Math.exp(Math.abs(a + x)) * Math.pow(Math.cos(a + x + b), 2);
        } else if (a + Math.abs(b) > 2) {
            Y = Math.pow(Math.atan(a + x), 1 / 3);
        } else {
            Y = a + Math.abs(b);
        }
        System.out.println("Exercise 13: Y = " + Y);

        //Exercise 18
        System.out.println();
        double Z;
        if (x >= 1 && x <= 7) {
            Z = Math.pow(Math.abs(x) + 2 * Math.abs(z), 1 / 4) + Math.exp(Math.abs(x + 1));
        } else {
            Z = Math.pow(Math.pow(Math.tan(x + z), 7), 2);
        }
        System.out.println("Exercise 18: Z = " + Z);

        //Exercise 23
        System.out.println();
        if (a == 1 || b == 1 || c == 1) {
            System.out.println("Exercise 23: " + true);
        } else {
            System.out.println("Exercise 23: " + false);
        }

        //Exercise 24
        System.out.println();
        if (a == 2 && b == 2 || b == 2 && c == 2 || a == 2 && c == 2) {
            System.out.println("Exercise 24: " + true);
        } else {
            System.out.println("Exercise 24: " + false);
        }

        //Exercise 25
        System.out.println();
        if (a + b > c || a + c > b || c + b > a) {
            System.out.println("Exercise 25: y = 1");
        } else {
            System.out.println("Exercise 25: y = 2");
        }

        //Exercise 33
        System.out.println();
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            System.out.println("Exercise 33: " + true);
        } else {
            System.out.println("Exercise 33: " + false);
        }

        //Exercise 73
        System.out.println();
        System.out.println("Exercise 73: ");
        for (double x = 7.5; x < 12.5; x += 0.2) {
            double F = Math.pow(x + 1, 2);
            System.out.printf("x is %8.2f, \t F is %.2f \n", x, F);
        }

        //Exercise 131
        System.out.println();
        int P;
        System.out.println("Exercise 131: ");
        for (int k = 1; k <= 4; k++) {
            if (x > 1) {
                P = (int)Math.pow(3 * x, k + 1);
            } else {
                P = 5 * x + (int)Math.pow(k, 7);
            }
            System.out.println("P is " + P);
        }


        //Exercise 135
        System.out.println();
        System.out.println("Exercise 135:");
        int W;
        for (int k = 1; k <= 4; k++) {
            if (x > 1) {
                W = (int)Math.pow(x, k - 1);
            } else if (x < 3) {
                W = x * (int)Math.pow(k, 3);
            } else {
                W = (int)Math.pow(10, -6);
            }
            System.out.println("W is " + W);
        }

        //Exercise 136
        System.out.println();
        int L;
        System.out.println("Exercise 136:");
        for(int k = 2; k<=8; k++){
            if(x<7 && x > 3){
                L = (int)Math.pow(9*x,k);
            }else{
                L = 8*x +(int)Math.pow(k,3);
            }
            System.out.println("L is " + L);
        }

        //Exercise 138
        System.out.println();
        System.out.println("Exercise 138:");
        int R;
        for(int k  = 2; k<=7; k++){
            if(x<6){
                R = (int)Math.pow(x,k)+k;
            }else{
                R = (int)Math.log(k)/(int)Math.log(5);
            }
            System.out.println("R is " + R);
        }

        // Exercise 156
        System.out.println();
        System.out.println("Exercise 156:");
        int mul = 0;
        for(int i = 10;  i<99; i++){
            if(i%3 ==0 && i%5 ==0){
                mul *= i;
            }
        }
        System.out.println("Mul is "+mul);


        //Exercise 164
        System.out.println();
        System.out.println("Exercise 164: ");
        for(int i = 100; i<999; i++){
            if(Math.sqrt(i)>n){
                System.out.println("That number is "+i);
                break;
            }
        }



    }
}
