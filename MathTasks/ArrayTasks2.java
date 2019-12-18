import javax.swing.tree.VariableHeightLayoutCache;
import java.io.OptionalDataException;
import java.util.*;

class ArrayTasks {
    public double arr1[];
    public double arr2[];
    public char arr3[];
    public char[] newArray;

    //Exercise 266
    int exercise266() {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                sum1 += arr1[i];
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if (arr2[j] % 2 == 0) {
                sum2 += arr2[j];
            }
        }
        int exercise266 = sum1 - sum2;
        return exercise266;
    }

    //Exercise 267
    int exercise267() {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 7 == 0) {
                sum1 += arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 7 == 0) {
                sum2 += arr2[i];
            }
        }
        int exercise267 = sum1 + sum2;
        return exercise267;
    }

    //Exercise270;
    int exercise270() {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += Math.pow(arr1[i], 2);
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += Math.pow(arr2[i], 2);
        }
        int result = sum1 + sum2;
        return result;
    }

    //exercise 271
    int exercise271() {
        int counter = 0;
        char symbol = 'a';
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == symbol) {
                counter++;
            }
        }
        return counter;
    }

    //exercise 272
    boolean exercise272() {
        int counter = 0;
        boolean t = false;
        char chr = 'b';

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == chr) {
                counter++;
            }
            if (counter >= arr3.length / 2) {
                t = true;
            }
        }
        return t;
    }

    //exercise 273
    int exercise273() {
        int index = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == 's') {
                index += i;
            }
        }

        return index;
    }

    //exercise 274

    int exercise274() {
        int counterIndex = 0;
        int counter = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > 'h') {
                counterIndex += i;
                counter++;
            }
        }
        int meanAnswer = counterIndex / counter;
        return meanAnswer;
    }

    //exercise 277

    char[] exercise277() {

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] != 'd') {
                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = arr3[i];
                    System.out.println("this is method printing " + newArray[j]);
                }
            }
        }

        return newArray;
    }

}

public class ArrayTasks2 {
    public static void main(String args[]) {
        ArrayTasks taskObj = new ArrayTasks();
        taskObj.arr1 = new double[]{5, 85, 7, -74, 0, 8.5, 7.8};
        taskObj.arr2 = new double[]{8, 5646, 845, -85, -4.4};
        taskObj.arr3 = new char[]{'s', 'd', 'o', 'm', 'b', 'e', 'h', 'b', 'a', 's', 't'};
        taskObj.newArray = new char[]{' '};

        System.out.println("Exercise 266: The answer is " + taskObj.exercise266());
        System.out.println("Exercise 267: The answer is " + taskObj.exercise267());
        System.out.println("Exercise 270: The answer is " + taskObj.exercise270());
        System.out.println("Exercise 271: The answer is " + taskObj.exercise271());
        System.out.println("Exercise 272: The answer is " + taskObj.exercise272());
        System.out.println("Exercise 273: The answer is " + taskObj.exercise273());
        System.out.println("Exercise 274: The answer is " + taskObj.exercise274());
        Arrays.toString(taskObj.exercise277());


    }
}
