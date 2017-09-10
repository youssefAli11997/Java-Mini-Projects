/*
 * This program is designed to calculate the exterior surface area of a house
 */
package simplecalculation;

import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 * @author Youssef Ali
 */
public class SimpleCalculation {
    
    static class house{
        double length, width, height;
        double surfaceArea(){
            return 2 * width * height + 2 * length * height;
        }
    }
    
    static class windows{
        int number;
        double width, height;
        double totalArea(){
            return number * width * height;
        }
    }
    
    static class doors{
        int number;
        double width, height;
        double totalArea(){
            return number * width * height;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double paintableArea;
        house myHouse = new house();
        windows myWindows = new windows();
        doors myDoors = new doors();
        
        // getting the house dimenions
        System.out.println("Enter the length of the house to be painted in meters");
        myHouse.length = in.nextDouble();
        System.out.println("Enter the width of the house to be painted in meters");
        myHouse.width = in.nextDouble();
        System.out.println("Enter the height of the house to be painted in meters");
        myHouse.height = in.nextDouble();
        
        // getting the windows information
        System.out.println("Enter the number of the windows of the house to be painted");
        myWindows.number = in.nextInt();
        System.out.println("Enter the window width of the house to be painted in meters");
        myWindows.width = in.nextDouble();
        System.out.println("Enter the window height of the house to be painted in meters");
        myWindows.height = in.nextDouble();
        
        // getting the doors information
        System.out.println("Enter the number of the doors of the house to be painted");
        myDoors.number = in.nextInt();
        System.out.println("Enter the door width of the house to be painted in meters");
        myDoors.width = in.nextDouble();
        System.out.println("Enter the door height of the house to be painted in meters");
        myDoors.height = in.nextDouble();
        
        paintableArea = myHouse.surfaceArea() - (myWindows.totalArea() + myDoors.totalArea());
        
        System.out.println("The total printable surface area of the house is : " + surfaceArea + " meters.");
        
    }
    
}
