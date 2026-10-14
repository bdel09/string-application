package src.main.com.pluralsight.VariableApp;
public class VariableApp {
    public static void main(String[] args) {
        String color;
        int year;
        String middle_initial;
        boolean has_pets;
        String message;
        //1b
        color = "purple";
        year = 2026;
        middle_initial = "M";
        has_pets = true;
        message = "Have a Nice Day!";
        System.out.println("The first answer is:" + color);
        System.out.println("The second answer is:" + year);
        System.out.println("The third answer is:" + middle_initial);
        System.out.println("The fourth answer is:" + has_pets);
        System.out.println("The fifth answer is:" + message);
        //1c
        int days = 7;
        double price = 4.99;
        String letter = "B";
        boolean is_raining = true;
        //Format answer
        String Answer = "There are" + days + "in a week." + "The price of coffee is" + price + ", and my favorite letter is" + letter + "and status of rainfall is:" + is_raining + ".";
        System.out.println(Answer);
    }

}
