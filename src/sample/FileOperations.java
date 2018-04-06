package sample;

import javafx.scene.control.ComboBox;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class FileOperations {

    public  void DosyayaEkle(String metin){
        try{
            File dosya = new File("students.txt");
            FileWriter yazici = new FileWriter(dosya,true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            yaz.write(metin);
            yaz.close();
        }
        catch (Exception hata){
            hata.printStackTrace();
        }
    }
    public  void DosyadanCek(ComboBox combo)  {
        try {
            File file = new File("students.txt");
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader(file));
            String satir=null;
            satir= reader.readLine();

            while (satir!=null) {
                satir = reader.readLine();

        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void tumekle(ComboBox kom){
        try {
            File file = new File("students.txt");
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader(file));
            String satir=null;
            satir= reader.readLine();
            //arrayliste satırları ekleme kısmı
            while (satir!=null) {
                satir = reader.readLine();
                //combobox a eleman ekleme
                 kom.getItems().addAll(satir);
            }
        }catch (Exception e){
        }
    }
    }

