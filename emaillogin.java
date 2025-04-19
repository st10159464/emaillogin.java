 

public class EmailLogin { 

    public static void main(String[] args) { 

        // Hardcoded email and password 

        String correctEmail = "user@example.com"; 

        String correctPassword = "password123"; 

  

        // Prompt user for email and password 

        String email = JOptionPane.showInputDialog(null, "Enter your email:"); 

        String password = JOptionPane.showInputDialog(null, "Enter your password:"); 

  

        // Check credentials 

        if (email != null && password != null && 

            email.equals(correctEmail) && password.equals(correctPassword)) { 

            JOptionPane.showMessageDialog(null, "Login successful! Welcome."); 

        } else { 

            JOptionPane.showMessageDialog(null, "Login failed! Invalid email or password.", "Error", JOptionPane.ERROR_MESSAGE); 

        } 

    } 

} 

 

//Unit test

import org.junit.jupiter.api.Test; 

import static org.junit.jupiter.api.Assertions.*; 

  

public class EmailLoginTest { 

  

    @Test 

    public void testCorrectCredentials() { 

        assertTrue(EmailLogin.validateLogin("user@example.com", "password123")); 

    } 

  

    @Test 

    public void testIncorrectEmail() { 

        assertFalse(EmailLogin.validateLogin("wrong@example.com", "password123")); 

    } 

  

    @Test 

    public void testIncorrectPassword() { 

        assertFalse(EmailLogin.validateLogin("user@example.com", "wrongpass")); 

    } 

  

    @Test 

    public void testNullInputs() { 

        assertFalse(EmailLogin.validateLogin(null, null)); 

    } 

  

    @Test 

    public void testEmptyInputs() { 

        assertFalse(EmailLogin.validateLogin("", "")); 

    } 

} 
