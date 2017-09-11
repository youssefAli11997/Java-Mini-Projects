/*
 * This challenge computes and displays the total charges for a hospital stay
 * The patient might be admitted overnight.  For an overnight stay, we need: 
 *   The number of days spent in the hospital
 *   The daily rate
 *   Medication charges
 *   Lab service charges
 * If it is not overnight, we only need: 
 *   Medication charges
 *   Lab service charges
 */
package hospitalstay;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 * @author Youssef Ali
 */
public class HospitalStay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hospitalCharges = 0, medicationCharges = 0, labCharges = 0, totalCharges = 0;
        String response = "";
                
        do{
            if(checkForOvernight() == true){
                System.out.println("Enter the cost of the hospital stay: ");
                hospitalCharges = in.nextDouble();                
            }
            else
                hospitalCharges = 0;
            
            System.out.println("Enter the medication charges: ");
            medicationCharges = in.nextDouble();
            System.out.println("Enter the lab services cost: ");
            labCharges = in.nextDouble();
            totalCharges = hospitalCharges + medicationCharges + labCharges; 
            printTotal(totalCharges);
            System.out.println("Do you have another patient? (y/n)");
            response = in.next();
        }while(response.equalsIgnoreCase("y"));
    }

    private static boolean checkForOvernight() {
        Scanner in = new Scanner(System.in);
        String response = "";
        System.out.println("Is this an overnight stay? (y/n)");
        response = in.next();
        if(response.equalsIgnoreCase("y"))
            return true;
        else
            return false; 
    }

    private static void printTotal(double totalCharges) {
        System.out.printf("The total cost for this patient is: $%6.2f", 
                totalCharges);
        System.out.println();
    }
}
