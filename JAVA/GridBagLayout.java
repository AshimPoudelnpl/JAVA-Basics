import javax.swing.*;
import java.awt.*;

public class GridBagLayout {
public static void main(String [] args) 
{
    JFrame f=new JFrame();
    f.setLayout(new java.awt.GridBagLayout());
    
    GridBagConstraints gbc= new GridBagConstraints();
    gbc.fill=GridBagConstraints.HORIZONTAL;
    gbc.gridx=0;
    gbc.gridy=0;
    f.add (new Button("btn1"),gbc);


    gbc.gridx=1;
    gbc.gridy=0;
    f.add (new Button("btn2"),gbc);

    
    gbc.gridx=0;
    gbc.gridy=1;
    gbc.ipady=50;
    f.add (new Button("btn3"),gbc);


    f.setSize(400,300);
    f.setVisible(true);
   


}   
}
