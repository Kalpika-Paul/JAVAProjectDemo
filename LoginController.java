/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package aviationmanagement;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void login() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Your authentication logic goes here
        if (username.equals("Aviation CEO") && password.equals("ceo")) {
            System.out.println("Login successful!");
            
             FXMLLoader loader = new FXMLLoader(getClass().getResource("EmptyScreen.fxml"));
            try {
                Parent root = loader.load();

                // Show the empty screen
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Empty Screen");
                stage.show();

                // Close the login window
                usernameField.getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            
        else if (username.equals("General Manager") && password.equals("min")) {
            System.out.println("Login successful!");
            // Navigate to another scene or perform other actions upon successful login
        }
        else if (username.equals("Director") && password.equals("max")) {
            System.out.println("Login successful!");
            // Navigate to another scene or perform other actions upon successful login
        }
        else if (username.equals("Accountant") && password.equals("new")) {
            System.out.println("Login successful!");
            // Navigate to another scene or perform other actions upon successful login
        }
        else if (username.equals("Supply Chain") && password.equals("123")) {
            System.out.println("Login successful!");
        }
      else if (username.equals("Strategy and Business") && password.equals("1234")) {
            System.out.println("Login successful!");
        }
        
        else {
            System.out.println("Login failed. Please check your credentials.");
            // Display error message or take appropriate action for failed login
        }
        
       
        
    }
}
