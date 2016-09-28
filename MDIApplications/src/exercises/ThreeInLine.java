/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;



/**
 *
 * @author Daniel Salazar
 */
public class ThreeInLine extends JInternalFrame{
    
    private JButton b[][];
    //------------------------------------------
    public ThreeInLine()
    {
        super("Three In Line",false,true,false,true);
        setSize(300,300);
        widgest();
        events();
        setVisible(true);
    }
    //--------------------------------------------------
    private void widgest()
    {
        setLayout(new GridLayout(3,3) );
        b = new JButton[3][3];
        for(int i =0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                b[i][j] = new JButton();
                add(b[i][j]);
            }
        }
    }
    //---------------------------
    private void events()
    {
        
    }
}
