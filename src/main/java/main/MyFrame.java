package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MyFrame extends JFrame {
    private String commonImagePath = "/Users/vladyslavholiver/Documents/itea/leasson2/src/main/resources";
    private String filePath = commonImagePath + "/data.txt";

    MyFrame() {
        super("ITEA");
        setLayout(new GridLayout(1, 1));
        getValueFromFile();
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void getValueFromFile() {
        JLabel getValueFromFile = new JLabel(getTextFromFileViaJarFile());
        add(getValueFromFile);
    }

    public String getTextFromFileViaJarFile() {
        String[] values = new String[3];
        try {
                    File file = new File(filePath);
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] data = new byte[fileInputStream.available()];
                    fileInputStream.read(data);
                    fileInputStream.close();
                    String str = new String(data);
                    values = str.split(" ");
                    if (values.length > 0) {
                        System.out.println("File is read successfully");
                    }
                    System.out.println("Previous saved values are set successfully");
                } catch (IOException j) {
                    System.out.println("File is empty");
                }
        return values[0] + " " + values[1] + " " + values[2];
    }
}
