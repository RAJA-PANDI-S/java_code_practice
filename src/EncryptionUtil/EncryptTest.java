package EncryptionUtil;

public class EncryptTest {

        public static void main(String[] args) {
            try {
                // Step 1: Define original username and password
                String originalUsername = "raja.official.2712@gmail.com";  // Replace with your actual username
                String originalPassword = "17suca16";  // Replace with your actual password

                System.out.println("Original Username: " + originalUsername);
                System.out.println("Original Password: " + originalPassword);

                // Step 2: Encrypt the username and password
                String encryptedUsername = EncryptDecryptCode.encrypt(originalUsername);
                String encryptedPassword = EncryptDecryptCode.encrypt(originalPassword);
                System.out.println("Encrypted Username: " + encryptedUsername);
                System.out.println("Encrypted Password: " + encryptedPassword);

                // Step 3: Decrypt the encrypted username and password
                String decryptedUsername = EncryptDecryptCode.decrypt(encryptedUsername);
                String decryptedPassword = EncryptDecryptCode.decrypt(encryptedPassword);

                // Step 4: Print the decrypted (original) values
                System.out.println("Decrypted Username (Original): " + decryptedUsername);
                System.out.println("Decrypted Password (Original): " + decryptedPassword);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

