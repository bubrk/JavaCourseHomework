package module2;

import java.util.Arrays;

/**
 * This is homework for Module 2 of JavaCore course.
 *
 * "Input: array with size=10 can be one of two data types: Int and double. Elements of the array is a natural number. Calculate:
 *   - sum
 *   - min/max
 *   - max positive
 *   - multiplication
 *   - modulus of first and last element
 * as a result you should have 6 methods"
 */

    public class Main {

    // main method which initializes array and call methods
    public static void main(String[] args) {
        //initializing new array
        double[] anArray = {1,2,3,4,5,6,7,8,9,-10};

        System.out.println("Array: "+ Arrays.toString(anArray));
        System.out.println("Sum of elements = "+getSum(anArray));
        System.out.println("The maximum is "+getMax(anArray));
        System.out.println("The minimum is "+getMin(anArray));
        if (getMaxPositive(anArray)==-1) System.out.println("There is no positive elements in array");
            else System.out.println("The maximum positive is "+getMaxPositive(anArray));
        System.out.println("The result of multiplication = "+getMultiplication(anArray));
        System.out.println("Modules of the first and last elements: "+Arrays.toString(getModules(anArray)));
    }


    //This method returns sum of elements
    static double getSum(double[] anArray){
        double sum=0; //sum of elements

        for (int i=0;i<anArray.length;i++){
            sum+=anArray[i];
        }

        return sum;
    }


    //This method returns maximum of elements
    static double getMax(double[] anArray){
        double max=anArray[0]; //the maximum

        for (int i=1;i<anArray.length;i++){
            max=Math.max(anArray[i],max);
        }

        return max;
    }


    //This method returns minimum of elements
    static double getMin(double[] anArray){
        double min=anArray[0]; //the minimum

        for (int i=1;i<anArray.length;i++){
            min=Math.min(anArray[i],min);
        }

        return min;
    }


    //This method returns maximum of positive elements or -1 if there is no positive elements in array
    static double getMaxPositive(double[] anArray){
        double maxPositive=-1; //the maximum positive

        for (int i=0;i<anArray.length;i++){
            if (anArray[i]>0)
                maxPositive=Math.max(anArray[i],maxPositive);
        }

        return maxPositive;
    }


    //This method returns multiplication of elements
    static double getMultiplication(double[] anArray){
        double result=anArray[0]; //the result of multiplication

        for (int i=1;i<anArray.length;i++){
            result*=anArray[i];
        }

        return result;
    }

    //This method returns modules of the first and last elements
    static double[] getModules(double[] anArray){
        double[] result=new double[2];

        result[0]=Math.abs(anArray[0]); //returns module of the first element
        result[1]=Math.abs(anArray[anArray.length-1]); //returns module of the last element

        return result;
    }

}
