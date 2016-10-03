/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Daniel Salazar
 */
public class MainWindow extends JFrame{
    
    private JMenuBar      menu;
    private JMenu         file,edit,exercises,help;
    private JMenuItem     open,quit;
    private JMenuItem     Threeinline,mixer,Simplegraph;
    private JDesktopPane  mdi;
    private int           index;

    
    //--------------------------------------------------
    public MainWindow()
    {
        super("Application MDI");
        setSize(600,400);
        widgets();
        evens();
        setVisible(true);
    }
    //-------------------------------------------------------
    private void widgets()
    {
        menu = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        exercises = new JMenu("Exercises");
        help = new JMenu("Help");
        open = new JMenuItem("Open");
        quit = new JMenuItem("Exit");
        Threeinline =new JMenuItem("Three In Line");
        mdi  = new JDesktopPane();
        mixer = new JMenuItem("ColorMixer");
        Simplegraph = new JMenuItem("Graph");
        
        setJMenuBar(menu);
        menu.add(file);
        menu.add(edit);
        menu.add(exercises);
        menu.add(help);
        
        file.add(open);
        file.addSeparator();
        file.add(quit);
        
        exercises.add(Threeinline);
        exercises.add(mixer);
        exercises.add(Simplegraph);
        
        add(mdi); // por defecto se coloca en el borderLayout en el centro... :O   
    }
    //---------------------------------------------------
    private void evens()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //------------------------------------------
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame child = new JInternalFrame("Untitled "+index,true,true,true,true); //cambiar tamaño, cerrar,minimisar,maximisar
                child.setSize(400,300);
                child.setVisible(true);
                mdi.add(child);
                child.setLocation(index*10,index*10);
                index++;
                child.moveToFront();
              /*  try
                {
                child.setSelected(true);
                }
                catch(PropertyVetoException ex)
                {
                    
                }*/
            }
        });   
        //--------------------------------------------------------
        Threeinline.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mdi.add(new ThreeInLine() );
            }
        });
        //------------------------------------------------------------
        mixer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mdi.add(new ColorMixer() );
            }
        });
        //-------------------------------------------------------
        Simplegraph.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mdi.add(new SimpleGraph());
            }
        });        
        
        
        
    }
    //-------------------------------------------------------
    public static void main(String[] args) {
        new MainWindow();
    }
}
