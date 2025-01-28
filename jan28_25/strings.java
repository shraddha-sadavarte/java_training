package jan28_25;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // name, address, age, blood group, phone number, email
        String name, add, bg, age, phone, email;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        if (name.split(" ").length < 2) {
            System.out.println("Please enter a full name (first and last name).");
            return;
        }

        System.out.println("Enter age: ");
        age = sc.next();
        if (!age.matches("\\d{1,3}")) {
            System.out.println("Age must be a valid number (1-3 digits).");
            return;
        }

        System.out.println("Enter address: ");
        add = sc.nextLine();
        add = sc.nextLine();
        if (!add.matches(".*[a-zA-Z]+.*") || !add.matches(".*\\d+.*")) {
            System.out.println("Address must contain both letters and numbers.");
            return;
        }

        System.out.println("Enter phone number: ");
        phone = sc.next();
        if (!phone.matches("\\d{10}")) {
            System.out.println("Phone number must contain 10 digits.");
            return;
        }

        System.out.println("Enter blood group: ");
        bg = sc.next();
        if (!bg.matches("^(A|B|AB|O)[+-]$")) {
            System.out.println("Blood group must be one of the following: A+, A-, B+, B-, AB+, AB-, O+, O-.");
            return;
        }

        System.out.println("Enter email: ");
        email = sc.next();
        if (!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,7}$")) {
            System.out.println("Enter a valid email address.");
            return;
        }

        // If all inputs are valid
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + add);
        System.out.println("Phone number: " + phone);
        System.out.println("Blood Group: " + bg);
        System.out.println("Email: " + email);

        sc.close(); // Close the scanner
    }
}
