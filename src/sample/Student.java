package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Student implements Initializable {
    @FXML
    ComboBox slider2;
    @FXML
    PieChart grafik;

    public void initialize(URL location, ResourceBundle resources) {
       
        slider2.getItems().addAll();
        FileOperations fs=new FileOperations();
        fs.DosyadanCek(slider2);
        fs.tumekle(slider2);

        }

    public void grafik(){
        FileOperations fs=new FileOperations();
       int x=85;

    }
}
