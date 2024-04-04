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

public class FlightMananagementController {

    @FXML
    private Button backToDashboardButton;

    @FXML
    protected void goBackToDashboard() {
        try {
            // Load the FXML file for the dashboard screen
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/aviationmanagement/EmptyScreen.fxml"));
            Parent root = loader.load();

            // Show the dashboard screen
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Dashboard");
            stage.show();

            // Close the flight management screen window
            Stage flightManagementStage = (Stage) backToDashboardButton.getScene().getWindow();
            flightManagementStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}