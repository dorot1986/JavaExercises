package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-25.
 */

/*From: https://codility.com/programmers/lessons/2-arrays/cyclic_rotation/

 A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.
For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.
Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.*/


public class Exercise11 {
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
            System.out.println("Enter integer K (the array will be rotate K times):");
            int K = sc.nextInt();
            Exercise11 example = new Exercise11();
            example.solution(A, K);
        }
        catch(InputMismatchException exception){
            System.out.println("Incorrect data!");
        }
        sc.close();
    }


    public int[] solution(int[] A, int K){
        int[] B = new int[A.length];
        for (int i=0; i<=A.length-1; i++) {
            if (i<=K%A.length-1){
                B[i] = A[A.length - K%A.length + i];
            }
            else{
                B[i]=A[i-K%A.length];
            }
            System.out.print(B[i]);
        }
        return B;
    }
}
