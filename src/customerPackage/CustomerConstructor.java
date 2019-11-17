
package customerPackage;

public class CustomerConstructor 
{
    private int idUser;
    private String firstName, lastName, age, emailAddress, password, latitude, longitude;
    
    //Setter
    public void Customer(int idUser,
            String firstName, 
            String lastName, 
            String age, 
            String emailAddress, 
            String password,
            String latitude,
            String longitude)
    {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.emailAddress = emailAddress;
        this.password = password;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    //Getter
    public int getIdUser() {
        return idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
    
}
