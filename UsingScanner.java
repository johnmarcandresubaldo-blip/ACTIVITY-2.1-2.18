// John Marc Ubaldo
// BSIT Netsec 1-1

import java.util.Scanner;
public class UsingScanner {
    public static void main(String[] args) (
        // Create Scanner Object
        Scanner scanner = new Scanner(System.in)
        System.out.println(“Enter first name: “);
        String firstname = scanner.nextLine();
  
        System.out.println(“Enter middle name: “);
        String middlename = scanner.nextLine();
  
        System.out.println(“Enter last name: “);
        String lastname = scanner.nextLine();
  
        System.out.println(“Enter age: “);
        int age = scanner.nextInt();
  
        // Display Output
        System.out.println(“--Information--”);
        System.out.println(“First Name: ”+ firstname);
        System.out.println(“Middle Name: ”+ middlename);
        System.out.println(“Last Name: ”+ lastname);
        System.out.println(“Age: ”+ age);
        // Closing Scanner 
    }
}


What is the output of the program?
  --Information-
First Name: John Marc
Middle Name: Andres
Last Name: Ubaldo
Age: 18
