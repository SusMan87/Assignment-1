package com.example.vanierfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


//Made by Obaidah

public class ViewSVG extends Pane{


        void svg (Scene scenemenu) {

            HelloApplication Menu = new HelloApplication();

            SVGPath svgPath = new SVGPath();

            String path = "M300 75 L225 75 C195 90, 195 135, 225 150, L300 150 C270 135, 270 90, 300 75 Z";

            svgPath.setContent(path);
            svgPath.setLayoutX(-85);
            svgPath.setLayoutY(-10);
            svgPath.setFill(Color.WHITE);
            svgPath.setStroke(Color.BLACK);
            svgPath.setStrokeWidth(1);

            Button viewp1 = new Button("View Code");
            Button backp1 = new Button("Back");


            // Set button positions
            viewp1.setLayoutX(20);
            viewp1.setLayoutY(185);
            viewp1.setPrefSize(80, 40);

            backp1.setLayoutX(230);
            backp1.setLayoutY(185);
            backp1.setPrefSize(80, 40);

            //adding them to the pane

            Pane pane = new Pane(svgPath,viewp1,backp1);
            Scene scenesvgdrawing = new Scene(pane,320, 240);
            pane.getChildren().addAll();

            Stage stage = new Stage();
            stage.setTitle("SVGPath Drawing");
            stage.setScene(scenesvgdrawing);
            stage.show();


            viewp1.setOnAction(event1 -> {
                Pane pv = new Pane();
                Text code = new Text("""


                                SVGPath svgPath = new SVGPath();

                                    String path = "M300 75 L225 75 C195 90, 195 135, 225 150,\s
                                    L300 150 C270 135, 270 90, 300 75 Z";
                                   \s
                                    svgPath.setContent(path);
                                    svgPath.setLayoutX(-85);
                                    svgPath.setLayoutY(-10);
                                    svgPath.setFill(Color.WHITE);
                                    svgPath.setStroke(Color.BLACK);
                                    svgPath.setStrokeWidth(1);\
                        """);

                pv.getChildren().add(code);
                Button pvback = new Button("Back");
                pvback.setPrefHeight(40);
                pvback.setPrefWidth(100);

                pvback.setLayoutX(140);
                pvback.setLayoutY(220);
                pv.getChildren().add(pvback);

                Scene scenev = new Scene(pv, 360, 270);

                stage.setScene(scenev);
                stage.setTitle("Code Snippet For SVG Drawing");
                stage.show();

                //event handler to go back to drawing 2
                pvback.setOnAction(eventbacktodrawing2 -> {

                    stage.setScene(scenesvgdrawing);
                    stage.setTitle("SVG Drawing");
                    stage.show();

                });

            });

            backp1.setOnAction(event1 -> {

                Pane panep1 = new Pane();
                Label conf1text = new Label("Do you want to go back? ");
                conf1text.setFont(new Font("Arial", 15));
                conf1text.setLayoutX(65);
                conf1text.setLayoutY(20);
                panep1.getChildren().add(conf1text);


                Button conf1buttonok = new Button("OK");

                conf1buttonok.setLayoutX(40);
                conf1buttonok.setLayoutY(60);
                conf1buttonok.setPrefSize(70, 50);


                Button conf1buttonno = new Button("No");

                conf1buttonno.setLayoutX(175);
                conf1buttonno.setLayoutY(60);
                conf1buttonno.setPrefSize(70, 50);

                panep1.getChildren().add(conf1buttonok);

                panep1.getChildren().add(conf1buttonno);

                conf1buttonok.setOnAction(event10 -> {
                    stage.setTitle("Menu");
                    stage.setScene(scenemenu);
                    stage.show();

                });

                conf1buttonno.setOnAction(event2 -> {
                    stage.setTitle("SVG Drawing");
                    stage.setScene(scenesvgdrawing);
                    stage.show();

                });


                Scene sceneconf1 = new Scene(panep1, 300, 140);

                stage.setScene(sceneconf1);
                stage.setTitle("Confirmation Window");
                stage.show();


            });


        }


    }

