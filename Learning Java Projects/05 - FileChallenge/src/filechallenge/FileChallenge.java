/*
 * This program provides a challenge for reading and writing data to a file.
 */
package filechallenge;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 * @author Youssef Ali
 */
public class FileChallenge {

    public static void main(String[] args) {
       File inputFile = new File("menuNoPrices.txt");
       File outputFile = new File("menuWithPrices.txt");
       try{
           Scanner in = new Scanner(inputFile);
           Scanner in2 = new Scanner(System.in);
           PrintWriter out = new PrintWriter(outputFile);
           while(in.hasNextLine()){
               String item = in.nextLine();
               System.out.println("What is the price of this item: " + item + " ?");
               double price = in2.nextDouble();
               out.println(item + "\t$" + price);
           }
           out.close();
       }
       catch(Exception e){
           System.out.println("File not found!");
           System.out.println(e);
       }
    }
    
}
