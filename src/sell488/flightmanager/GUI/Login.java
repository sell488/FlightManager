package sell488.flightmanager.GUI;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static java.awt.SystemColor.text;

public class Login extends Application{

    @Override
    public void start(Stage stage) throws Exception{
        Text text = new Text (10, 40, "Hello!");
        text.setFont(new Font(40));
//        Scene Login = new Scene();

        stage.setTitle("Hello!");
//        stage.setScene(Login);
        stage.show();
    }
 }
