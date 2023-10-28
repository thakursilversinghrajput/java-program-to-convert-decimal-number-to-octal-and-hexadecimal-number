import java.util.Scanner; 
 
public class DecimalToOctalHexadecimal { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
          // Prompt the user for a decimal number 
          System.out.print("Enter a decimal number: "); 
          int decimalNumber = scanner.nextInt();
              // Convert to octal and hexadecimal 
        String octalNumber = Integer.toOctalString(decimalNumber); 
        String hexadecimalNumber = Integer.toHexString(decimalNumber);
         // Display the results 
         System.out.println("Decimal: " + decimalNumber); 
         System.out.println("Octal: " + octalNumber); 
         System.out.println("Hexadecimal: " + hexadecimalNumber);
         scanner.close();
    }
}