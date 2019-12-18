import java.util.*;

class Task {
    public double arr[];
    public double arr1[];
    public int k;

    //This method counts mean of given array's positive numbers
    int countMeanOfArray() {
        int sumOfTerms = 0;
        int numberOfTerms = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumOfTerms += arr[i];
                numberOfTerms++;
            }
        }
        int meanOfArray = sumOfTerms / numberOfTerms;
        return meanOfArray;
    }

    //This method counts root mean square of given array's positive numbers
    int countRootMeanSquare() {
        int sumOfSquareTerms = 0;
        int numberOfSqTerms = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumOfSquareTerms += Math.pow(arr[i], 2);
                numberOfSqTerms++;
            }
        }
        int rootMeanSquare = (int) Math.sqrt(sumOfSquareTerms / numberOfSqTerms);
        return rootMeanSquare;
    }

    //Exercise 224
    int exercise224() {
        int sumOf3Terms = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < k) {
                sumOf3Terms += Math.pow(arr[i], 3);
            }
        }
        return sumOf3Terms;
    }

    //Exercise 228
    int exercise228() {
        int sum228 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                sum228 += arr[i];
            }
        }
        return sum228;
    }

    //Exercise 230
    int exercise230() {
        int sumOfSquareRoots = 0;
        int numbersOfSquareRoots = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sumOfSquareRoots += Math.pow(arr[i], 2);
                numbersOfSquareRoots++;
            }
        }
        int exercise230 = sumOfSquareRoots / numbersOfSquareRoots;
        return exercise230;
    }

    //Exercise 233
    int exercise233() {
        int sum233 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum233 += arr[i];
            }
        }
        return sum233;
    }

    //Exercise 240
    int exercise240() {
        int num240 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0) {
                num240++;
            }
        }
        return num240;
    }

    //Exercise 251
    double exercise251() {
        double max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
            }
        }
        return max;
    }

    //Exercise 257
    int exercise257() {
        double max1 = arr[0];
        int numOfMax = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max1 = arr[i + 1];
            }
        }
        for (int j = 0; j < arr1.length; j++) {
            if (arr[j] == max1) {
                numOfMax = j;
                break;
            }
        }
        return numOfMax;
    }

    //Exercise 261
    int exercise261(){
        int counter =0 ,counter2 = 0, meanSum1 =0, meanSum2 =0;
        for(int i = 0; i<arr.length; i++){
            meanSum1 += arr[i];
            counter++;
        }
        for(int j = 0; j<arr1.length; j++){
            meanSum2 += arr[j];
            counter2++;
        }
        int mulmean1 = meanSum1/counter;
        int mulmean2 = meanSum2/counter2;
        int finalResult = mulmean1*mulmean2;
        return finalResult;
    }

    //Exercise 269
    int exercise269(){
        int doubleCounter = 0;
        int oddCounter = 0;
        for(int i = 0; i<arr.length; i++){
            if(i%2==0 && i!=0){
                doubleCounter +=arr[i];
            }
        }
        for(int j = 0; j<arr1.length; j++){
            if(j%2!=0 && j!=0){
                oddCounter+=arr1[j];
            }
        }
        int answer = doubleCounter+oddCounter;
        return answer;
    }
}


public class ArrayTasks {
    public static void main(String args[]) {
        Task taskObj = new Task();
        taskObj.arr = new double[]{5, 7, 8, 96, 59, 56, 85, 96};
        taskObj.arr1 = new double[]{4.85, 8, 96, 75, 1, 4.5};
        taskObj.k = 4;

        System.out.println("The mean of given array's positive numbers is " + taskObj.countMeanOfArray());
        System.out.println("The root mean square of given array's positive numbers is " + taskObj.countRootMeanSquare());
        System.out.println("Exercise 224: The answer is " + taskObj.exercise224());
        System.out.println("Exercise 228: The answer is " + taskObj.exercise228());
        System.out.println("Exercise 230: The answer is " + taskObj.exercise230());
        System.out.println("Exercise 233: The answer is " + taskObj.exercise233());
        System.out.println("Exercise 240: The answer is " + taskObj.exercise240());
        System.out.println("Exercise 251: The answer is " + taskObj.exercise251());
        System.out.println("Exercise 257: The answer is " + taskObj.exercise257());
        System.out.println("Exercise 261: The answer is " + taskObj.exercise261());
        System.out.println("Exercise 269: The answer is " + taskObj.exercise269());


    }
}
