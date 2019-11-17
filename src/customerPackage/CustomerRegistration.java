
package customerPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import resjava.ResJava;

public class CustomerRegistration 
{
    private int idUser;
    private String firstName, lastName, age, emailAddress, password, latitude, longitude;
    Scanner scanner = new Scanner(System.in);
    
    private CustomerConstructor custCon = new CustomerConstructor();
    private final String filepath = "D:\\Users\\Coroy\\Documents\\NetBeansProjects\\resJava\\csvdatabase\\registration.csv";
    
    public void Registration()
    {
        
        System.out.print("Enter a First Name: ");
        firstName = scanner.nextLine();
        
        System.out.print("Enter a Last Name: ");
        lastName = scanner.nextLine();
        
        System.out.print("Enter a Age: ");
        age = scanner.nextLine();

        System.out.print("Enter a Email Address: ");
        emailAddress = scanner.nextLine();
        
        System.out.print("Enter a Password: ");
        password = scanner.nextLine();
        
        System.out.print("enter a location latitude: ");
        latitude = scanner.nextLine();
        
        System.out.print("Enter a location longitude: ");
        longitude = scanner.nextLine();
        
        idUser = (int)(Math.random() * 10000000 + 1);
        
        System.out.print("Do you want to continue to register?: ");
        String cont = scanner.nextLine();
        switch(cont)
        {
            case "y":
                breakCommandLine();
                checkInput();
                custCon.Customer(idUser, firstName, lastName, age, emailAddress, password, latitude, longitude);
                writeDataToCSVFile(filepath);
                break;
            case "n":
                breakCommandLine();
                ResJava.main(null);
                break;
            default:
                breakCommandLine();
                System.out.println("Invalid output!");
                Registration();
                break;
        }
    }
    
    private void writeDataToCSVFile(String filepath)
    {
        try 
        {
            FileWriter fileWriter = new FileWriter(filepath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            try (PrintWriter printWriter = new PrintWriter(bufferedWriter)) {
                printWriter.println(
                        custCon.getIdUser()     + ","+
                                custCon.getFirstName()  + ","+
                                custCon.getLastName()   + ","+
                                custCon.getAge()        + ","+
                                custCon.getEmailAddress() +","+
                                custCon.getPassword()   + ","+
                                custCon.getLatitude()   + ","+
                                custCon.getLongitude()  + ","
                );
                printWriter.flush();
            }
            System.out.println("Sucessfully Registered");
            System.out.println();
            
            ResJava.main(null);
        }
        catch (IOException e)
        {
            System.out.println("Error to save file: " +e);
        }
    }
    
    public void breakCommandLine()
    {
        for(int repeater = 0; repeater < 50; repeater++)
        {
            System.out.println();
        }
    }
    
    public void checkInput()
    {
        breakCommandLine();
        System.out.println("Missing input(s)");
        System.out.println();
        if(firstName.isEmpty())
        {
            System.out.print("Enter a First Name: ");
            firstName = scanner.nextLine();
        }
        if(lastName.isEmpty())
        {
            System.out.print("Enter a Last Name: ");
            lastName = scanner.nextLine();
        }
        if(age.isEmpty())
        {
            System.out.print("Enter a Age: ");
            age = scanner.nextLine();
        }
        if(emailAddress.isEmpty())
        {
            System.out.print("Enter a Email Address: ");
            emailAddress = scanner.nextLine();
        }
        if(password.isEmpty())
        {
            System.out.print("Enter a Password: ");
            password = scanner.nextLine();
        }
        if(latitude.isEmpty())
        {
            System.out.print("enter a location latitude: ");
            latitude = scanner.nextLine();
        }
        if(longitude.isEmpty())
        {
            System.out.print("Enter a location longitude: ");
            longitude = scanner.nextLine();
        }
        
    }
}
