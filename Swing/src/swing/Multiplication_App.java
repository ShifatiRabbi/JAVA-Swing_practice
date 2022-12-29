
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Multiplication_App extends JFrame{
    
    private Container c;
    private Font f;
    private ImageIcon img,img1;
    private JLabel imgLabel,textLabel;
    private JTextField tf;
    private JButton btn;
    private JTextArea ta;
    
    Multiplication_App()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 50, 400, 650);
        this.setTitle("Multiplication App");
        
        initComponent();
    }
    
    public void initComponent()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        img = new ImageIcon(getClass().getResource("any-solvent.png"));
        this.setIconImage(img.getImage());
        img1 = new ImageIcon(getClass().getResource("multiplication.jpg"));
            
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 18);
        
        imgLabel = new JLabel(img1);
        imgLabel.setBounds(40,10, img1.getIconWidth(), img1.getIconHeight());
        c.add(imgLabel);
        
        textLabel = new JLabel("Enter any digit : ");
        textLabel.setBounds(40, 200, 150, 50);
        textLabel.setForeground(Color.BLUE);
        textLabel.setFont(f);
        c.add(textLabel);
        
        
        tf = new JTextField();
        tf.setBounds(230, 200, 100, 50);
        tf.setFont(f);
        tf.setBackground(Color.yellow);
        tf.setForeground(Color.BLACK);
        tf.setHorizontalAlignment(JLabel.CENTER);
        c.add(tf);
        
        
        btn = new JButton("clear");
        btn.setBounds(265, 265, 65, 30);
        btn.setBackground(Color.green);
        btn.setForeground(Color.BLACK);
        c.add(btn);
        
        
        ta = new JTextArea("");
        ta.setBounds(40, 310, 300, 270);
        ta.setFont(f);
        ta.setBackground(Color.green);
        ta.setForeground(Color.BLUE);
        c.add(ta);
        
        
        tf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String value = tf.getText();
                if(value.isEmpty())
                {
                    ta.setText("");
                    JOptionPane.showMessageDialog(null, "!!! Please enter a digit !!!");
                }
                else
                {
                    ta.setText("");
                    int num = Integer.parseInt(tf.getText());
                    String n = String.valueOf(num);
                    ta.append("This is multiplication of ( "+n+" ) \n\n");

                    for(int i=1; i<=10; i++)
                    {
                        int res = i * num;

                        String r = String.valueOf(res);
                        String j = String.valueOf(i);

                        ta.append(n+ " X " +j+ " = " +r+ "\n");
                    } 
                }
                
            }
        });
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                tf.setText("");
                ta.setText("");
            }
        });
        
    }
    
    public static void main(String[] args) {
        
        Multiplication_App frame = new Multiplication_App();
        frame.setVisible(true);
    }
}
