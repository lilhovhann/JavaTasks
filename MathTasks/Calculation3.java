public class Calculation3 {

    public static int x = 1;
    public static int y = 7;
    public static int a = 2;
    public static int b = 4;
    public static int c = 6;

    public static void main(String args[]) {

        //exercise 5
        double exercise5 = (Math.pow(2, x) - 5) / (Math.pow(3, y) + 2) +
                (Math.log(Math.pow(Math.abs(x) + 1, 4) + Math.pow(y, 2))) / Math.log(2);
        System.out.println("Exercise 5: \nThe Answer is " + exercise5);

        System.out.println();

        //exercise 7
        double exercise7 = Math.pow(Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 5) + 4, 7) +
                Math.sin(Math.cos(x + y));
        System.out.println("Exercise 7: \nThe Answer is " + exercise7);

        //exercise 26
        System.out.println();

        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println("Exercise 26:\n1");
        } else {
            System.out.println("Exercise 26:\n2");
        }

        //exercise 27
        System.out.println();

        if (c - b == b - a) {
            System.out.println("Exercise 27:\n" + true);
        } else {
            System.out.println("Exercise 27:\n" + false);
        }

        //exercise 28
        System.out.println();

        if (c / b == b / a) {
            System.out.println("Exercise 28:\n" + true);
        } else {
            System.out.println("Exercise 28:\n" + false);
        }

        //exercise 29
        System.out.println();

        if (a < b && b < c) {
            System.out.printf("Exercise 29:\nThe numbers from low to high are %d, %d, %d", a, b, c);
        } else if (a < c && c < b) {
            System.out.printf("Exercise 29:\nThe numbers from low to high are %d, %d, %d", a, c, b);
        } else if (b < a && a < c) {
            System.out.printf("Exercise 29:\nThe numbers from low to high are %d, %d, %d", b, a, c);
        } else if (b < c && c < a) {
            System.out.printf("Exercise 29:\nThe numbers from low to high are %d, %d, %d", b, c, a);
        } else if (c < b && b < a) {
            System.out.printf("Exercise 29:\nThe numbers from low to high are %d, %d, %d", c, b, a);
        } else if (c < a && a < b) {
            System.out.printf("Exercise 29:\nThe numbers from low to high are %d, %d, %d", c, a, b);
        }

        //exercise 75
        System.out.println();
        for (double x = -Math.PI; x <= Math.PI; x += Math.PI / 8) {
            double exercise75 = Math.pow(Math.sin(x), 2) + Math.cos(x);
            System.out.printf("x is %.2f, Y is %.3f\n", x, exercise75);
        }


        //exercise 111
        System.out.println();
        int n = 3;
        double result;
        double sum5 = 0;
        for (int i = 0; i <= n; i++) {
            result = (Math.pow(x, 4 * i + 1)) / (4 * i + 1);
            sum5 += result;
        }
        System.out.println("Exercise 111:\nresult is " + sum5);
    }
}
