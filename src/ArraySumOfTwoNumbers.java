/*
Requirement :
int[] num={2,5,7,4,3,1};
Input: 11
Output: 2,3
 */

import java.util.Scanner;

public class ArraySumOfTwoNumbers {
    public static void main(String[] args) {
        int[] num = {2, 5, 6, 4, 1, 9};
        int i, j, v1 = 0, v2 = 0;
        int exist = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum value: ");
        //   System.out.println(num.length);
        int Value = sc.nextInt();
        for (i = 0; i < num.length - 1; i++) {
            for (j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == Value) {
                    exist = 1;
                    v1 = i;
                    v2 = j;
                    System.out.println("Sum of Index [" + v1 + "] and [" + v2 + "] is " + Value);
                    break;
                }
            }
        }
        if (exist == 0) {
            System.out.println("Error give correct value");
        }
    }
}

/*
Output:
Enter the sum value:
10
Sum of Index [2] and [3] is 10
Sum of Index [4] and [5] is 10

Process finished with exit code 0
 */