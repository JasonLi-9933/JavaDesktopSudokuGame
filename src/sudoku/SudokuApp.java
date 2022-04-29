package sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApp extends Application {
    private IUserInterfaceContract.View uiView;

    @Override
    public void start(Stage primaryStage) throws Exception{
        uiView = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiView);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
