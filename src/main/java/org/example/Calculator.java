package org.example;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator {
    private JButton button1;
    private JPanel button;

    public Calculator() {
    button1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);

                    System.out.println(e.getClickCount());
        }
    });
}

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
