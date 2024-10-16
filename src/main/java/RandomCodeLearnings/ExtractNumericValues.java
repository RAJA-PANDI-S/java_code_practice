package RandomCodeLearnings;

public class ExtractNumericValues {
    public static void main(String[] args) {
        String[] st = {"ab12fg", "23yuh","h567abc","qewr"};
        for (int j = 0; j < st.length; j++) {
            String s = st[j];
            StringBuilder num = new StringBuilder(); //to store the numeric values

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);  // Retrieve each character from string
                if (Character.isDigit(c)) {
                    num.append(c);  // Append the digit
                }
            }
            if (num.length() > 0) {
                System.out.println("Numeric values from "+ st[j] +" is "+ num);
            }
        }
    }
}

/*
Output:

Numeric values from ab12fg is 12
Numeric values from 23yuh is 23
Numeric values from h567abc is 567

Process finished with exit code 0
 */