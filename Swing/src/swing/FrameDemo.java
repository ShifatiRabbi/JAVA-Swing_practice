
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class FrameDemo extends JFrame{
    
    private ImageIcon Icon;
    private Container c;
    private JLabel userLabel;
    private JLabel passLabel;
    private Font f;
    private JPasswordField pf;
    
    FrameDemo()
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
        
        f = new Font("Arial",Font.BOLD,18);
        
        Icon = new ImageIcon(getClass().getResource("any-solvent.png"));
        this.setIconImage(Icon.getImage());
        
        userLabel = new JLabel("Enter your username : ");
        c.add(userLabel);
        userLabel.setBounds(20, 50, 500, 50);
        userLabel.setFont(f);
        userLabel.setForeground(Color.WHITE);
        userLabel.setBackground(Color.BLACK);
        userLabel.setOpaque(true);
        userLabel.setToolTipText("Enter username");
        
        
        passLabel = new JLabel("Enter your password : ");
        c.add(passLabel);
        passLabel.setBounds(20, 150, 500, 50);
        passLabel.setFont(f);
        passLabel.setForeground(Color.WHITE);
        passLabel.setBackground(Color.BLACK);
        passLabel.setOpaque(true);
        passLabel.setToolTipText("Enter password");
        
        
        pf = new JPasswordField();
        pf.setBounds(250, 150, 250, 50);
        c.add(pf);
        pf.setEchoChar('*');
        pf.setFont(f);
    }
    
    public static void main(String[] args) {
        
        FrameDemo frame = new FrameDemo();
        frame.setVisible(true);
        
        
    }
}
