import java.lang.Math;
import java.sql.SQLOutput;

public class Calculation {
    public static int x = -1;
    public static int y = 0;
    public static int a = 5;
    public static int b = 4;
    public static int c = 8;
    public static int d = 7;
    public static int n = 256;



    public static void main(String args[]){

        double exercise1 = (y+1)*(x+Math.pow((Math.pow(x,2)+1),6)*Math.sin(Math.pow(x,2)-3)-Math.tan(y));
        System.out.println("Exercise 1: The answer is "+exercise1);

        double exercise3 = Math.cos(Math.abs(Math.pow(x,2)-y)/(Math.pow(x,2)+Math.pow(y,2)))/Math.sin(Math.abs(Math.pow(x,2)-y)/(Math.pow(x,2)+Math.pow(y,2))) + Math.log(Math.pow(x,2)+1)/Math.log(Math.pow(x,2)+1);
        System.out.println("Exercise 3: The answer is "+exercise3);

        //Exercise 11

        double exercise11;
        if(Math.pow(a,2)+Math.pow(b,2)>5){
             exercise11 = 3*Math.exp(a-x)+Math.log(Math.pow(a,2)+Math.pow(b,2)+5)/Math.log(Math.pow(a,2)+Math.pow(b,2)+5);
        }else if(Math.pow(a,2)+Math.pow(b,2)<1){
            exercise11 = Math.pow(Math.tan(a+b),4);
        }else{
            exercise11 = -3;
        }
        System.out.println("Exercise 11: The answer is "+exercise11);

        //Exercise 12

        double exercise12;
        if(x>=-5 && x<=5){
            exercise12 = Math.pow(1+Math.pow(a,2),6);
        }else if(x>5){
            exercise12 = Math.cos(Math.pow(Math.log(Math.abs(x)+Math.pow(x,8)),2));
        }else{
            exercise12 = a;
        }
        System.out.println("Exercise 12: The answer is "+exercise12);

        //Exercise 21
        if(a>b && a>c){
            System.out.println("Exercise 21: The maximum of a,b & c is a = "+a);
        }else if(b>a && b>c){
            System.out.println("Exercise 21: The maximum of a,b & c is b = "+b);
        }else{
            System.out.println("Exercise 21: The maximum of a,b & c is c = "+c);
        }

        //Exercise 31

        if(a>b && a>c && a>d){
            System.out.println("Exercise 31: The maximum of a,b & c is a = "+a);
        }else if(b>a && b>c && b>d){
            System.out.println("Exercise 31: The maximum of a,b & c is b = "+b);
        }else if(c>a && c>b && c>d){
            System.out.println("Exercise 31: The maximum of a,b & c is c = "+c);
        }else if(d>a && d>b && d>c){
            System.out.println("Exercise 31: The maximum of a,b & c is d = "+d);
        }

        //Exercise 41

        int z;
        if(Math.pow(x,2)+Math.pow(y,2) >= 1 && Math.pow(x,2)+Math.pow(y,2) <= 4 ){
            z = 0;
        }else{
            z = x+y;
        }
        System.out.println("Exercise 41: z = "+z);

        //Exercise 42

        int k;
        if(Math.pow(x,2)+Math.pow(y,2) >= 1 && x/2+y/2<=1){
            k = x + (int)Math.pow(y,2);
        }else{
            k = 5*x;
        }
        System.out.println("Exercise 42: k = "+k);

        //Exercise 71
        double h;
        System.out.println("Exercise 71:");
        for(h = 2.4; h<=7.6; h+=0.2){
            int Y = (int)Math.tan(2*h+Math.pow(h,2));
            System.out.printf("h = %.2f,\t Y is %d \n", h, Y);
        }

        System.out.println("//////////////////////////////");
        //Exercise 72
        double g;
        System.out.println("Exercise 72:");
        for(g = -5.4; g<=1.2; g+=0.4){
            double G = Math.pow(Math.pow(Math.cos(x),2)/Math.pow(Math.sin(x),2),2);
            System.out.printf("g = %.2f, \t G is %.2f \n",g, G);
        }

        System.out.println("//////////////////////////////");
        //Exercise 74

        double s;
        System.out.println("Exercise 74:");
        for(s= -3.8; s<=5.4; s+=0.3){
            double S = Math.pow(2, x+4);
            System.out.printf("s = %.2f, \t S is %.2f \n",s, S);
        }


        System.out.println("//////////////////////////////");
        //Exercise 76
        System.out.println("Exercise 76:");
        double V;
        if(x>0){
            V =  Math.pow(x,2)+4*Math.pow(x,8);
        }else{
            for(x = -5; x<=5; x+=2){
                V = 0;
                System.out.println("V = "+ V);
            }
        }


        System.out.println("//////////////////////////////");
        //Exercise 151
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                sum +=i;

            }
        }
        System.out.println("Exercise 151: Sum is "+sum);

        //Exercise 153
        int sum1 = 0;
        for(int j = 1; j<=n; j++){
            if(n%j == 2){
                sum1+=j;
            }
        }
        System.out.println("Exercise 153: Sum is "+sum1);

        //Exercise 157
        int sum2 = 0;
        for(int i = 0; i<=999; i++){
            if(i!=0){
                if(i%5!=0){
                    sum2+=i;
                }
            }

        }
        System.out.println("Exercise 157: Sum is "+sum2);

    }
}
