package gr.aueb.elearning.ch1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrilizaDriver {
    public static void main(String[] args) {
        Triliza triliza = Triliza.createTriliza();
        Scanner in=new Scanner(System.in);
        int player=1;
        int times=1;
        int x,y;
        do{
            System.out.println("Επανάληψη:" + times);
            System.out.println("Παίζει ο παίκτης " + player);
            System.out.println("Δώστε x και y");
            try{
                x=in.nextInt();
                y=in.nextInt();
                triliza.setValue(x,y,player);
                triliza.printGrid();
                if(triliza.checkForTriliza()){
                    System.out.println("Νικητής ο παίκτης " + player);
                    break;
                }
                if(++times == 10){
                    System.out.println("Το παιχνίδι ολοκληρώθηεκε χωρίς νικητή");
                    break;
                }
                player=(player==1) ? 2:1;
            }catch (InputMismatchException | ValueOutOfBoundsException e) {
                System.out.println("Δώστε αριμούς εντός ορίων (0-2)");
            }catch (ValueAlreadyExistsException e){
                System.out.println("Η θέση περιέχει ήδη τιμή.Παρακαλώ προσπαθήστε ξανά");
            }
            in.nextLine();
        }
        while(Boolean.TRUE);
    }
}
