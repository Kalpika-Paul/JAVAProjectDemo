/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package aviationmanagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;

public class EmptyScreenController {

    @FXML
    private Button backButton;

    @FXML
    private Button flightManagementButton;

    @FXML
    protected void goBackToLogin() {
        try {
            // Load the FXML file for the login screen
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/aviationmanagement/Login.fxml"));
            Parent root = loader.load();

            // Show the login screen
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Login");
            stage.show();

            // Close the empty screen window
            Stage emptyScreenStage = (Stage) backButton.getScene().getWindow();
            emptyScreenStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void goToFlightManagement() {
        try {
            // Load the FXML file for the flight management screen
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/aviationmanagement/FlightMananagement.fxml"));
            Parent root = loader.load();

            // Show the flight management screen
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Flight Management");
            stage.show();

            // Close the empty screen window
            Stage emptyScreenStage = (Stage) flightManagementButton.getScene().getWindow();
            emptyScreenStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
