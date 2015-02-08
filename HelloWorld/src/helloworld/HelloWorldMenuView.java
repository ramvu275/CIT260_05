/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;
/**
 *
 * @author Alfonso
 */
public class HelloWorldMenuView {
    private final static String [][] menuItems = {
        { "N", "Names"},
        {"M", "Message"},
        {"E", "Exit"}
    };
    
    private HelloWorldMenuControl helloWorldMenuControl = new HelloWorldMenuControl ();
    
    public HelloWorldMenuView (){
    }
    
     public void getInput (){
         
         String command;
         Scanner inFile = new Scanner (System.in);
         
         do {
             this.display();
                     
                     command=inFile.nextLine();
                     command = command.trim().toUpperCase();
                     
                     switch (command){
                         case "N":
                             this.helloWorldMenuControl.displayNames();
                             break;
                         case "M":
                             this.helloWorldMenuControl.displayMessage();
                             break;
                         case "E":
                             break;
                         default:
                             new HelloWorldError().displayError("Invalid Input. Please try with a valid input");
                         continue;
                     }
         } while (!command.equals ("E"));
                      return;
                     
         }
         
         
    

    private void display() {
      System.out.println("\n\t=============================================================================");
      System.out.println("\t Enter the letter associated with one of the following commands: ");
      
      for (int i= 0; i < HelloWorldMenuView.menuItems.length; i++){
          System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
          }
      System.out.println("\t====================================================\n");
      
    }
    
}
