import javax.swing.*;
import java.awt.*; 
public class MyFlowLayoutDemo {

    public static void main(String[] args) {
        JFrame f = new JFrame("FlowLayout LEFT Example");

        JLabel lbl1 = new JLabel("Hello");
        JLabel lbl2 = new JLabel("Hola");

        
        f.setLayout(new FlowLayout(FlowLayout.CENTER));

        f.add(lbl1);
        f.add(lbl2);

        f.setSize(400, 500);
        
        f.setVisible(true);
    }
}
