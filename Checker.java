import javax.swing.*;
import java.awt.*;
public class Checker extends JFrame{
    Container cp;
    public Checker(){
        super("Checker");
        ImageIcon img = new ImageIcon("./pic/icon.jpg");
        setIconImage(img.getImage());
        Initial();
        setComponet();
        Finally();
    }
    public void Initial(){
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
    }
    public void setComponet(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridBagLayout());
        JLabel Text1 = new JLabel("Game Panal");
        JLabel Text2 = new JLabel("Time Passed : 00.00");
        JButton bt = new JButton("START");
        bt.setBackground(Color.white);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 100;
        c.ipadx = 50 ;
        c.ipady = 20;
        Text1.setHorizontalAlignment(JLabel.CENTER);
        Text1.setFont(new Font("",Font.PLAIN,20));
        p1.add(Text1,c);
        c.gridy = 120;
        c.ipadx = 20 ;
        c.ipady = 50;
        Text2.setHorizontalAlignment(JLabel.CENTER);
        p1.add(Text2,c);
        c.gridy = 140;
        c.ipadx = 50 ;
        c.ipady = 20;
        p1.add(bt,c);
        p1.setBackground(Color.white);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(8,8));
        int count = 0;
        for (int i  = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) { 
                JButton bt2 = new JButton("");
                if ((i % 2 ) == 0) {
                    if ( (count % 2) == 0) {
                        bt2.setBackground(Color.black);
                    }else{
                        bt2.setBackground(Color.white);
                    }
                }else{
                    if ( (count % 2) != 0) {
                        bt2.setBackground(Color.black);
                    }else{
                        bt2.setBackground(Color.white);
                    }
                }   
            count++;
            p2.add(bt2);
            }
        }
        cp.add(p1,BorderLayout.EAST);
        cp.add(p2,BorderLayout.CENTER);
    }
    public void Finally(){
        setSize(600,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
