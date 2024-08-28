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
                    System.out.println(num);
                }
            }
        }
    }
