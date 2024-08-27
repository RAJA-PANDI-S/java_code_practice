/*
Requirement :
int[] num={2,5,7,4,3,1};
Input: 11
Output: 2,3
 */

import java.util.Scanner;

public class ArraySumOfTwoNumbers {
    public static void main(String[] args) {
        int[] num={2,5,6,4,1,9};
        int i,j=0,v1=0,v2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum value: ");
     //   System.out.println(num.length);
        int Value = sc.nextInt();
                for (i=0;i<num.length-1;i++){
                    for (j=0;j<num.length-1;j++){
                       if (num[i]+num[j]==Value){
                           v1=i;
                           v2=j;
                           break;
                       }
                    }
                }
        System.out.println("Sum of Value "+ i +" and "+ j +" is " + Value);
        System.out.println("Sum of Index ["+ v1 +"] and ["+ v2 +"] is " + Value);
    }
}
