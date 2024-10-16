package RandomCodeLearnings;

import java.util.Scanner;

    public class NumberSeriesHackerRank {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int q = scanner.nextInt();  // Number of queries

            for (int i = 0; i < q; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int n = scanner.nextInt();

                // Generate and print the series
                int currentValue = a;
                for (int j = 0; j < n; j++) {
                    currentValue += b * Math.pow(2, j);
                    System.out.print(currentValue + " ");
                }
                System.out.println();  // Move to the next line after each series
            }

            scanner.close();
        }
    }


/*
Problem Explanation
You need to generate a specific series of numbers for multiple queries, based on given inputs.

Input Format
The first line contains an integer q:

q represents the number of queries you will process.
The next q lines each contain three space-separated integers:

a: The starting value of the series.
b: The multiplier that determines the increments in the series.
n: The number of terms in the series to generate.
Output Format
For each query, you need to print a series of n integers, all in one line, separated by spaces.

Sample Input:

Copy code
2
0 2 10
5 3 5
Explanation:

First Query (0 2 10):

a = 0, b = 2, n = 10
Series calculation:
Term 1:
0
+
2
×
2
0
=
0
+
2
=
2
0+2×2
0
 =0+2=2
Term 2:
2
+
2
×
2
1
=
2
+
4
=
6
2+2×2
1
 =2+4=6
Term 3:
6
+
2
×
2
2
=
6
+
8
=
14
6+2×2
2
 =6+8=14
Term 4:
14
+
2
×
2
3
=
14
+
16
=
30
14+2×2
3
 =14+16=30
Continue this until you get 10 terms...
The series will be: 2 6 14 30 62 126 254 510 1022 2046
Second Query (5 3 5):

a = 5, b = 3, n = 5
Series calculation:
Term 1:
5
+
3
×
2
0
=
5
+
3
=
8
5+3×2
0
 =5+3=8
Term 2:
8
+
3
×
2
1
=
8
+
6
=
14
8+3×2
1
 =8+6=14
Term 3:
14
+
3
×
2
2
=
14
+
12
=
26
14+3×2
2
 =14+12=26
Term 4:
26
+
3
×
2
3
=
26
+
24
=
50
26+3×2
3
 =26+24=50
Term 5:
50
+
3
×
2
4
=
50
+
48
=
98
50+3×2
4
 =50+48=98
The series will be: 8 14 26 50 98
Sample Output:

yaml
Copy code
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

 */