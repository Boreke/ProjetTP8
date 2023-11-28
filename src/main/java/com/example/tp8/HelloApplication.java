package com.example.tp8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);*/
        exercice2(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    private static Stage exercice1(Stage stage){
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
        stage.setTitle("Exercice1");
        stage.setScene(scene);
        return stage;
    }
    private static Stage exercice2(Stage stage){

        Label nb1= new Label("chiffre 1");
        TextField nb1Field=new TextField();
        Label resultat= new Label("resultat: ");
        Label nb2= new Label("chiffre 2");
        TextField nb2Field=new TextField();

        Button add=new Button("+");
        Button substract=new Button("-");
        Button multiply=new Button("x");
        Button divide=new Button("/");
        add.setOnAction(e->{
            int a=Integer.parseInt(nb1Field.getText());
            int b=Integer.parseInt(nb2Field.getText());
            int result=a+b;
            resultat.setText("resultat: "+result);
        });
        substract.setOnAction(e->{
            int a=Integer.parseInt(nb1Field.getText());
            int b=Integer.parseInt(nb2Field.getText());
            int result=a-b;
            resultat.setText("resultat: "+result);
        });
        multiply.setOnAction(e->{
            int a=Integer.parseInt(nb1Field.getText());
            int b=Integer.parseInt(nb2Field.getText());
            int result=a*b;
            resultat.setText("resultat: "+result);
        });
        divide.setOnAction(e->{
            int a=Integer.parseInt(nb1Field.getText());
            int b=Integer.parseInt(nb2Field.getText());
            int result=a/b;
            resultat.setText("resultat: "+result);
        });
        HBox ligne1=new HBox(10,nb1Field,add,substract);
        HBox ligne2=new HBox(10,nb2Field,multiply,divide);
        HBox ligne3=new HBox(resultat);
        ligne1.setPadding(new Insets(5,0,10,0));
        ligne2.setPadding(new Insets(5,0,10,0));
        VBox layout= new VBox(nb1,ligne1,nb2,ligne2,ligne3);
        layout.setPadding(new Insets(20,800,5,10));
        Scene scene= new Scene(layout,1280,720);
        stage.setTitle("Exercice1");
        stage.setScene(scene);
        return stage;
    }
}