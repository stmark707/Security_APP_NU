/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc300_securityapplication;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class UserPasswordGUIController_DisableAlarm
{
    
    private double xOffset = 0;
    private double yOffset = 0;
    
    
    
    @FXML
    private Button Login_Button;

    @FXML
    private TextField User_Name_TextBox;

    @FXML
    private Button Cancel_Button;

    @FXML
    private Label Login_Denied;

    @FXML
    private PasswordField PassWord_TextBox;
      private static Parent loadFXML(String fxml) throws IOException 
    {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        
        return fxmlLoader.load();
    }

    @FXML
    void Cancel_Button_Pressed(ActionEvent event) throws IOException {
       
        PassWord_TextBox.clear();
        User_Name_TextBox.clear();
    }

    @FXML
    void Login_Button_Pressed(ActionEvent event) throws IOException 
    {
        String Test_User_Name = User_Name_TextBox.getText();
        String Test_Password = PassWord_TextBox.getText();
        
        if (! Test_User_Name.equalsIgnoreCase("jdoe")&& !Test_Password.equals("csc300"))
        {
            
            Login_Denied.setVisible(true);
        }
        if (Test_User_Name.equalsIgnoreCase("jdoe")&& Test_Password.equals("csc300"))
        {
        String fxml = "SecuritySystemMainGui";
        Scene scene = new Scene(loadFXML("SecuritySystemMainGui"), 758, 494);
        scene.setRoot(loadFXML(fxml));
        Stage newInstancestage = new Stage();
        Stage currentStage = (Stage) Cancel_Button.getScene().getWindow();
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

    @FXML
    void Password_Text_Verify(ActionEvent event) {

    }

    @FXML
    void User_Name_Entered(ActionEvent event) {

    }

}
 

