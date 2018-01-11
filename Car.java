
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Car
{
    private String name;
    private int carYear;
    public static int totalCars;
    Scanner scan = new Scanner(System.in);
    public Car(String nm, int yr){
        this.name= nm;
        this.carYear=yr; 
    }
    public int getcarYear(){
        return this.carYear;
    }
    public String name(){
        return this.name;
    }
    public String toString(){
        return "the cars make is " + this.name;
    }
}
