package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*
A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

        For example, in array A such that:
        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9

        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

        For example, given array A such that:
        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9

        the function should return 7, as explained in the example above.

        Assume that:

        N is an odd integer within the range [1..1,000,000];
        each element of array A is an integer within the range [1..1,000,000,000];
        all but one of the values in A occur an even number of times.

        Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

        Elements of input arrays can be modified.
*/


public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array of integers (A):");
        try {
            int n = sc.nextInt();
            int[] A = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i <= n - 1; i++) {
                A[i] = sc.nextInt();
            }
            Exercise12 example = new Exercise12();
            example.solution(A);
        }
        catch(InputMismatchException exception){
            System.out.println("Incorrect data!");
        }
        sc.close();
    }

    public void solution(int[] A){
        int[] numberOfOccurence = new int[A.length];
        for (int j=0; j<A.length; j++){
            for (int k=0; k<A.length; k++){
                if (A[j]==A[k]){
                    numberOfOccurence[j]=numberOfOccurence[j]+1;
                }
            }
        }

        int numberOfElementsUnpaired = 0;
        for (int i=0; i<A.length; i++){
            if (numberOfOccurence[i]%2!=0){
                numberOfElementsUnpaired = numberOfElementsUnpaired+1;
            }
        }
        if (numberOfElementsUnpaired==0){
            System.out.println("Array does not contain unpaired elements.");
        }
        else{
            System.out.println("Array elements that left unpaired:");
            for (int i=0; i<A.length; i++) {
                if (numberOfOccurence[i] % 2 != 0) {
                    System.out.println(A[i]);
                }
            }
        }

    }
}
