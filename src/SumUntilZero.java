// Sum of Even Positive and Odd Negative until user press 0

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        int temp1=0,temp2=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; ; i++) {
            System.out.println("Enter Even Positive or Odd Negative Number: ");
            int value = sc.nextInt();
            if (value > 0 && value%2==0) {
                temp1 = temp1 + value;
            }
             else if (value < 0 && value%2!=0) {
                temp2=temp2+value;
            } else if (value == 0) {
                System.out.println("Sum of Even Positive: "+temp1);
                System.out.println("Sum of Odd Negative: "+temp2);
                break;
            }
             else{
                System.out.println("Incorrect Entry...");
            }
        }
    }
}

/*
Output:
Enter Even Positive or Odd Negative Number:
2
Enter Even Positive or Odd Negative Number:
-5
Enter Even Positive or Odd Negative Number:
7
Incorrect Entry...
Enter Even Positive or Odd Negative Number:
6
Enter Even Positive or Odd Negative Number:
-1
Enter Even Positive or Odd Negative Number:
-4
Incorrect Entry...
Enter Even Positive or Odd Negative Number:
0
Sum of Even Positive: 8
Sum of Odd Negative: -6

Process finished with exit code 0

 */









