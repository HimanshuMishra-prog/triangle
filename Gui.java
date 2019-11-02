/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*import javax.swing.*;
import java.awt.*;
 *
 * @author dell
 */
public  class Gui{

    /**
     * @param args the command line arguments
     */
  
     int x=70;   // TODO code application logic hereint x=70;
    int y=70;
    public static void main(String[] args) {
        Gui gui=new Gui();
        gui.go();
    }
    void go(){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mydraw panel=new mydraw();
        frame.getContentPane().add(panel);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        int i=0;
        for(i=0;i<=130;i++){x++;
        y++;
        panel.repaint();
        try{Thread.sleep(10);}
        catch(InterruptedException e){}}
            if(i>130){for(i=130;i>=0;i--){x++;
        y--;
        panel.repaint();
        try{Thread.sleep(10);}
        catch(Exception e){}
    }

            }
            for(int j=0;x>70;j++){
            x--;
        
        panel.repaint();
        try{Thread.sleep(5);}
        catch(Exception e){}
            
            
                
            }
    }
    class mydraw extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            
            g.setColor(Color.GREEN);
            g.fillOval(x, y, 10, 10);}
        }
}

    
    

