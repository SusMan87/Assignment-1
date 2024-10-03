//Assignment 1
//Vinith Kanagaratnam
//Sahon Shaha
//Obaidah Kanjou Agha


package com.example.vanierfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        Pane menu = new Pane();

        Button viewsvgshape = new Button("View SVG Shape");
        Button viewpathshape = new Button("View Path Shape");
        Button viewsheartransform = new Button("View Shear Transform");
        Label menulabel = new Label("Menu");
        Paint blueColor = Paint.valueOf("blue");

        menulabel.setLayoutX(220);
        menulabel.setLayoutY(0);
        menulabel.setFont(new Font("Arial", 25));
        menulabel.setTextFill(blueColor);
        menu.getChildren().add(menulabel);

        viewsvgshape.setLayoutX(20);
        viewsvgshape.setLayoutY(80);
        viewsvgshape.setPrefSize(140, 60);
        menu.getChildren().add(viewsvgshape);

        viewpathshape.setLayoutX(180);
        viewpathshape.setLayoutY(80);
        viewpathshape.setPrefSize(140, 60);
        menu.getChildren().add(viewpathshape);

        viewsheartransform.setLayoutX(340);
        viewsheartransform.setLayoutY(80);
        viewsheartransform.setPrefSize(140, 60);
        menu.getChildren().add(viewsheartransform);

        Scene scenemenu = new Scene(menu, 500, 200);


        //event handler for view svg shape

        viewsvgshape.setOnAction(event -> {


            ViewSVG ViewSVG = new ViewSVG();

            ViewSVG.svg(scenemenu);

        });


        //event handler for view path shape

        viewpathshape.setOnAction(eventmenu -> {

            ViewPath ViewPath = new ViewPath();
            ViewPath.vp(scenemenu);


        });


        //event handler for shear transform

        viewsheartransform.setOnAction(event -> {
            ViewShear shear = new ViewShear();
            shear.shear(scenemenu);


        });

        stage.setTitle("Menu");
        stage.setScene(scenemenu);
        stage.show();

    }



    public static void main(String[] args) {

        launch();
    }
}

