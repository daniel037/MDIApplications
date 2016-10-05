

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class ThreeInLine extends JInternalFrame{
    private JButton b[][];
  
    private int previus;
   
    //....................................................
    public ThreeInLine(){
        super("Three in Line",false,true,false,true);
        setSize(200,200);
        widgets();
        events();
        setVisible(true);
    }
    //..................................................
    private void widgets(){
        setLayout(new GridLayout(3,3));
        b=new JButton[3][3];
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                b[r][c]=new JButton(" ");
                add(b[r][c]);
            }
        }     
    }
    //..................................................
    private void events(){
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {   
               b[r][c].addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                      if(previus == 0)
                      {
                          JButton src = (JButton)e.getSource();
                          src.setText("X");
                          previus =1;
                      }
                      else
                      {
                          JButton src = (JButton)e.getSource();
                          src.setText("O");
                           previus =0; 
                      }
                   }
               });    
            }   
        }
        //-----------------------------------------------------------------
    }
}