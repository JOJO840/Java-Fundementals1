package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Multiline comment
        This is Java Fundementals:
            Java Strings
            • Often refered to as the ninth primitive.
            • Its NOT a primitive. All Strings are objects.
            • Often treated as primitives
            • Its a sequence of characters.
            • Notice the capital ’S’ in String.
            -------------------------------------------------------------------------------------------------------------
            Primitive data types
            • Java has eight primitive datatypes.
            • They are used for storing data in memory.
            • What type of data they can store depends on the datatype.
            These are the primitive datatypes in Java:
            byte, short, int, long, float, double, boolean, char
        */
        //---------------------------------------------------------------------------------------------------------------

        /* .concat example
        Immutable. (Not able to change)
        * Strings are immutable. Which means they don’t change (mutate)
        * The method **does not modify** the original `String` object because
        `String` in Java is **immutable**.
        Instead, it returns a new `String` object with the concatenated value.
        */
        String name = "Josip";
        name.concat(" Johansson");
        System.out.println(name);
        name = name.concat(" Johansson");
        System.out.println(name);
        /*
                **What happens here**:
        - The method `name.concat(" Johansson")` combines the value of `name` (`"Josip"`) with the string `" Johansson"`, resulting in the new string `"Josip Johansson"`.
        - However, since the result of `concat` is not assigned to a new variable or stored back in `name`, it is discarded after execution.
        - The original value of `name` remains `"Josip"`.
        */
        //---------------------------------------------------------------------------------------------------------------

        //trying boolean equation.
        int sif1 = 1 + 5 + 4;
        int sif2 = 5 + 4 + 1;
        boolean res = sif1 == sif2;
        System.out.println("is res equal? true or false: " + res);

        char letter = 'a';
        char letter2 = 'A';
        boolean isNotEqual = letter != letter2;
        System.out.println("is isNotEqual equal? true or false: " + isNotEqual);

        // comparison operator
        float f1 = 1.3f;
        float f2 = 1.1f;
        System.out.println("is f1 bigger than f2: " + (f1 > f2));

        // modulus
        System.out.println("10 % 3 > 1 = " + (10 % 3 > 1));
        System.out.println(10 % 3);


        //Testing Scanner method and if else!
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String input = scanner.nextLine();
        System.out.println("Hello " + input);

        if (input.equals(name)) {
            System.out.println("it works!");
        } else {
            System.out.println("wrong name!");
        }
        // Booleans and scanner input, also if else
        Scanner scanner2 = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("age? ");
            int age = scanner2.nextInt();

            if (age >= 18) {
                System.out.println("You can drive!");
            } else {
                System.out.println("You can not drive!");
            }
            break;

        }
        // do while
        int number = 1;
        do {
            number++;
        } while (number != 0 && number < 5);
        System.out.println(number);

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World " + i);
            while (i < 5) {
                System.out.println("in loop " + i);
                i++;
            }
        }
        // for each loop find the highest number in array
        int[] numbers = {1, 5, 34, 2532, 3, 552, 5};
        int max = 0;
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println(max);
        Scanner scanner4 = new Scanner(System.in);
        String input2 = "";

        boolean isTrue2 = true;
        while (isTrue2) {
            System.out.println("Hello! Enter some text");
            System.out.print("> ");
            input2 = scanner4.nextLine();
            System.out.println("You typed in " + input2);
            System.out.println("Continue? (y/n)");
            input = scanner.nextLine();

            if (input.equals("n")) {
                break;
            }
        }

        //  Here we are calling the method printCar() from Car class.
        printCar();

        // creating an object of the Person class
        Person person1 = new Person();
        person1.setName("Josip");
        person1.setAge(25);
        person1.setGender("Male");
        person1.setMarried(true);
        person1.setDrivingLicenseType('A');

        person1.printPerson();

    } //Main Paragraph

        /* Methods cant be written inside a method, so this method has to be outside main method!
        */
    public static void printCar() {
        System.out.println("Hello World");
        System.out.println(Car.carBrand("BMW"));
        System.out.println(Car.regNumber("ABC123"));
        System.out.println(Car.maxSpeed(100));
        System.out.println(Car.ownerName("Josip"));
        System.out.println(Car.carColor("Blue"));
    }


}

