/*  Write a program to find all n-digit numbers with an equal sum where n varies
    from 1 to 9 and sum <= 81 (Maximum possible sum in a 9-digit number). Eg: 5–digit
    numbers with sum 42 are:
    69999 78999 79899 79989 79998 87999 88899 88989 88998 89799 89889 89898 89979 89988 89997
    96999 97899 97989 97998 98799 98889 98898 98979 98988 98997 99699 99789 99798 99879 99888
    99897 99969 99978 99987 99996
    */

import java.util.*;
class SumNum{
    public static int add(int x){
        int val = x;
        int sum = 0;
        while(val>0) {
            int temp = val;
            int rem = temp % 10;
            sum  = sum + rem;
            val = val / 10;
        }
    return sum;
    }
}
public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n(n varies from 1 to 9): ");
        int n = input.nextInt();
        if(n>9 || n<1){
            System.out.println("Please enter the value of n from 1 to 9!!");
        }
        else{
            int min = (int) Math.pow(10,n-1);
            int max = (int) (Math.pow(10,n));
            for( int i = min ; i<max; i++){
                if(SumNum.add(i)<=81){
                    System.out.print(i + " ");
                }
            }
        }

    }
}
