package com.al2000;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.*;

public class GuiEntry extends JFrame {
    protected int W = 400;
    protected int H = 400;

    GuiEntry(String title) throws InterruptedException {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField searchText = new JTextField(30);
        JButton searchButton = new JButton("search");
        JPanel searchPanel = new JPanel();
        searchPanel.add(searchText);
        searchPanel.add(searchButton);
        add(searchPanel);
        pack();

    }

    public Dimension getPreferredSize() { return new Dimension(W, H); }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GuiEntry("AL2000").setVisible(true);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}
