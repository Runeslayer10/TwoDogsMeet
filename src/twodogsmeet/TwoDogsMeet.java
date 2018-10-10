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
        
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(7);
        
        String name1, name2, breed1, breed2;
        int aggro1, aggro2, hung1, hung2;
        
        name1 = JOptionPane.showInputDialog("Please enter the name of the first dog.");
        name2 = JOptionPane.showInputDialog("Please enter the name of the second dog.");
        breed1 = JOptionPane.showInputDialog("Please enter the breed of the first dog.");
        breed2 = JOptionPane.showInputDialog("Please enter the breed of the second dog.");
        
        
        
        
        
    }
    
}
