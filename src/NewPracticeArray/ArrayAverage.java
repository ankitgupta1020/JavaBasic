package NewPracticeArray;

import java.util.Arrays;

public class ArrayAverage {
    //Write a Java program to calculate the average value of array elements
    public static void main(String[] args) {
        //Input Array
        int[] numbers= {10, 20, 30, 40, 50 };
        // calculate all the sum of array element
        int sum  =0;
        for(int i = 0; i< numbers.length; i++)
        {
            sum += numbers[i];

        }

        // calculate the average value
        double average = (double) sum / numbers.length;

        // Displaay the result
        System.out.println("Array element: " + Arrays.toString(numbers));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);
    }
}
/*Explanation:

We declare an array of integers called numbers and initialize it with some values.
We use a for loop to iterate through each element in the array and add it to the sum variable.
After the for loop, we divide the sum by the number of elements in the array (numbers.length) to calculate the average value. Note that we cast sum to double to ensure that the division result is a decimal number.
Finally, we display the original array elements, the sum of the array elements, and the average value of the array elements using System.out.println() statements.

 */