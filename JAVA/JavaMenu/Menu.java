package JavaMenu;

import javax.swing.*;
class Menu{
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JMenuBar menuBar=new JMenuBar();
        JMenu file=new JMenu("file");
        menuBar.add(file);

        JMenuItem newfile=new JMenuItem("New");
        JMenuItem save=new JMenuItem("save");
        JMenuItem exit=new JMenuItem("exit");
        

        JMenu openRecents=new JMenu("open Recents");
        JMenuItem recent1=new JMenuItem("Password.txt");
        recent1.setEnabled(false);
        JMenuItem recent2=new JMenuItem("data.txt");
        openRecents.add(recent1);
        openRecents.add(recent2);

        file.add(newfile);
        file.add(openRecents);
        file.add(save);
        file.add(exit);



        f.setJMenuBar(menuBar);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}