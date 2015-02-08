/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Alfonso
 */
public class HelloWorldMenuControl {
    
    public HelloWorldMenuControl (){
        
        
    }
    public void displayNames(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                     "\tAlfonso Ramirez from Monterrey Mexico"
                             + "\n\tNikki Huntsman from Idaho Falls Idaho"
                             + "\n\tKeith Banner from Idaho Falls Idaho"
                             + "\n\tCheryl Rubenstein from North Dighton Massachusetts"
                             + "\n\tAndres Reyes from Guayaquil Ecuador"
                             + "\n\tNatalia Grey from Ufa Russia");
        displayHelpBorder();
        
    }
        
        public void displayMessage(){ 
            System.out.println();
           displayHelpBorder();
           System.out.println(
                              "\tWe are working with minesweeper with a great team"
                                      + "\n\taround the world, everyone of us are"
                                      + "\n\tlisted in this menu and we're creating the game"
                                      + "\n\tinto a repository in GitHub every week.");
           displayHelpBorder();
           
           }
        
       

    private void displayHelpBorder() {
        System.out.println(
        "\t////////////////////////////////////////////////////////////////");
    }
    }

   
    
    

