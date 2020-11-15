package main;

import javax.swing.*;

public class MainFrame extends JFrame {

    public static void main(String[] args) {
        new MyFrame();
        System.out.println("first commit in master");
        System.out.println("second commit in master");

        System.out.println("first commit in second branch");
        System.out.println("second commit in second branch");
        System.out.println("third commit in second branch");

    }
}