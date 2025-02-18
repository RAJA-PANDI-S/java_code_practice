package RandomCodeLearnings;

import java.util.Scanner;

public class ArrayDigitCount {
    public static void main(String[] args) {

        int[] num = {123, 4567, 45678, 5987, 45, 89076, 11111};
        int[] cnt = new int[num.length];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit value: ");
        int Value = sc.nextInt();
        //   System.out.println(num[2]);
        //  System.out.println(num.length);
        //Count the digits
        for (int i = 0; i < num.length; i++) {
            int digits = 0;
            int temp = num[i];
            while (temp != 0) {
                temp = temp / 10;
                digits++;
            }
            cnt[i] = digits;
        }
        for (int a = 0; a < cnt.length; a++) {
            //    System.out.println("Digit of Index "+a+" is :" + cnt[a]);
        }

        for (int j = 0; j < num.length; j++) {
            if (cnt[j] == Value) {
                count++;
            }
        }
        System.out.println("Total " + Value + " digit number given in an array is: " + count);
    }
}

/*
 Output:
 Enter the Digit value:
 5
 Total 5 digit number given in an array is: 3

 Process finished with exit code 0
*/



