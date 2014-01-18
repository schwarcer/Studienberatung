import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author perliny
 */
public class Studienberatung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hast du Abitur?");
        String eingabe1    = scanner.nextLine();
        System.out.println(eingabe1);
        
        System.out.println("Bist du wissbegierig?");
        eingabe1    = scanner.nextLine();
        
        System.out.println("Hast du Fachabitur?");
        eingabe1    = scanner.nextLine();
        
        System.out.println("Hast du eine Berufsausbildung?");
        eingabe1    = scanner.nextLine();
        
        
        
    }
}
