/*  Given an array, find the total number of inversions of it. If (i < j) and (A[i] >
    A[j]), then pair (i, j) is called an inversion of an array A. Write a program to
    identify the number of inversion in the array and count all such pairs in the array.
    Sample input: Input: A[] = [1, 9, 6, 4, 5].
*/

import java.util.*;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Give the size of an array: ");
        int n = input.nextInt();
        int count = 0;
        int[] A = new int[n];
        for(int k=0; k<n;k++){
            A[k] = input.nextInt();
        }
        System.out.println("Given Array= " + Arrays.toString(A));
        System.out.println("Pairs causing inversion are listed below:");
        for(int i = 0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                if(i<j && A[i]>A[j]){
                    count++;
                    System.out.println("[" + i + "," + j+ "]");
                }
            }
        }
        System.out.println("Total number of inversion =" + count);
    }
}
