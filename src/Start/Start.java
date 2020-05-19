package Start;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author marku
 */
    import javax.swing.JOptionPane;
    import oru.inf.InfDB;
    import oru.inf.InfException;



public class Start {

    /**
     * @param args the command line arguments
     */
    
    
    private static InfDB idb;
    
   
           
            
    public static void main(String[] args) {
        
        try{
             
            idb = new InfDB("C:\\db\\MIBDB.FDB");
            new huvudFonster(idb).setVisible(true);
            
        }
            
            catch (InfException ettUndantag){
                JOptionPane.showMessageDialog(null, "N�got gick visst fel!");
                System.out.println("Intern felmeddelande: " + ettUndantag.getMessage());
            }
        
    }
    
}