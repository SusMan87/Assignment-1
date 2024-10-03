package com.example.vanierfx;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//Made By Vinith

public class ViewPath extends Pane {

    void vp (Scene scenemenu) {
        HelloApplication Menu = new HelloApplication();
        Pane p = new Pane();

        Path path = getPath();

        p.getChildren().add(path);


        Button viewp2 = new Button("View Code");
        Button backp2 = new Button("Back");


        // Set button positions
        viewp2.setLayoutX(20);
        viewp2.setLayoutY(185);
        viewp2.setPrefSize(80, 40);

        backp2.setLayoutX(230);
        backp2.setLayoutY(185);
        backp2.setPrefSize(80, 40);

        //adding them to the pane
        p.getChildren().add(viewp2);
        p.getChildren().add(backp2);

        //creating scene
        Scene scenedrawingpath = new Scene(p, 320, 240);

        Stage stage = new Stage();
        stage.setTitle("Path Drawing");
        stage.setScene(scenedrawingpath);
        stage.show();


        // event handler to show the code snippet for part 2
        viewp2.setOnAction(eventviewp2 -> {

            Pane pv = new Pane();
            Text code = new Text("""


                                Pane p = new Pane();
                               \s
                                Path path = new Path(new MoveTo(0, 0),
                                        new HLineTo(160),\s
                                        new VLineTo(100),\s
                                        new MoveTo(0, 0),\s
                                        new VLineTo(100),
                                        \s
                                        new CubicCurveTo(0, 100, 40, 130, 80, 100),
                                        new CubicCurveTo(80, 100, 120, 70, 160, 100));


                                path.setLayoutX(75);
                                path.setLayoutY(50);

                                p.getChildren().add(path);
                        """);

            pv.getChildren().add(code);
            Button pvback = new Button("Back");
            pvback.setPrefHeight(40);
            pvback.setPrefWidth(100);

            pvback.setLayoutX(140);
            pvback.setLayoutY(300);
            pv.getChildren().add(pvback);

            Scene scenev = new Scene(pv, 350, 350);

            stage.setScene(scenev);
            stage.setTitle("Code Snippet For Path Drawing");
            stage.show();

            //event handler to go back to drawing 2
            pvback.setOnAction(eventbacktodrawing2 -> {

                stage.setScene(scenedrawingpath);
                stage.setTitle("Path Drawing");
                stage.show();

            });

        });


        backp2.setOnAction(event -> {

            Pane panep2 = new Pane();
            Label conf2text = new Label("Do you want to go back? ");
            conf2text.setFont(new Font("Arial", 15));
            conf2text.setLayoutX(65);
            conf2text.setLayoutY(20);
            panep2.getChildren().add(conf2text);


            Button conf2buttonok = new Button("OK");

            conf2buttonok.setLayoutX(40);
            conf2buttonok.setLayoutY(60);
            conf2buttonok.setPrefSize(70, 50);




            Button conf2buttonno = new Button("No");

            conf2buttonno.setLayoutX(175);
            conf2buttonno.setLayoutY(60);
            conf2buttonno.setPrefSize(70, 50);

            panep2.getChildren().add(conf2buttonok);

            panep2.getChildren().add(conf2buttonno);

            conf2buttonok.setOnAction(event1 -> {
                stage.setTitle("Menu");
                stage.setScene(scenemenu);
                stage.show();

            });

            conf2buttonno.setOnAction(event1 -> {
                stage.setTitle("Path Drawing");
                stage.setScene(scenedrawingpath);
                stage.show();

            });


            Scene sceneconf2 = new Scene(panep2, 300, 140);

            stage.setScene(sceneconf2);
            stage.setTitle("Confirmation Window");
            stage.show();


        });

    }
    private static Path getPath() {
        Path path = new Path(new MoveTo(0, 0),
                new HLineTo(160), //only in Y because it's a vertical line
                new VLineTo(100), //only in X because it's a horizontal line
                new MoveTo(0, 0), //going back to start point to draw another line
                new VLineTo(100),

                // the cubic curve is split into 2 of for the upwards curve and downwards
                //starting points    control points    end points
                new CubicCurveTo(0, 100, 40, 130, 80, 100),
                new CubicCurveTo(80, 100, 120, 70, 160, 100));

        path.setLayoutX(90);
        path.setLayoutY(45);
        return path;
    }

}
