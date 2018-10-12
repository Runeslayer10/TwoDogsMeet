/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet;
import javax.swing.*;
/**
 *
 * @author blhad3491
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        JOptionPane.showMessageDialog(null, "Two dogs will be created in this program.");
        
        String name = JOptionPane.showInputDialog("Please enter the name of the first dog.");
        String breed = JOptionPane.showInputDialog("Please enter the breed of the first dog.");
        name = JOptionPane.showInputDialog("Please enter the name of the second dog.");
        breed = JOptionPane.showInputDialog("Please enter the breed of the second dog.");
        
        
    }
    
}
