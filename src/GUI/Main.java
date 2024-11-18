package GUI;

import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application  {
    Stage window;
    Button btn1 ;
    Scene scene;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainWindow) {
            window = mainWindow;
            window.setTitle("Title of Window");

            TextField nameInput = new TextField();

            btn1 = new Button();
            btn1.setText("Click Me");
            btn1.setOnAction(e ->  //lambda expression
                System.out.println(nameInput.getText()));

            VBox layout = new VBox();
            layout.setPadding(new Insets(20,20,20,20));
            layout.getChildren().addAll(nameInput,btn1);

        scene = new Scene(layout,300,250);

        window.setScene(scene);

        window.show();

    }


}
