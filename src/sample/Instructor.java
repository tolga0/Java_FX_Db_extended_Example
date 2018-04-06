package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Instructor implements Initializable{
    @FXML
    TextField course1,course2,course3,course4;
    @FXML
    ComboBox slider;

    public void onay(ActionEvent actionEvent) {
        String str=course1.getText();
        String str2=course2.getText();
        String str3=course3.getText();
        String str4=course4.getText();
        String element=str+" "+str2+" "+str3+" "+str4;
        slider.getItems().addAll(element);
        FileOperations m=new FileOperations();

        if(str.equals("")||str2.equals("")||str3.equals("")||str4.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill in required places", "Attention", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        m.DosyayaEkle(str+"&"+str2+"&"+str3+"&"+str4+"\n" );
    }
    public void kontrol(){

        FileOperations fe=new FileOperations();
        String str=course1.getText();
        String str2=course2.getText();

    }
    public void initialize(URL location, ResourceBundle resources) {

        slider.getItems().addAll();
        FileOperations fe=new FileOperations();
           fe.DosyadanCek(slider);
           fe.tumekle(slider);

        String str=course1.getText();
        String str2=course2.getText();
        String str3=str+str2;

       // System.out.println( fe.control(1));
    }

}
