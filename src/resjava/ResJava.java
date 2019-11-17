
package resjava;

import customerPackage.CustomerRegistration;
import java.util.Scanner;

public class ResJava {
    
    public static void main(String[] args) 
    {
        optionSelection();
    }
    
    private static void optionSelection()
    {
        System.out.println("Choose any of the options");
        System.out.println("1: Customer Registration");
        System.out.println("2. Restaurant Registration");
        System.out.println("3. Order a food in Restaurant as Customer");
        System.out.println("4. Order from Customer as Restaurant");
        System.out.println("5. Add Product as Restaurant");
        System.out.println("6. Nearest Restaurant");
        System.out.print("Select: ");
        
        
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt())
        {
            breakCommandLine();
            int choose = scanner.nextInt();
            switch(choose)
            {
                case 1:
                    breakCommandLine();
                    System.out.println("Customer Registration");
                    CustomerRegistration custRes = new CustomerRegistration();
                    custRes.Registration();
                    break;
                case 2:
                    breakCommandLine();
                    System.out.println("Restaurant Registration");
                    break;
                case 3:
                    breakCommandLine();
                    System.out.println("Order a food in Restaurant as Customer");
                    break;
                case 4:
                    breakCommandLine();
                    System.out.println("Order from Customer as Restaurant");
                    break;
                case 5:
                    breakCommandLine();
                    System.out.println("Add Product as Restaurant");
                    break;
                case 6:
                    breakCommandLine();
                    System.out.println("Nearest Restaurant");
                    break;
                default:
                    breakCommandLine();
                    System.out.println("Invalid input");
                    optionSelection();
                break;
            }
       }
       else
       {
           breakCommandLine();
           System.out.println("Output should be a number");
           System.out.println("Want to continue? Y - yes and N - no!");
           Scanner stringScan = new Scanner(System.in);
           String cont = stringScan.nextLine();
           switch(cont)
           {
               case "y":
                   breakCommandLine();
                   optionSelection();
                   break;
               case "Y":
                   breakCommandLine();
                   optionSelection();
                   break;
               case "n":
                   breakCommandLine();
                   System.exit(0);
                   break;
               case "N":
                   breakCommandLine();
                   System.exit(0);
                   break;
           }
       }
    }
    
    public static void breakCommandLine()
    {
        for(int repeat = 0; repeat < 50; repeat++)
        {
            System.out.println();
        }
    }
}

