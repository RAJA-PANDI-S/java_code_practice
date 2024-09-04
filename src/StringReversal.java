import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        String str = "Java Program";
       // System.out.println(str.length());
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

      /*  Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        StringBuilder stb = new StringBuilder(st);

        stb.reverse();
        System.out.println(stb); */
/*
Output:
margorP avaJ
Process finished with exit code 0
*/
