
package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Dialog {
    
    public static void main(String[] args)
    {
        ImageIcon img = new ImageIcon("envelope.png");
        
        String f_name = JOptionPane.showInputDialog(null, "Enter your first name : ", "windows", JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null, "Enter your last name : ", "windows", JOptionPane.QUESTION_MESSAGE);
        String name = f_name + " " + l_name;
        
        JOptionPane.showMessageDialog(null, "Welcome "+name, "Windows", JOptionPane.PLAIN_MESSAGE);
        
        int n = JOptionPane.showConfirmDialog(null, "Do you want to quit?", "windows", JOptionPane.YES_NO_OPTION);
        if(n == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("You chose no!!!!");
        }
        
        
    }
    
}
