/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc300_securityapplication;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HomepageSecurityGuiController {
    private double xOffset = 0;
    private double yOffset = 0;
    int counter = 0;
    
    @FXML
    private Button System_Config_Button;

    @FXML
    private Button Monitor_System_Button;
    
    @FXML
    private Rectangle Rectangle_Background_Node;
    
    @FXML
    private Button Enable_Alarm_Button;

  
   
    @FXML
    void Enable_Alarmed_Pressed(ActionEvent event) throws IOException {
     
        counter++; 
      if (counter % 2 != 0)
      {
      Rectangle_Background_Node.setFill(Color.FIREBRICK);
      Enable_Alarm_Button.setText("Disarm Alarm");
      
      
      
      }  
      System.out.println(counter);
      
      if (counter % 2 == 0)
      {
          Rectangle_Background_Node.setFill(Color.web("#1abc9c"));
          Enable_Alarm_Button.setText("Enable Alarm");
          String fxml = "UserPasswordGUI_DisableAlarm";
        Scene scene = new Scene(loadFXML("UserPasswordGUI_DisableAlarm"), 758, 494);
        scene.setRoot(loadFXML(fxml));
        Stage newInstancestage = new Stage();
        Stage currentStage = (Stage) System_Config_Button.getScene().getWindow();
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
    
    private static Parent loadFXML(String fxml) throws IOException 
    {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        
        return fxmlLoader.load();
    }
    
    
    @FXML
    void Monitor_System_Devices_Pressed(ActionEvent event) throws IOException 
    {
        String fxml = "MonitorSystemGui";
        Scene scene = new Scene(loadFXML("MonitorSystemGui"), 758, 494);
        scene.setRoot(loadFXML(fxml));
        Stage newInstancestage = new Stage();
        Stage currentStage = (Stage) Monitor_System_Button.getScene().getWindow();
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
    

    @FXML
    void System_Configuration_Pressed(ActionEvent event) throws IOException 
    {
        String fxml = "UserPasswordGUI";
        Scene scene = new Scene(loadFXML("UserPasswordGUI"), 758, 494);
        scene.setRoot(loadFXML(fxml));
        Stage newInstancestage = new Stage();
        Stage currentStage = (Stage) System_Config_Button.getScene().getWindow();
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


