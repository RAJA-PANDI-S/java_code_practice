package RandomCodeLearnings;

import java.util.Scanner;

public class CountNumOfOccurances {
    public static void main(String[] args) {
        int[] num = {2, 12, 5, 9, 0, 9, 5, 6, 4, 1, 9};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int value = sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]==value){
                count++;
            }
        }
        System.out.println("Number "+value+" occurs "+count+" time(s) in a given array");
    }
}

/*
Output:
=======
Enter the Number:
9
Number 9 occurs 3 time(s) in a given array

Process finished with exit code 0
 */