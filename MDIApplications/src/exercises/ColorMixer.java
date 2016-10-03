/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author daniel
 */
public class ColorMixer extends JInternalFrame{
    private JLabel mix;
    private JScrollBar red,green,blue;
    private JLabel lred,lgreen,lblue;
    //---------------------------------------------
    public ColorMixer()
    {
        super("Color Mixer",false,true,false,true);
        setSize(300,200);
        widgets();
        events();
        setVisible(true); 
    }
    //--------------------------------------------
    private void widgets()
    {
        JPanel p = new JPanel(new BorderLayout());
        JPanel p1 = new JPanel(new GridLayout(3,1));
        JPanel p2 = new JPanel(new GridLayout(3,1));               
        JPanel p3 = new JPanel(new GridLayout(3,1));                            
             
        mix      = new JLabel();
        red      = new JScrollBar(JScrollBar.HORIZONTAL,128,1,0,256);
        green    = new JScrollBar(JScrollBar.HORIZONTAL,128,1,0,256);
        blue     = new JScrollBar(JScrollBar.HORIZONTAL,128,1,0,256);
        lred     = new JLabel();
        lgreen   = new JLabel();
        lblue    = new JLabel();

        p.add(p1,BorderLayout.WEST);
        p.add(p2,BorderLayout.CENTER);
        p.add(p3,BorderLayout.EAST);
        
        p1.add(new JLabel("red"));
        p1.add(new JLabel("Green"));
        p1.add(new JLabel("Blue"));
        
        p2.add(red);
        p2.add(green);
        p2.add(blue);
        
        p3.add(lred);
        p3.add(lgreen);
        p3.add(lblue);
               
        add(mix, BorderLayout.CENTER);
        add(p,BorderLayout.SOUTH);
        mix.setOpaque(true);               
    }
    //-----------------------------------------------
    private void events()
    {
        execMix();
        //------------------------------------------------
        red.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                  execMix();
            }
        });
        //----------------------------------------------------------
        green.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                  execMix();
            }
        });
        //-------------------------------------------------------
        blue.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                  execMix();
            }
        });
    }
    //--------------------------------------------------------------------------
        private void execMix()
        {
            int r= red.getValue();
            int g= green.getValue();
            int b= blue.getValue();
            
            mix.setBackground(new Color(r,g,b));
            lred.setText(""+r);
            lgreen.setText(""+g);
            lblue.setText(""+b);
        }
}