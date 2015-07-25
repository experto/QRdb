/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author experto
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButton extends JButton {

    private static final long serialVersionUID = 1L;

    private Color circleColor = Color.BLACK;
    private Image img;

    public MyButton(Image img) {
        super("");
        this.setPreferredSize(new Dimension(40,40));
        this.img = img;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Dimension originalSize = super.getPreferredSize();
        int hgap = (int) (originalSize.height * 0.5);
        int vgap = (int) (originalSize.height * 0.1);
        g.setColor(circleColor);
        g.drawImage(img, hgap, vgap, this);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        size.width += size.height;
        return size;
    }
}
