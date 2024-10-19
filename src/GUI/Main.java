package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application  {

    Button btn1 ;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainWindow) {

            mainWindow.setTitle("Title of Window");
            btn1 = new Button();
            btn1.setText("Click Me");
            btn1.setOnAction(e -> {
                System.out.println("Hello from lambda expression.");
                System.out.println("Lines on lambda is very amazing");
            });
            hello hello = ()->{
                System.out.println("Hello from the interface implementation");
            };
            StackPane layout = new StackPane();
            layout.getChildren().add(btn1);
            layout.setVisible(true);

        Scene scene = new Scene(layout,300,250);

        mainWindow.setScene(scene);
        mainWindow.show();
    }


}
