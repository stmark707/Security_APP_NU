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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Scale;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SystemConfigurationGUIController {
    
    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    private Button Add_New_User_Button;

    @FXML
    private Button Enter_Button_System_Times;

    @FXML
    private ChoiceBox<String> Am_ChoiceBox1;
   
    

    @FXML
    private ChoiceBox<String> Am_ChoiceBox2;

    @FXML
    private ChoiceBox<String> Am_ChoiceBox3;

    @FXML
    private ChoiceBox<String> Am_ChoiceBox4;

    @FXML
    private ChoiceBox<String> Am_ChoiceBox5;

    @FXML
    private ChoiceBox<String> Am_ChoiceBox6;

    @FXML
    private ChoiceBox<String> Am_ChoiceBox7;

    @FXML
    private ChoiceBox<String> Pm_ChoiceBox1;

    @FXML
    private ChoiceBox<String> Pm_ChoiceBox2;

    @FXML
    private ChoiceBox<String> Pm_ChoiceBox3;

    @FXML
    private ChoiceBox<String> Pm_ChoiceBox4;

    @FXML
    private ChoiceBox<String> Pm_ChoiceBox5;

    @FXML
    private ChoiceBox<String> Pm_ChoiceBox6;

    @FXML
    private ChoiceBox<String> Pm_ChoiceBox7;

    @FXML
    private AnchorPane Parent_AnchorPane_NewUser;

    @FXML
    private Button Enter_Button_New_User;

    @FXML
    private TextField First_Name_TextBox;

    @FXML
    private TextField Last_Name_TextBox;

    @FXML
    private TextField User_Name_Textbox;

    @FXML
    private PasswordField Password_Field;

    @FXML
    private Button Return_To_Main_Page;
    
    @FXML
    public void initialize()
            
    {   
        
        
        Add_New_User_Button.setVisible(true);
        //Monday AM boxes
        Am_ChoiceBox1.getItems().add("12 am");
        Am_ChoiceBox1.getItems().add("1 am");
        Am_ChoiceBox1.getItems().add("2 am");
        Am_ChoiceBox1.getItems().add("3 am");
        Am_ChoiceBox1.getItems().add("4 am");
        Am_ChoiceBox1.getItems().add("5 am");
        Am_ChoiceBox1.getItems().add("6 am");
        Am_ChoiceBox1.getItems().add("7 am");
        Am_ChoiceBox1.getItems().add("8 am");
        Am_ChoiceBox1.getItems().add("9 am");
        Am_ChoiceBox1.getItems().add("10 am");
        Am_ChoiceBox1.getItems().add("11 am");
        
        
        //Monday PM Boxes
        Pm_ChoiceBox1.getItems().add("12 pm");
        Pm_ChoiceBox1.getItems().add("1 pm");
        Pm_ChoiceBox1.getItems().add("2 pm");
        Pm_ChoiceBox1.getItems().add("3 pm");
        Pm_ChoiceBox1.getItems().add("4 pm");
        Pm_ChoiceBox1.getItems().add("5 pm");
        Pm_ChoiceBox1.getItems().add("6 pm");
        Pm_ChoiceBox1.getItems().add("7 pm");
        Pm_ChoiceBox1.getItems().add("8 pm");
        Pm_ChoiceBox1.getItems().add("9 pm");
        Pm_ChoiceBox1.getItems().add("10 pm");
        Pm_ChoiceBox1.getItems().add("11 pm");
        
        //##########################################
        
        //Tuesday AM 
        Am_ChoiceBox2.getItems().add("12 am");
        Am_ChoiceBox2.getItems().add("1 am");
        Am_ChoiceBox2.getItems().add("2 am");
        Am_ChoiceBox2.getItems().add("3 am");
        Am_ChoiceBox2.getItems().add("4 am");
        Am_ChoiceBox2.getItems().add("5 am");
        Am_ChoiceBox2.getItems().add("6 am");
        Am_ChoiceBox2.getItems().add("7 am");
        Am_ChoiceBox2.getItems().add("8 am");
        Am_ChoiceBox2.getItems().add("9 am");
        Am_ChoiceBox2.getItems().add("10 am");
        Am_ChoiceBox2.getItems().add("11 am");
        
        //Tuesday PM
        Pm_ChoiceBox2.getItems().add("12 pm");
        Pm_ChoiceBox2.getItems().add("1 pm");
        Pm_ChoiceBox2.getItems().add("2 pm");
        Pm_ChoiceBox2.getItems().add("3 pm");
        Pm_ChoiceBox2.getItems().add("4 pm");
        Pm_ChoiceBox2.getItems().add("5 pm");
        Pm_ChoiceBox2.getItems().add("6 pm");
        Pm_ChoiceBox2.getItems().add("7 pm");
        Pm_ChoiceBox2.getItems().add("8 pm");
        Pm_ChoiceBox2.getItems().add("9 pm");
        Pm_ChoiceBox2.getItems().add("10 pm");
        Pm_ChoiceBox2.getItems().add("11 pm");
        //##################################'
        
        //Wednesday AM
        Am_ChoiceBox3.getItems().add("12 am");
        Am_ChoiceBox3.getItems().add("1 am");
        Am_ChoiceBox3.getItems().add("2 am");
        Am_ChoiceBox3.getItems().add("3 am");
        Am_ChoiceBox3.getItems().add("4 am");
        Am_ChoiceBox3.getItems().add("5 am");
        Am_ChoiceBox3.getItems().add("6 am");
        Am_ChoiceBox3.getItems().add("7 am");
        Am_ChoiceBox3.getItems().add("8 am");
        Am_ChoiceBox3.getItems().add("9 am");
        Am_ChoiceBox3.getItems().add("10 am");
        Am_ChoiceBox3.getItems().add("11 am");
        //Wednesday pm boxes
        Pm_ChoiceBox3.getItems().add("12 pm");
        Pm_ChoiceBox3.getItems().add("1 pm");
        Pm_ChoiceBox3.getItems().add("2 pm");
        Pm_ChoiceBox3.getItems().add("3 pm");
        Pm_ChoiceBox3.getItems().add("4 pm");
        Pm_ChoiceBox3.getItems().add("5 pm");
        Pm_ChoiceBox3.getItems().add("6 pm");
        Pm_ChoiceBox3.getItems().add("7 pm");
        Pm_ChoiceBox3.getItems().add("8 pm");
        Pm_ChoiceBox3.getItems().add("9 pm");
        Pm_ChoiceBox3.getItems().add("10 pm");
        Pm_ChoiceBox3.getItems().add("11 pm");
        
        //####################################
        
        //Thursday AM boxes
        Am_ChoiceBox4.getItems().add("12 am");
        Am_ChoiceBox4.getItems().add("1 am");
        Am_ChoiceBox4.getItems().add("2 am");
        Am_ChoiceBox4.getItems().add("3 am");
        Am_ChoiceBox4.getItems().add("4 am");
        Am_ChoiceBox4.getItems().add("5 am");
        Am_ChoiceBox4.getItems().add("6 am");
        Am_ChoiceBox4.getItems().add("7 am");
        Am_ChoiceBox4.getItems().add("8 am");
        Am_ChoiceBox4.getItems().add("9 am");
        Am_ChoiceBox4.getItems().add("10 am");
        Am_ChoiceBox4.getItems().add("11 am");
        
        //Thursday pm boxes
        Pm_ChoiceBox4.getItems().add("12 pm");
        Pm_ChoiceBox4.getItems().add("1 pm");
        Pm_ChoiceBox4.getItems().add("2 pm");
        Pm_ChoiceBox4.getItems().add("3 pm");
        Pm_ChoiceBox4.getItems().add("4 pm");
        Pm_ChoiceBox4.getItems().add("5 pm");
        Pm_ChoiceBox4.getItems().add("6 pm");
        Pm_ChoiceBox4.getItems().add("7 pm");
        Pm_ChoiceBox4.getItems().add("8 pm");
        Pm_ChoiceBox4.getItems().add("9 pm");
        Pm_ChoiceBox4.getItems().add("10 pm");
        Pm_ChoiceBox4.getItems().add("11 pm");
        
        //######################################
        
        //Friday AM
        Am_ChoiceBox5.getItems().add("12 am");
        Am_ChoiceBox5.getItems().add("1 am");
        Am_ChoiceBox5.getItems().add("2 am");
        Am_ChoiceBox5.getItems().add("3 am");
        Am_ChoiceBox5.getItems().add("4 am");
        Am_ChoiceBox5.getItems().add("5 am");
        Am_ChoiceBox5.getItems().add("6 am");
        Am_ChoiceBox5.getItems().add("7 am");
        Am_ChoiceBox5.getItems().add("8 am");
        Am_ChoiceBox5.getItems().add("9 am");
        Am_ChoiceBox5.getItems().add("10 am");
        Am_ChoiceBox5.getItems().add("11 am");
        
        
        //Friday PM
        Pm_ChoiceBox5.getItems().add("12 pm");
        Pm_ChoiceBox5.getItems().add("1 pm");
        Pm_ChoiceBox5.getItems().add("2 pm");
        Pm_ChoiceBox5.getItems().add("3 pm");
        Pm_ChoiceBox5.getItems().add("4 pm");
        Pm_ChoiceBox5.getItems().add("5 pm");
        Pm_ChoiceBox5.getItems().add("6 pm");
        Pm_ChoiceBox5.getItems().add("7 pm");
        Pm_ChoiceBox5.getItems().add("8 pm");
        Pm_ChoiceBox5.getItems().add("9 pm");
        Pm_ChoiceBox5.getItems().add("10 pm");
        Pm_ChoiceBox5.getItems().add("11 pm");
        
        //#############################################
        
        //Saturday AM
        Am_ChoiceBox6.getItems().add("12 am");
        Am_ChoiceBox6.getItems().add("1 am");
        Am_ChoiceBox6.getItems().add("2 am");
        Am_ChoiceBox6.getItems().add("3 am");
        Am_ChoiceBox6.getItems().add("4 am");
        Am_ChoiceBox6.getItems().add("5 am");
        Am_ChoiceBox6.getItems().add("6 am");
        Am_ChoiceBox6.getItems().add("7 am");
        Am_ChoiceBox6.getItems().add("8 am");
        Am_ChoiceBox6.getItems().add("9 am");
        Am_ChoiceBox6.getItems().add("10 am");
        Am_ChoiceBox6.getItems().add("11 am");
        
        //Saturday PM
        Pm_ChoiceBox6.getItems().add("12 pm");
        Pm_ChoiceBox6.getItems().add("1 pm");
        Pm_ChoiceBox6.getItems().add("2 pm");
        Pm_ChoiceBox6.getItems().add("3 pm");
        Pm_ChoiceBox6.getItems().add("4 pm");
        Pm_ChoiceBox6.getItems().add("5 pm");
        Pm_ChoiceBox6.getItems().add("6 pm");
        Pm_ChoiceBox6.getItems().add("7 pm");
        Pm_ChoiceBox6.getItems().add("8 pm");
        Pm_ChoiceBox6.getItems().add("9 pm");
        Pm_ChoiceBox6.getItems().add("10 pm");
        Pm_ChoiceBox6.getItems().add("11 pm");
        
        
        //##########################################
        //Sunday AM
        Am_ChoiceBox7.getItems().add("12 am");
        Am_ChoiceBox7.getItems().add("1 am");
        Am_ChoiceBox7.getItems().add("2 am");
        Am_ChoiceBox7.getItems().add("3 am");
        Am_ChoiceBox7.getItems().add("4 am");
        Am_ChoiceBox7.getItems().add("5 am");
        Am_ChoiceBox7.getItems().add("6 am");
        Am_ChoiceBox7.getItems().add("7 am");
        Am_ChoiceBox7.getItems().add("8 am");
        Am_ChoiceBox7.getItems().add("9 am");
        Am_ChoiceBox7.getItems().add("10 am");
        Am_ChoiceBox7.getItems().add("11 am");
        
        //Sunday PM
        Pm_ChoiceBox7.getItems().add("12 pm");
        Pm_ChoiceBox7.getItems().add("1 pm");
        Pm_ChoiceBox7.getItems().add("2 pm");
        Pm_ChoiceBox7.getItems().add("3 pm");
        Pm_ChoiceBox7.getItems().add("4 pm");
        Pm_ChoiceBox7.getItems().add("5 pm");
        Pm_ChoiceBox7.getItems().add("6 pm");
        Pm_ChoiceBox7.getItems().add("7 pm");
        Pm_ChoiceBox7.getItems().add("8 pm");
        Pm_ChoiceBox7.getItems().add("9 pm");
        Pm_ChoiceBox7.getItems().add("10 pm");
        Pm_ChoiceBox7.getItems().add("11 pm");
    }

    @FXML
    void Add_New_User(ActionEvent event) {
        
        Parent_AnchorPane_NewUser.setVisible(true);
        Add_New_User_Button.setVisible(false);

    }

    @FXML
    void Enter_Selected_Hours(ActionEvent event) throws FileNotFoundException 
    {
        String AM1 = Am_ChoiceBox1.getSelectionModel().getSelectedItem();
        String PM1 = Pm_ChoiceBox1.getSelectionModel().getSelectedItem();
        
        String AM2 = Am_ChoiceBox2.getSelectionModel().getSelectedItem();
        String PM2 = Pm_ChoiceBox2.getSelectionModel().getSelectedItem();
        
        String AM3 = Am_ChoiceBox3.getSelectionModel().getSelectedItem();
        String PM3 = Pm_ChoiceBox3.getSelectionModel().getSelectedItem();
        
        String AM4 = Am_ChoiceBox4.getSelectionModel().getSelectedItem();
        String PM4 = Pm_ChoiceBox4.getSelectionModel().getSelectedItem();
        
        String AM5 = Am_ChoiceBox5.getSelectionModel().getSelectedItem();
        String PM5 = Pm_ChoiceBox5.getSelectionModel().getSelectedItem();
        
        String AM6 = Am_ChoiceBox6.getSelectionModel().getSelectedItem();
        String PM6 = Pm_ChoiceBox6.getSelectionModel().getSelectedItem();
        
        String AM7 = Am_ChoiceBox7.getSelectionModel().getSelectedItem();
        String PM7 = Pm_ChoiceBox7.getSelectionModel().getSelectedItem();
        
        String Monday = "Monday";
        String Tuesday = "Tueday";
        String Wednesday = "Wednesday";
        String Thursday = "Thursday";
        String Friday = "Friday";
        String Saturday = "Saturday";
        String Sunday = "Sunday";
        
        
          Formatter Output = new Formatter("Security System Application Automated Schedule");
       Output.format("%s Time Schedule: %s - %s%n%s Time Schedule: %s - %s%n%s Time Schedule: %s - %s%n%s Time Schedule: %s - %s%n%s Time Schedule: %s - %s%n%s Time Schedule:"
               + " %s - %s%n%s Time Schedule: %s - %s%n", Monday, AM1, PM1, Tuesday, AM2, PM2, Wednesday, AM3, PM3, Thursday, AM4, PM4, Friday, AM5, PM5, Saturday, AM6, PM6, Sunday,
                AM7, PM7);
                Output.flush();
        
    }

    private static Parent loadFXML(String fxml) throws IOException 
    {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        
        return fxmlLoader.load();
    }
    
    
    
    @FXML
    void Return_To_Main_Page(ActionEvent event) throws IOException {

    String fxml = "SecuritySystemMainGui";
        Scene scene = new Scene(loadFXML("SecuritySystemMainGui"), 758, 494);
        scene.setRoot(loadFXML(fxml));
        Stage newInstancestage = new Stage();
        Stage currentStage = (Stage) Return_To_Main_Page.getScene().getWindow();
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
    void Enter_Button_New_User(ActionEvent event) throws FileNotFoundException 
    {
        String FirstName = First_Name_TextBox.getText();
        String LastName = Last_Name_TextBox.getText();
        String UserName = User_Name_Textbox.getText();
        String PassWord =  Password_Field.getText();
        
       Formatter Output = new Formatter("Security System Application New Users");
       Output.format("First Name: %s%nLast Name: %s%nUsername: %s%nPassword: %s%n  ", FirstName, LastName, UserName, PassWord);
                Output.flush();

    }
    
   
}

