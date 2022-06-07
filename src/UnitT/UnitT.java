/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UnitT;

/**
 *
 * @author skubjana
 */
public class UnitT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public boolean CheckUsername(String name)
    {
        return name.contains("_") && name.length() <= 5;
    }
    
}
