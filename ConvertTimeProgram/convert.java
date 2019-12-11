import java.util.*;

public class convert {
    public static void main(String args[]){
        Scanner input  = new Scanner(System.in);
        int number = input.nextInt();
        int minute = (int)Math.floor(number/60);
        int second = number-minute*60;
        int hour = (int)Math.floor(minute/60);
        minute = minute-hour*60;
        int day = (int)Math.floor(hour/24);
        hour = hour-day*24;

        System.out.printf("%d is %d days, %d hours, %d minutes, %d seconds", number, day, hour, minute, second);
    }
}
