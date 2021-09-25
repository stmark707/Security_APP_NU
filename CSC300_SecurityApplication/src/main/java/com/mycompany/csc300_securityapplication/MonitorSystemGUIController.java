/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc300_securityapplication;

/**
 *
 * @author stmar
 */
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MonitorSystemGUIController {

    private double xOffset = 0;
    private double yOffset = 0;
    
    @FXML
    private Button Back_Button_Home;

    @FXML
    private ImageView Caution_Symbol_1;

    @FXML
    private ImageView Caution_Symbol_2;

    
    private static Parent loadFXML(String fxml) throws IOException 
    {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        
        return fxmlLoader.load();
    }
    
    @FXML
    void Back_Button_Pressed(ActionEvent event) throws IOException {
        String fxml = "SecuritySystemMainGui";
        Scene scene = new Scene(loadFXML("SecuritySystemMainGui"), 758, 494);
        scene.setRoot(loadFXML(fxml));
        Stage newInstancestage = new Stage();
        Stage currentStage = (Stage) Back_Button_Home.getScene().getWindow();
        currentStage.close();
        scene.getStylesheets().add(getClass().getResource("Alarm_Button.css").toExternalForm());
        
          scene.setOnMousePressed(new EventHandler<MouseEvent>()
        {
             @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        }
        
        );
         scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                newInstancestage.setX(event.getScreenX() - xOffset);
                newInstancestage.setY(event.getScreenY() - yOffset);
            }
        });
        newInstancestage.initStyle(StageStyle.UNDECORATED);
        newInstancestage.initModality(Modality.APPLICATION_MODAL);
        newInstancestage.setScene(scene);
        newInstancestage.show();
       
        //Debug item
        System.out.println("This is a new stage instance");
         
      

    }

      
    
     
}

