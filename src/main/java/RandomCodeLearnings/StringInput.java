package RandomCodeLearnings;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();  //Read the leftover new line /n
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

/*
22
34.445
hello world
String: hello world
Double: 34.445
Int: 22

Process finished with exit code 0


 */



/*
Explanation :

why there are two nextLine()? what will happen if we use one?

The reason for using two nextLine() calls in the code is due to the way the Scanner class handles input.
Let's break it down:

How Scanner Works:
nextInt() and nextDouble() methods read the integer and double values, respectively, from the input.
However, they do not consume the newline character (\n) that is produced when you press "Enter" after typing a number.
This leftover newline character remains in the input buffer after reading the integer or double.
Why Two nextLine() Calls?

First nextLine() Call:
This call is used to consume the leftover newline character from the buffer that was produced
when you entered the number. If this is not done, the subsequent nextLine() call (which is supposed to read
the actual string input) will read the newline character instead of waiting for the user to input the string.

Second nextLine() Call:
This call actually reads the string input from the user.
What Will Happen If You Use Only One nextLine()?
If you only use one nextLine() after calling nextInt() or nextDouble(), the nextLine() will consume
the leftover newline character, and the string input will never be read.
For example:


int intValue = scanner.nextInt();
double doubleValue = scanner.nextDouble();
// only one nextLine() call here
String stringValue = scanner.nextLine(); // This will read the leftover newline, not the actual string

System.out.println("String: " + stringValue); // Output will be empty
In this case, stringValue will be an empty string because the nextLine() call just consumed
the leftover newline and did not wait for actual input.

Summary:
Two nextLine() calls: The first one clears the leftover newline, and the second one reads the actual string input.
One nextLine() call: The program may incorrectly process the input, leading to an empty string or other unexpected
behavior.


Why nextDouble() Doesn't Read the Newline:
Token-Oriented: nextDouble() is token-oriented, meaning it reads only the next token that can be parsed
as a double (e.g., 3.14), stopping as soon as it has successfully read this token.
Delimiter Left in Buffer: The method doesn't consume the delimiter (such as whitespace or newline)
that follows the token because it stops reading as soon as it has the required numeric input.

Why nextLine() Reads the Newline:
Line-Oriented: nextLine() is line-oriented, meaning its purpose is to read an entire line of input,
including any and all characters up to and including the newline character (\n).
Newline as a Delimiter: When nextLine() encounters the leftover newline in the buffer,
it treats it as the end of the current line and returns whatever is before it
(which could be an empty string if there’s nothing before the newline).
 */