package HackerEarth.January_Circuits_20;
/*
    Distribute chocolates
    Max. Marks: 90

        You have c number of chocolates that you want to distribute between your n students.
        The intelligence level of the students is not the same, therefore, you decide to
        distribute the chocolates in such a way that a smarter student gets strictly more chocolates
        than the ones who are less smarter.
        The difference between the chocolates received by any two adjacent students must be exactly one.
        Formally, if the least intelligent student gets k chocolates, then others must get
        k+1, k+2, k+3, k+3,....... At the same time, your task is to minimize the number of chocolates
        that are left (if any) after  distributing those among students. Determine the minimum number of
        chocolates left.

    Note
        It is mandatory to give chocolates to everyone if it is possible to do so. In other words,
        it is not possible that some students are getting chocolates and others are not.

    Input format
        First line: T denoting the number of test cases T
        For each test case (next T lines):
        First line: Two space-separated integers 'c' and 'n'

    Output format
        For each test case, print the minimum number of chocolates left in a new line.

    Constraints
        1 <= T <= 10^5
        1 <= c <= 10^18
        1 <= n <= 10^9

    SAMPLE INPUT
        2
        20 3
        13 5

    SAMPLE OUTPUT
        2
        13

    Explanation
        In the first test case the 3 sutdents will get 5, 6, 7 chocolates. This will make the total count to 18.
        Thus 20 - 18 = 2 chocolates remain.
        In the second test case, there is no valid way to distribute the chocolates. So all the chocolates remain.

 */

import java.util.Scanner;

public class Distribute_chocolates {
    public static void main(String ar[]){
        Scanner z = new Scanner(System.in);
        long t,n,min;
        long c;
        t = z.nextInt();
        while (t > 0){
            try {
                c = z.nextLong();
                n = z.nextLong();
            }
            catch (Exception E){
                return;
            }
            min = (n * (n + 1)) / 2;
            if (c < min){
                System.out.println(c);
            }
            else {
                    c = c - min;
                    System.out.println(c % n);
            }
            t--;
        }
    }
}
