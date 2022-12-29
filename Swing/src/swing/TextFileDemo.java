package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TextFileDemo extends JFrame{
    
    private Container c;
    private ImageIcon icon;
    private JTextField tf1,tf2;
    private Font f;
    
    TextFileDemo()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 100, 550, 500);
        setTitle("Windows");
        
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setBackground(Color.GRAY);
        c.setLayout(null);
        
        f = new Font("Arial", Font.ITALIC + Font.BOLD, 14);
        
        icon = new ImageIcon(getClass().getResource("any-solvent.png"));
        this.setIconImage(icon.getImage());
        
        
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        c.add(tf1);
        tf1.setFont(f);
        tf1.setBackground(Color.BLACK);
        tf1.setForeground(Color.WHITE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        
        tf1.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                String s = tf1.getText();
                if(s.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please enter something");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"tf1 = "+ s);
                }
            }
        });
        
        
        
        tf2 = new JTextField();
        tf2.setBounds(50, 150, 200, 50);
        c.add(tf2);
        tf2.setFont(f);
        tf2.setBackground(Color.BLACK);
        tf2.setForeground(Color.green);
        tf2.setHorizontalAlignment(JTextField.RIGHT);
        
        tf2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String s = tf2.getText();
                if(s.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please enter something");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"tf2 = "+ s);
                }
            }
        });
        
    }
    
    public static void main(String[] args) {
        
       TextFileDemo frame = new TextFileDemo();
       frame.setVisible(true);
        
    }
    
}
