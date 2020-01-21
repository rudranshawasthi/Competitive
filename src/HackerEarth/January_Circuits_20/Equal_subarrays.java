package HackerEarth.January_Circuits_20;
/*
Equal subarrays
Max. Marks: 100

    You are given an array of N non-negative integers[A1,A2.......,An] , and a non-negative integer K. A subarray is an
    array composed of a contiguous block of original array elements. You can perform the following
    operation on a subarray:
    Increase each element of this subarray by a non-negative number such that the total sum of all
    the increments does not exceed K. You must make all the elements of this subarray equal.
    Determine the maximum length of a subarray in which all the elements can be made equal by
    performing the mentioned operation.

    Input format
        First line: An integer N denoting the number of elements in the array
    Second line: An integer K
    Third line: N space-separated integers where Ai denotes the elements of the array

    Output format
    Print the maximum length of a subarray in which all the elements can be made equal by performing the operation.

    Constraints
    1 <= N <= 10^5
    0 <= K <= 10^9
    1 <= Ai <= 10^9


    SAMPLE INPUT
        5
        9
        1 4 9 3 6

    SAMPLE OUTPUT
        3

    Explanation:
        Let's consider some VALID subarrays :
        {1, 4} => {4, 4} in 3 additions (1+3 and 4+0)
        {4, 9} => {9, 9} in 5 additions (4+5 and 9+0)
        {3, 6} => {6, 6} in 3 additions (3+3 and 6+0)
        {9, 3, 6} => {9, 9, 9} in 9 additions (9+0 and 3+6 and 6+3)
        In this case, maximum valid subarray length = 3
        Some INVALID subarrays:
        {4, 9, 3} => {9, 9, 9} requires 5 + 6 = 11 additions (4+5 and 9+0 and 3+6) which is greater than K

 */


import java.util.Scanner;

public class Equal_subarrays {
    public static void main(String ae[]){
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int t = z.nextInt();
        int i,max=0,j,dif=0,md=0,id = 0,mi = 0;
        int[] arr = new int[n];
        for (i = 0;i < n; i++){
            try {
                arr[i] = z.nextInt();
            }
            catch (Exception E){
                continue;
            }
        }
        ini: for (i=0;i<n;i++) {
            if (mi < n - i) {
                max = arr[i];
                id = 0;
                for (j = i + 1; j < n; j++) {
                    id++;
                    if (arr[j] > max) {
                        md = arr[j] - max;
                        max = arr[j];
                        dif = dif + (md * id);
                    } else {
                        dif = dif + (max - arr[j]);
                    }
                    if (id > mi) {
                        mi = id;
                    }
                    if (dif > t) {
                        id = 0;
                        dif = 0;
                        continue ini;
                    }
                }
            }
        }
        if(id == n-1)
            System.out.println(mi+1);
        else
            System.out.println(mi);
    }
}




