package com.example.vanierfx;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

//Made by Sahon

public class ViewShear extends Pane {


    void shear(Scene scenemenu) {

        HelloApplication Menu = new HelloApplication();
        Pane pane = new Pane();

        Shear shear = new Shear();
        shear.setX(0.5);
        shear.setY(0.5);

        Rectangle rec1 = new Rectangle(120, 60);
        rec1.setFill(Color.LIGHTGRAY);
        rec1.setStroke(Color.BLACK);

        Rectangle rec2 = new Rectangle(120 ,60);
        rec2.setStroke(Color.GRAY);
        rec2.setFill(Color.TRANSPARENT);

        rec2.getTransforms().add(shear);

        rec1.setLayoutX(95);
        rec1.setLayoutY(50);
        rec2.setLayoutX(95);
        rec2.setLayoutY(50);

        pane.getChildren().add(rec1);
        pane.getChildren().add(rec2);

        Button viewp3 = new Button("View Code");
        Button backp3 = new Button("Back");


        // Set button positions
        viewp3.setLayoutX(20);
        viewp3.setLayoutY(185);
        viewp3.setPrefSize(80, 40);

        backp3.setLayoutX(230);
        backp3.setLayoutY(185);
        backp3.setPrefSize(80, 40);

        //adding them to the pane
        pane.getChildren().add(viewp3);
        pane.getChildren().add(backp3);

        //creating scene
        Scene scenedrawingrectangle = new Scene(pane, 320, 240);

        Stage stage = new Stage();
        stage.setTitle("Shear Drawing");
        stage.setScene(scenedrawingrectangle);
        stage.show();

        // event handler to show the code snippet for part 2
        viewp3.setOnAction(event1 -> {

            Pane pv = new Pane();
            Text code = new Text("""

                                Pane pane = new Pane();

                                    Shear shear = new Shear();
                                    shear.setX(0.5);
                                    shear.setY(0.5);

                                    Rectangle rec1 = new Rectangle(120, 60);
                                    rec1.setFill(Color.LIGHTGRAY);
                                    rec1.setStroke(Color.BLACK);

                                    Rectangle rec2 = new Rectangle(120 ,60);
                                    rec2.setStroke(Color.GRAY);
                                    rec2.setFill(Color.TRANSPARENT);

                                    rec2.getTransforms().add(shear);

                                    rec1.setLayoutX(95);
                                    rec1.setLayoutY(50);
                                    rec2.setLayoutX(95);
                                    rec2.setLayoutY(50);

                                    pane.getChildren().add(rec1);
                                    pane.getChildren().add(rec2);\
                        """);

            pv.getChildren().add(code);
            Button pvback = new Button("Back");
            pvback.setPrefHeight(40);
            pvback.setPrefWidth(100);

            pvback.setLayoutX(140);
            pvback.setLayoutY(400);
            pv.getChildren().add(pvback);

            Scene scenev = new Scene(pv, 350, 450);
            stage.setTitle("Code Snippet For Shear Drawing");
            stage.setScene(scenev);
            stage.show();

            //event handler to go back to drawing 2
            pvback.setOnAction(event2 -> {

                stage.setTitle("Shear Drawing");
                stage.setScene(scenedrawingrectangle);
                stage.show();

            });

        });


        backp3.setOnAction(event2 -> {

            Pane panep3 = new Pane();
            Label conf3text = new Label("Do you want to go back? ");
            conf3text.setFont(new Font("Arial", 15));
            conf3text.setLayoutX(65);
            conf3text.setLayoutY(20);
            panep3.getChildren().add(conf3text);


            Button conf3buttonok = new Button("OK");

            conf3buttonok.setLayoutX(40);
            conf3buttonok.setLayoutY(60);
            conf3buttonok.setPrefSize(70, 50);


            Button conf3buttonno = new Button("No");

            conf3buttonno.setLayoutX(175);
            conf3buttonno.setLayoutY(60);
            conf3buttonno.setPrefSize(70, 50);

            panep3.getChildren().add(conf3buttonok);

            panep3.getChildren().add(conf3buttonno);

            conf3buttonok.setOnAction(event1 -> {

                stage.setTitle("Menu");
                stage.setScene(scenemenu);
                stage.show();

            });

            conf3buttonno.setOnAction(event1 -> {
                stage.setTitle("Shear Drawing");
                stage.setScene(scenedrawingrectangle);
                stage.show();

            });


            Scene sceneconf2 = new Scene(panep3, 300, 140);
            stage.setTitle("Confirmation Window");
            stage.setScene(sceneconf2);
            stage.show();


        });


    }

}
