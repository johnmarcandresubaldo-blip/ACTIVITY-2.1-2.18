// John Marc Ubaldo
// BSIT Netsec 1-1

import java.util.Scanner;
public class ScanAndConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade in Java: ");
        String java = scanner.nextLine();
      
        System.out.print("Enter in grade C++: ");
        String cpp = scanner.nextLine();
      
        System.out.print("Enter in grade C#: ");
        String csharp = scanner.nextLine();
      
        double average = (Double.parseDouble(java) +Double.parseDouble(cpp)
                + Double.parseDouble(csharp))/ 3;
      
       System.out.println("Java: " + java);
       System.out.println("C++: " + cpp);
       System.out.println("C#: " + csharp);
       System.out.println("Total Average:" + average);
   }
}

What is the output of the program?
  Enter grade in Java: 80
  Enter in grade C++: 79
  Enter in grade C#: 81
  Java: 80
  C++: 79
  C#: 81
  Total Average:80.0
