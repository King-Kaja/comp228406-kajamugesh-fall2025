package exercise1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override // Override the start method in the Application

	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(11, 12, 13, 14));
		pane.setHgap(5);
		pane.setVgap(5);
		
		// Initialize Text field variables
		TextField tfName = new TextField();
		TextField tfAddress = new TextField();
		TextField tfCity = new TextField();
		TextField tfProvince = new TextField();
		TextField tfPostal = new TextField();
		TextField tfPhone = new TextField();
		TextField tfEmail = new TextField();
		
		// Initialize radio buttons
		RadioButton rbComputer = new RadioButton("Computer Science");
        RadioButton rbBusiness = new RadioButton("Business");
        
        // Initializes combo box and course lists
        String csCourses [] = {"Python","C#","Java"};
        String busCourses [] = {"Money","Big Business", "Little Business"};
        ComboBox<String> courseBox = new ComboBox<>();
        
        // Initialize list for enrolled courses
        ObservableList<String> enrolled = FXCollections.observableArrayList();
        ListView<String> enrolledListView = new ListView<>(enrolled);

        // Actions for course box interaction
        rbComputer.setOnAction(e -> courseBox.setItems(FXCollections.observableArrayList(csCourses)));
        rbBusiness.setOnAction(e -> courseBox.setItems(FXCollections.observableArrayList(busCourses)));
        
        
        
        courseBox.setOnAction(e -> {
            String c = courseBox.getValue();
            if (c != null && !enrolled.contains(c)) enrolled.add(c);
        });
        
        // Initialize check boxes
        CheckBox cbStudent = new CheckBox("Student Council");
        CheckBox cbVolunteer = new CheckBox("Volunteer Work");
        
        // Initialize text box and display button
        Button btnDisplay = new Button("Display");
        TextArea information = new TextArea();
        
        btnDisplay.setOnAction(e -> {
            information.setText(tfName.getText() + ", " + tfAddress.getText() + ", " + tfCity.getText() + ", " + tfProvince.getText() + ", " + tfPostal.getText() + ", " + tfPhone.getText() + ", " + tfEmail.getText() +  "\n"
            		+ "Courses: " + enrolled);
        });
        
        
        
        
		
		// Place nodes in the pane
		pane.getChildren().addAll(new Label("Full Name:"), tfName);
		pane.getChildren().addAll(new Label("Address:"), tfAddress);
		pane.getChildren().addAll(new Label("City:"), tfCity);
		pane.getChildren().addAll(new Label("Province:"), tfProvince);
		pane.getChildren().addAll(new Label("Postal Code:"), tfPostal);
		pane.getChildren().addAll(new Label("Phone Number"), tfPhone);
		pane.getChildren().addAll(new Label("Email"), tfEmail);
		
		pane.getChildren().addAll(rbComputer,rbBusiness);
		pane.getChildren().addAll(courseBox);
		pane.getChildren().addAll(enrolledListView);
		
		pane.getChildren().addAll(cbStudent, cbVolunteer);
		
		pane.getChildren().addAll(btnDisplay);
		pane.getChildren().addAll(information);
		
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 1920, 1080);

		primaryStage.setScene(scene); // Place the scene in the

		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}