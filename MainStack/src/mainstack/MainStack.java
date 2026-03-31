/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainstack;

import stack.web.ac.za.StackClass;

/**
 *
 * @author Philasande
 */
public class MainStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackClass object = new StackClass();
        
        System.out.println("Provide you name that you want to add on the stack::");
        object.add_data();
        object.add_data();
        object.add_data();
        object.add_data();
        object.add_data();
        
        System.out.println("Stack below :: ");
        object.print_data();
        
        object.display_data();
        
        System.out.println("Update the following data :: ");
        object.update_dat();
        
        System.out.println("Stack below :: ");
        object.print_data();
        
        object.remove_data();
        object.print_data();
        object.remove_data();
        object.print_data();
        
        System.out.println("Updated data on the stack list :: ");
        object.search_data();
    }
    
}
