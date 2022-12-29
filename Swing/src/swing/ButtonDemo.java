
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ButtonDemo extends JFrame{
    
    private Container c;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;
    private JPasswordField pf;
    private JButton btn1,btn2;
    
    ButtonDemo()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 100, 400, 500);
        setTitle("MY Window");
        
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setBackground(Color.GRAY);
        c.setLayout(null);
        
        img = new ImageIcon(getClass().getResource("any-solvent.png"));
        this.setIconImage(img.getImage());
        
        f = new Font("Arial", Font.BOLD, 14);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        
        
        
        pf = new JPasswordField();
        pf.setBounds(50, 50, 300, 50);
        c.add(pf);
        pf.setEchoChar('*');
        pf.setFont(f);
        pf.setBackground(Color.BLACK);
        pf.setForeground(Color.WHITE);
        pf.setHorizontalAlignment(JTextField.CENTER);
        
        
        btn1 = new JButton("SUBMIT");
        btn1.setBounds(50, 120, 100, 50);
        c.add(btn1);
        btn1.setFont(f);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setCursor(cursor);
        
        
        btn2 = new JButton("CLEAR");
        btn2.setBounds(250, 120, 100, 50);
        c.add(btn2);
        btn2.setFont(f);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setCursor(cursor);
        
    }
    
    public static void main(String[] args) {
        
        ButtonDemo frame = new ButtonDemo();
        frame.setVisible(true);
    }
    
}
