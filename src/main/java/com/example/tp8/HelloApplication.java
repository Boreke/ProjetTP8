package com.example.tp8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);*/
        Label name= new Label("Nom et prénom");
        TextField nameField=new TextField();

        Label age= new Label("mot de passe");
        TextField ageField=new TextField();

        Button submit=new Button("<Submit");
        Button clear=new Button("<Clear");
        VBox layout= new VBox(50);
        submit.setOnAction(e->{
            Alert alertWindow=new Alert(Alert.AlertType.INFORMATION);
            alertWindow.setContentText("name: "+ nameField.getText()+"\npassword: "+ageField.getText());
            alertWindow.show();
        });
        clear.setOnAction(e->{
            nameField.setText("");
            ageField.setText("");
        });
        layout.setPadding(new Insets(20,800,5,10));
        layout.getChildren().addAll(name,nameField,age,ageField,submit,clear);
        Scene scene= new Scene(layout,1280,720);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}