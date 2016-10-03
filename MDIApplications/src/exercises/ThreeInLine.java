

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;

/**
 *
 * @author daniel
 */
public class ThreeInLine extends JInternalFrame{
    private JButton b[][];
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
                b[r][c]=new JButton();
                add(b[r][c]);
            }
        }
    }
    //..................................................
    private void events(){
        
    }
}