package com.al2000.GUI;

import com.al2000.Data.data.Utilisateur;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.*;

// TODO (Eugene et Benjamin ) refactor !!!!
public class GuiEntry extends JFrame {
    protected int W = 400;
    protected int H = 400;

    public GuiEntry(String title, Utilisateur user) throws InterruptedException {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField searchText = new JTextField(30);
        JButton searchButton = new JButton("search");
        JPanel searchPanel = new JPanel();
        searchPanel.add(searchText);
        searchPanel.add(searchButton);
        searchPanel.add(new JTextField(user.getNom()));
        add(searchPanel);
        pack();

        GuiEntry that = this;

        SwingUtilities.invokeLater(() -> that.setVisible(true));

    }
    public Dimension getPreferredSize() { return new Dimension(W, H); }

}
