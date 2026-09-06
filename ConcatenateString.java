// John Marc Ubaldo
// BSIT Netsec 1-1

import  java.util.Scanner;
public class ConcatenateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(“Enter a freinds name: ”);
        String name = scanner.nextLine();
      
        System.out.print(“Enter favorite color:  ”);
        String color = scanner.nextLine();
      
        System.out.print(“Enter favorite food:  ”);
        String food = scanner.nextLine();
      
        System.out.print(“Enter favorite animal:  ”);
        String animal = scanner.nextLine()

       // Display Concatenate into sentence
       System.out.println(“I had a dream that  ” + name + “ ate a ” + color+  “ “  + animal   + “ and said it tasted like ” + food + “!”);
    }
}

 What is the output of the program? 
 I had a dream that Jake ate a blue dog and said it tasted like humburger!
