/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack.web.ac.za;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Philasande
 */
//A class named ListClass is created that will have four Function named add_data, 
//print_data, update_data, and remove_data
public class StackClass {
    
    Stack<String> names = new Stack<>();
    Scanner sc = new Scanner(System.in);
    
    public void add_data(){
        System.out.println("Enter the name that you want to add on the stack : ");
        String data = sc.nextLine();
        
        names.add(data);
    }
    
    public void print_data(){
        System.out.println("The information that is on the stack");
        //sc.nextLine();
        for(String data : names){
            System.out.println(data);
        }
        
        System.out.println("");
    }
    
    public void update_dat(){
        System.out.println("Enter old name : ");
        String oldName = sc.nextLine();
        System.out.println("Enter new name : ");
        String newName = sc.nextLine();
        
        int indexNumber = names.indexOf(oldName);
        names.set(indexNumber, newName);
    }
    
    public void remove_data(){
        System.out.println("This name is deleted on the stack : "+names.pop());
        //names.pop();
    }
    
    public void search_data(){
        System.out.println("Enter the index to search on the stack : ");
        int index = sc.nextInt();
        
        if(index >=0 && index < names.size()){
            String data = names.get(index);
            System.out.println("Search name is : "+ data);
        }else{
            System.out.println("Invalid data on the stack");
        }
    }
    
    public void display_data(){
        System.out.println("This is the stack that will be display : "+names.peek());
        //names.peek();
    }
    
}
