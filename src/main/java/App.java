import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    private static final String FAHRENHEIT_ICON = "F";
    private static final String CELSIUS_ICON = "C";

    public static void main(String[] args) {
        String typeInput;
        int valueInput;
        int valueOutput;
        boolean isCelsius;

        Scanner reader = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        try {
            typeInput = reader.nextLine();
            if (typeInput.equalsIgnoreCase(CELSIUS_ICON)) {
                isCelsius = true;
            } else if (typeInput.equalsIgnoreCase(FAHRENHEIT_ICON)) {
                isCelsius = false;
            } else {
                System.out.println("Invalid input, please restart the program and try a different value.");
                System.out.println("Excepted values: \"" + CELSIUS_ICON + "\" or \" " + FAHRENHEIT_ICON + "\"");
                return;
            }
            System.out.print("Please enter the temperature in " + (!isCelsius ? "Celsius" : "Fahrenheit") + ": ");
            valueInput = reader.nextInt();
            valueOutput = isCelsius ? (valueInput - 32) * 5 / 9 : (valueInput * 9 / 5) + 32;
            System.out.println("The temperature in " + (isCelsius ? "Celsius" : "Fahrenheit") + " is " + valueOutput + ".");
        } catch (Exception e) {
            System.out.println("Invalid input, please restart the program and try a different value.");
        }
    }
}
