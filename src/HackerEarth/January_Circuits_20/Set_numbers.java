package HackerEarth.January_Circuits_20;

/*
Set numbers
Max. Marks: 100

    You are given the binary representation of a number. You must consider the highest number of set bits in the
    binary representation to complete your task. For example,
    is represented as in binary and it contains four set bits (1-bits). You are also given a number and your
    task is to determine the number that is less than or equal to and contains the maximum number of set bits
    in its binary representation.
    In other words, print a number that is less than or equal to  such that the number of set bits in the
    binary representation of must be maximum

    Input format
        First line: An integer denoting the number of test cases
    For each test case:
        First line: An integer

    Output format
        For each test case, print the answer on a new line denoting a number
        that is less than or equal to  such that the number of set bits in the binary representation of  must be maximum.

    Constraints
        1<=t<=1000
        1<=N<=10^9

    SAMPLE INPUT
        1
        345

    SAMPLE OUTPUT
        255



 */

import java.util.Scanner;

public class Set_numbers {
    public static void main(String ar[]){
        Scanner z = new Scanner(System.in);
        int t = z.nextInt();
        int i,b=2;
        int n;
        while (t>=0){
            try {
                n = z.nextInt();
            }
            catch (Exception E){
                return;
            }
            while(b<=n || n == b-1){
                b = b*2;
            }
            b = b /2;
            System.out.println(b-1);
            b = 2;
            t--;
        }
    }
}
