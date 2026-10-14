package src.main.com.pluralsight.VariableApp;
import java.util.Scanner;
//No need to import Math like you wowuld in cpp; it's built-in
public class MathApp {
    public static void main(String[] args) {
        //Write two variables to reresent Bob and Gary's salary
        double bobsalary, garysalary;
        //Read-in: user-inout with Scanner (word) = new Scanner(System.in);
        Scanner Comparison = new Scanner(System.in);
        System.out.println("Enter Bob's salary: ");
        //Using .nextDouble, note the salary of Bob
        bobsalary = Comparison.nextDouble();
        Scanner Contrast = new Scanner(System.in);
        System.out.println("Enter Gary's salary: ");
        garysalary = Contrast.nextDouble();
        //Now compare!
        double highest_salary = Math.max(garysalary, bobsalary);
        System.out.println("The Highest Salary is: "  + "$" + highest_salary + " .");
        //Q2 Find and display the smallest of two variables named carPrice and truckPrice
        double CarPrice, TruckPrice;
        Scanner Read = new Scanner(System.in);
        System.out.println("Enumerate your car price: ");
        CarPrice = Read.nextDouble();
        Scanner input = new Scanner(System.in);
        System.out.println("Enumerate your Truck price: ");
        TruckPrice = input.nextDouble();
        //Compare Again!
        double min_price = Math.min(CarPrice, TruckPrice);
        System.out.println("The cheaper vehicle: "  + "$" + min_price + " .");
        //Q3 Find and Display the area of a circle whose radius is 7.25
        //Note on area: Math.pi * math.pow(7.25, 2.00); fairly certan we must have doubles in the function
        double area = Math.PI * Math.pow(7.25, 2.00);
        //Shrtening the answer to 3 Decimal laces
        System.out.printf("The area of a circle with radius of 7.25 is: %.3f\n",  area);

        //Q4 Square root of 5.0
        double value = 5.0;
        double result = Math.sqrt(5.0);
        System.out.print("Given " + value + ", the result is " + result + " .");
        //Q5 Find the distance between the oints (5,10) and (85, 50)
        double x1 = 5, x2 = 85, y1 = 10, y2 = 50;
        double t_distance = Math.sqrt(Math.pow((x2 - x1),2.00) + Math.pow((y2 - y1), 2.00));
        System.out.print("The Total Distance is: " + t_distance);
        //Q6 Find and dislay the absolute value of a variable after being set to -3.8
        double v = -3.8;
        System.out.print("The absolute value of V is: " + Math.abs(v));
        //Q7: rint a random number between 0 and 1
        double random_value = Math.random();
        System.out.print(random_value);










    }
}
